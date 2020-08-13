
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
 *         &lt;element name="BALANCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELETE_LINKED_MSISDNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXTRA_EDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "balancetype",
    "deletelinkedmsisdns",
    "extraedr",
    "wallettype"
})
@XmlRootElement(name = "CCSCD1_DEL")
public class CCSCD1DEL {

    @XmlElement(name = "AUTH")
    protected String auth;
    protected String username;
    protected String password;
    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "BALANCE_TYPE")
    protected String balancetype;
    @XmlElement(name = "DELETE_LINKED_MSISDNS")
    protected String deletelinkedmsisdns;
    @XmlElement(name = "EXTRA_EDR")
    protected String extraedr;
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
     * Gets the value of the deletelinkedmsisdns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELETELINKEDMSISDNS() {
        return deletelinkedmsisdns;
    }

    /**
     * Sets the value of the deletelinkedmsisdns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELETELINKEDMSISDNS(String value) {
        this.deletelinkedmsisdns = value;
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
