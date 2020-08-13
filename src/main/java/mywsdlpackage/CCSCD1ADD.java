
package mywsdlpackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="AUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROVIDER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BYPASS_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARGING_DOMAIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREDIT_LIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="END_MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXTRA_EDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INITIAL_STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIMIT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LW_ACCOUNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LW_MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAX_CONCURRENT_ACCESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="START_MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRACKING_DOMAIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WALLET_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WALLET_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "auth",
    "username",
    "password",
    "provider",
    "product",
    "accountnumber",
    "bypassnumber",
    "chargingdomain",
    "creditlimit",
    "currency",
    "endmsisdn",
    "extraedr",
    "initialstate",
    "language",
    "limittype",
    "lwaccountnumber",
    "lwmsisdn",
    "maxconcurrentaccess",
    "msisdn",
    "pin",
    "startmsisdn",
    "trackingdomain",
    "walletreference",
    "wallettype"
})
@XmlRootElement(name = "CCSCD1_ADD")
public class CCSCD1ADD {

    @XmlElement(name = "AUTH")
    protected String auth;
    protected String username;
    protected String password;
    @XmlElement(name = "PROVIDER", required = true)
    protected String provider;
    @XmlElement(name = "PRODUCT", required = true)
    protected String product;
    @XmlElement(name = "ACCOUNT_NUMBER")
    protected String accountnumber;
    @XmlElement(name = "BYPASS_NUMBER")
    protected String bypassnumber;
    @XmlElement(name = "CHARGING_DOMAIN")
    protected String chargingdomain;
    @XmlElement(name = "CREDIT_LIMIT")
    protected String creditlimit;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "END_MSISDN")
    protected String endmsisdn;
    @XmlElement(name = "EXTRA_EDR")
    protected String extraedr;
    @XmlElement(name = "INITIAL_STATE")
    protected String initialstate;
    @XmlElement(name = "LANGUAGE")
    protected String language;
    @XmlElement(name = "LIMIT_TYPE")
    protected String limittype;
    @XmlElement(name = "LW_ACCOUNT_NUMBER")
    protected String lwaccountnumber;
    @XmlElement(name = "LW_MSISDN")
    protected String lwmsisdn;
    @XmlElement(name = "MAX_CONCURRENT_ACCESS")
    protected String maxconcurrentaccess;
    @XmlElement(name = "MSISDN")
    protected String msisdn;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "START_MSISDN")
    protected String startmsisdn;
    @XmlElement(name = "TRACKING_DOMAIN")
    protected String trackingdomain;
    @XmlElement(name = "WALLET_REFERENCE")
    protected String walletreference;
    @XmlElement(name = "WALLET_TYPE")
    protected String wallettype;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTH() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTH(String value) {
        this.auth = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVIDER() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVIDER(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCT() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCT(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTNUMBER() {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTNUMBER(String value) {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the bypassnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBYPASSNUMBER() {
        return bypassnumber;
    }

    /**
     * Sets the value of the bypassnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBYPASSNUMBER(String value) {
        this.bypassnumber = value;
    }

    /**
     * Gets the value of the chargingdomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARGINGDOMAIN() {
        return chargingdomain;
    }

    /**
     * Sets the value of the chargingdomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARGINGDOMAIN(String value) {
        this.chargingdomain = value;
    }

    /**
     * Gets the value of the creditlimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITLIMIT() {
        return creditlimit;
    }

    /**
     * Sets the value of the creditlimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITLIMIT(String value) {
        this.creditlimit = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the endmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDMSISDN() {
        return endmsisdn;
    }

    /**
     * Sets the value of the endmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDMSISDN(String value) {
        this.endmsisdn = value;
    }

    /**
     * Gets the value of the extraedr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTRAEDR() {
        return extraedr;
    }

    /**
     * Sets the value of the extraedr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTRAEDR(String value) {
        this.extraedr = value;
    }

    /**
     * Gets the value of the initialstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINITIALSTATE() {
        return initialstate;
    }

    /**
     * Sets the value of the initialstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINITIALSTATE(String value) {
        this.initialstate = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the limittype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIMITTYPE() {
        return limittype;
    }

    /**
     * Sets the value of the limittype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIMITTYPE(String value) {
        this.limittype = value;
    }

    /**
     * Gets the value of the lwaccountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWACCOUNTNUMBER() {
        return lwaccountnumber;
    }

    /**
     * Sets the value of the lwaccountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWACCOUNTNUMBER(String value) {
        this.lwaccountnumber = value;
    }

    /**
     * Gets the value of the lwmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWMSISDN() {
        return lwmsisdn;
    }

    /**
     * Sets the value of the lwmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWMSISDN(String value) {
        this.lwmsisdn = value;
    }

    /**
     * Gets the value of the maxconcurrentaccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXCONCURRENTACCESS() {
        return maxconcurrentaccess;
    }

    /**
     * Sets the value of the maxconcurrentaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXCONCURRENTACCESS(String value) {
        this.maxconcurrentaccess = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the startmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTMSISDN() {
        return startmsisdn;
    }

    /**
     * Sets the value of the startmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTMSISDN(String value) {
        this.startmsisdn = value;
    }

    /**
     * Gets the value of the trackingdomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRACKINGDOMAIN() {
        return trackingdomain;
    }

    /**
     * Sets the value of the trackingdomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRACKINGDOMAIN(String value) {
        this.trackingdomain = value;
    }

    /**
     * Gets the value of the walletreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWALLETREFERENCE() {
        return walletreference;
    }

    /**
     * Sets the value of the walletreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWALLETREFERENCE(String value) {
        this.walletreference = value;
    }

    /**
     * Gets the value of the wallettype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWALLETTYPE() {
        return wallettype;
    }

    /**
     * Sets the value of the wallettype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWALLETTYPE(String value) {
        this.wallettype = value;
    }

}
