
package mywsdlpackage;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CCSCD1_MSWFault", targetNamespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi")
public class CCSCD1MSWFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CCSCD1MSWFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CCSCD1MSWFault_Exception(String message, CCSCD1MSWFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CCSCD1MSWFault_Exception(String message, CCSCD1MSWFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: mywsdlpackage.CCSCD1MSWFault
     */
    public CCSCD1MSWFault getFaultInfo() {
        return faultInfo;
    }

}
