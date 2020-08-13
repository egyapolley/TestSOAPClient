
package mywsdlpackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="AUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERVICE_PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WALLET_EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALANCE_EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNRESERVED_BALANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INITIAL_BALANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALANCES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BALANCE_ITEM" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BALANCE_TYPE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BUCKETS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BUCKET_ITEM" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BUCKET_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="BUCKET_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LAST_RECHARGE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_CC_RECHARGE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_USE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_RECHARGE_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PREV_WALLET_EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PREV_BALANCE_EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PREV_BALANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_EXP_CREDIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTAL_EXP_CREDIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_EXP_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIRST_ACTIVATION_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_STATE_CHANGE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_STATE_CHANGE_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BYPASS_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WALLET_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARGING_DOMAIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRACKING_DOMAIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WALLET_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALANCE_OFFSET_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FREE_SWAPS_REMAINING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_SWAP_RESET_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authAndMSISDNAndACCOUNTNUMBER"
})
@XmlRootElement(name = "CCSCD1_QRYResponse")
public class CCSCD1QRYResponse {

    @XmlElementRefs({
        @XmlElementRef(name = "MSISDN", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FFD", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LAST_RECHARGE_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PREV_BALANCE_EXPIRY_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LAST_EXP_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "WALLET_REFERENCE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BYPASS_NUMBER", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FDN", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CURRENCY", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LAST_STATE_CHANGE_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "INITIAL_BALANCE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FREE_SWAPS_REMAINING", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LAST_STATE_CHANGE_REASON", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "WALLET_TYPE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BALANCE_EXPIRY_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BALANCE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BALANCES", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LAST_CC_RECHARGE_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LAST_USE_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PREV_WALLET_EXPIRY_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "STATUS", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CHARGING_DOMAIN", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CREATION_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LAST_RECHARGE_AMOUNT", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PREV_BALANCE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FIRST_ACTIVATION_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TOTAL_EXP_CREDIT", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LAST_SWAP_RESET_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TRACKING_DOMAIN", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PRODUCT", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FFN", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LANGUAGE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SERVICE_PROVIDER", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BALANCE_OFFSET_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UNRESERVED_BALANCE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LAST_EXP_CREDIT", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTH", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "WALLET_EXPIRY_DATE", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACCOUNT_NUMBER", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CUG", namespace = "http://xmlns.oracle.com/communications/ncc/2009/05/15/pi", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> authAndMSISDNAndACCOUNTNUMBER;

    /**
     * Gets the value of the authAndMSISDNAndACCOUNTNUMBER property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authAndMSISDNAndACCOUNTNUMBER property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAUTHAndMSISDNAndACCOUNTNUMBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link CCSCD1QRYResponse.BALANCES }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAUTHAndMSISDNAndACCOUNTNUMBER() {
        if (authAndMSISDNAndACCOUNTNUMBER == null) {
            authAndMSISDNAndACCOUNTNUMBER = new ArrayList<JAXBElement<?>>();
        }
        return this.authAndMSISDNAndACCOUNTNUMBER;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BALANCE_ITEM" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BALANCE_TYPE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BUCKETS" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BUCKET_ITEM" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BUCKET_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="BUCKET_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "balanceitem"
    })
    public static class BALANCES {

        @XmlElement(name = "BALANCE_ITEM")
        protected List<CCSCD1QRYResponse.BALANCES.BALANCEITEM> balanceitem;

        /**
         * Gets the value of the balanceitem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the balanceitem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBALANCEITEM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CCSCD1QRYResponse.BALANCES.BALANCEITEM }
         * 
         * 
         */
        public List<CCSCD1QRYResponse.BALANCES.BALANCEITEM> getBALANCEITEM() {
            if (balanceitem == null) {
                balanceitem = new ArrayList<CCSCD1QRYResponse.BALANCES.BALANCEITEM>();
            }
            return this.balanceitem;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="BALANCE_TYPE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BUCKETS" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BUCKET_ITEM" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BUCKET_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="BUCKET_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "balancetypename",
            "buckets"
        })
        public static class BALANCEITEM {

            @XmlElement(name = "BALANCE_TYPE_NAME")
            protected String balancetypename;
            @XmlElement(name = "BUCKETS")
            protected CCSCD1QRYResponse.BALANCES.BALANCEITEM.BUCKETS buckets;

            /**
             * Gets the value of the balancetypename property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBALANCETYPENAME() {
                return balancetypename;
            }

            /**
             * Sets the value of the balancetypename property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBALANCETYPENAME(String value) {
                this.balancetypename = value;
            }

            /**
             * Gets the value of the buckets property.
             * 
             * @return
             *     possible object is
             *     {@link CCSCD1QRYResponse.BALANCES.BALANCEITEM.BUCKETS }
             *     
             */
            public CCSCD1QRYResponse.BALANCES.BALANCEITEM.BUCKETS getBUCKETS() {
                return buckets;
            }

            /**
             * Sets the value of the buckets property.
             * 
             * @param value
             *     allowed object is
             *     {@link CCSCD1QRYResponse.BALANCES.BALANCEITEM.BUCKETS }
             *     
             */
            public void setBUCKETS(CCSCD1QRYResponse.BALANCES.BALANCEITEM.BUCKETS value) {
                this.buckets = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="BUCKET_ITEM" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BUCKET_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="BUCKET_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "bucketitem"
            })
            public static class BUCKETS {

                @XmlElement(name = "BUCKET_ITEM")
                protected List<CCSCD1QRYResponse.BALANCES.BALANCEITEM.BUCKETS.BUCKETITEM> bucketitem;

                /**
                 * Gets the value of the bucketitem property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bucketitem property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBUCKETITEM().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CCSCD1QRYResponse.BALANCES.BALANCEITEM.BUCKETS.BUCKETITEM }
                 * 
                 * 
                 */
                public List<CCSCD1QRYResponse.BALANCES.BALANCEITEM.BUCKETS.BUCKETITEM> getBUCKETITEM() {
                    if (bucketitem == null) {
                        bucketitem = new ArrayList<CCSCD1QRYResponse.BALANCES.BALANCEITEM.BUCKETS.BUCKETITEM>();
                    }
                    return this.bucketitem;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="BUCKET_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="BUCKET_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "bucketvalue",
                    "bucketexpiry"
                })
                public static class BUCKETITEM {

                    @XmlElement(name = "BUCKET_VALUE")
                    protected String bucketvalue;
                    @XmlElement(name = "BUCKET_EXPIRY")
                    protected String bucketexpiry;

                    /**
                     * Gets the value of the bucketvalue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBUCKETVALUE() {
                        return bucketvalue;
                    }

                    /**
                     * Sets the value of the bucketvalue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBUCKETVALUE(String value) {
                        this.bucketvalue = value;
                    }

                    /**
                     * Gets the value of the bucketexpiry property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBUCKETEXPIRY() {
                        return bucketexpiry;
                    }

                    /**
                     * Sets the value of the bucketexpiry property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBUCKETEXPIRY(String value) {
                        this.bucketexpiry = value;
                    }

                }

            }

        }

    }

}
