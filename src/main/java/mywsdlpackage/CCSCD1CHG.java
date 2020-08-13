
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
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BALANCE_EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALANCE_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALANCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREDIT_LIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXTRA_EDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEW_MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WALLET_EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WALLET_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "msisdn",
    "balanceexpirydate",
    "balanceexpiry",
    "balancetype",
    "balance",
    "balmode",
    "creditlimit",
    "currency",
    "expmode",
    "extraedr",
    "language",
    "newmsisdn",
    "pin",
    "product",
    "status",
    "walletexpirydate",
    "walletexpiry",
    "walletreference",
    "wallettype"
})
@XmlRootElement(name = "CCSCD1_CHG")
public class CCSCD1CHG {

    @XmlElement(name = "AUTH")
    protected String auth;
    protected String username;
    protected String password;
    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "BALANCE_EXPIRY_DATE")
    protected String balanceexpirydate;
    @XmlElement(name = "BALANCE_EXPIRY")
    protected String balanceexpiry;
    @XmlElement(name = "BALANCE_TYPE")
    protected String balancetype;
    @XmlElement(name = "BALANCE")
    protected String balance;
    @XmlElement(name = "BALMODE")
    protected String balmode;
    @XmlElement(name = "CREDIT_LIMIT")
    protected String creditlimit;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "EXPMODE")
    protected String expmode;
    @XmlElement(name = "EXTRA_EDR")
    protected String extraedr;
    @XmlElement(name = "LANGUAGE")
    protected String language;
    @XmlElement(name = "NEW_MSISDN")
    protected String newmsisdn;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "PRODUCT")
    protected String product;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "WALLET_EXPIRY_DATE")
    protected String walletexpirydate;
    @XmlElement(name = "WALLET_EXPIRY")
    protected String walletexpiry;
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
     * Gets the value of the balanceexpirydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALANCEEXPIRYDATE() {
        return balanceexpirydate;
    }

    /**
     * Sets the value of the balanceexpirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALANCEEXPIRYDATE(String value) {
        this.balanceexpirydate = value;
    }

    /**
     * Gets the value of the balanceexpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALANCEEXPIRY() {
        return balanceexpiry;
    }

    /**
     * Sets the value of the balanceexpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALANCEEXPIRY(String value) {
        this.balanceexpiry = value;
    }

    /**
     * Gets the value of the balancetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALANCETYPE() {
        return balancetype;
    }

    /**
     * Sets the value of the balancetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALANCETYPE(String value) {
        this.balancetype = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALANCE() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALANCE(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the balmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALMODE() {
        return balmode;
    }

    /**
     * Sets the value of the balmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALMODE(String value) {
        this.balmode = value;
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
     * Gets the value of the expmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPMODE() {
        return expmode;
    }

    /**
     * Sets the value of the expmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPMODE(String value) {
        this.expmode = value;
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
     * Gets the value of the newmsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWMSISDN() {
        return newmsisdn;
    }

    /**
     * Sets the value of the newmsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWMSISDN(String value) {
        this.newmsisdn = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the walletexpirydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWALLETEXPIRYDATE() {
        return walletexpirydate;
    }

    /**
     * Sets the value of the walletexpirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWALLETEXPIRYDATE(String value) {
        this.walletexpirydate = value;
    }

    /**
     * Gets the value of the walletexpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWALLETEXPIRY() {
        return walletexpiry;
    }

    /**
     * Sets the value of the walletexpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWALLETEXPIRY(String value) {
        this.walletexpiry = value;
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
