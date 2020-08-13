package mypackage;

import com.sun.xml.internal.ws.client.BindingProviderProperties;
import model.Balance;
import mywsdlpackage.CCSCD1;
import mywsdlpackage.CCSCD1PortType;
import mywsdlpackage.CCSCD1QRY;
import mywsdlpackage.CCSCD1QRYResponse;
import utils.MainUtils;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        CCSCD1 ccscd1 = new CCSCD1();

        ArrayList<Balance> balances = new ArrayList<>();


        CCSCD1PortType ccscd1Port = ccscd1.getCCSCD1HttpSoap11Endpoint();
        Map<String, Object> requestContext = ((BindingProvider) ccscd1Port).getRequestContext();
        requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT,4000);
        requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT,2000);


        CCSCD1QRY ccscd1QRY = new CCSCD1QRY();
        ccscd1QRY.setMSISDN("233255000102");
        ccscd1QRY.setLISTTYPE("BALANCE");
        ccscd1QRY.setBALANCETYPE("ALL");
        ccscd1QRY.setUsername("admin");
        ccscd1QRY.setPassword("admin");

        try {
            CCSCD1QRYResponse ccscd1QRYResponse = ccscd1Port.ccscd1QRY(ccscd1QRY);
            List<JAXBElement<?>> authAndMSISDNAndACCOUNTNUMBER = ccscd1QRYResponse.getAUTHAndMSISDNAndACCOUNTNUMBER();
            for (JAXBElement<?> element: authAndMSISDNAndACCOUNTNUMBER) {
                if (element.getDeclaredType().getName().equals("mywsdlpackage.CCSCD1QRYResponse$BALANCES")){
                    JAXBElement<CCSCD1QRYResponse.BALANCES> jaxbElement = (JAXBElement<CCSCD1QRYResponse.BALANCES>) element;
                    CCSCD1QRYResponse.BALANCES balance = jaxbElement.getValue();
                    List<CCSCD1QRYResponse.BALANCES.BALANCEITEM> balanceitem = balance.getBALANCEITEM();
                    for (CCSCD1QRYResponse.BALANCES.BALANCEITEM balanceitem1:balanceitem) {
                        if (balanceitem1.getBALANCETYPENAME().endsWith("Data") ||balanceitem1.getBALANCETYPENAME().endsWith("Status")||balanceitem1.getBALANCETYPENAME().endsWith("Cash")){
                            Balance balance1 = new Balance();
                            balance1.setBalance_name(balanceitem1.getBALANCETYPENAME());
                            CCSCD1QRYResponse.BALANCES.BALANCEITEM.BUCKETS buckets = balanceitem1.getBUCKETS();
                            List<CCSCD1QRYResponse.BALANCES.BALANCEITEM.BUCKETS.BUCKETITEM> bucketitems = buckets.getBUCKETITEM();
                            if (bucketitems != null){
                                for (CCSCD1QRYResponse.BALANCES.BALANCEITEM.BUCKETS.BUCKETITEM bucketitem:bucketitems) {

                                    balance1.setValue(balance1.getValue() == null?bucketitem.getBUCKETVALUE():String.valueOf(Integer.parseInt(balance1.getValue())+Integer.parseInt(bucketitem.getBUCKETVALUE())));
                                    if (balance1.getExpiry() == null){
                                        balance1.setExpiry(bucketitem.getBUCKETEXPIRY());
                                    }else if (!MainUtils.isBefore(balance1.getExpiry(),bucketitem.getBUCKETEXPIRY())){
                                        balance1.setExpiry(bucketitem.getBUCKETEXPIRY());
                                    }

                                }
                                balance1.setExpiry(balance1.getExpiry() !=null?MainUtils.formatDate(balance1.getExpiry()):null);
                                balance1.setValue(balance1.getValue() != null?balance1.getValue():"0");
                                balances.add(balance1);

                            }


                        }

                    }
                    System.out.println(balances);
                }



            }


        } catch (Exception e) {
            System.out.println("Errror ===========");
            e.printStackTrace();
        }


    }



}
