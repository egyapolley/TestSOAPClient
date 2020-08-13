
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
 *         &lt;element name="MSISDN1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MSISDN2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WALLET_TYPE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WALLET_TYPE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXTRA_EDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "msisdn1",
    "msisdn2",
    "wallettype1",
    "wallettype2",
    "extraedr"
})
@XmlRootElement(name = "CCSCD1_MSW")
public class CCSCD1MSW {

    @XmlElement(name = "AUTH")
    protected String auth;
    protected String username;
    protected String password;
    @XmlElement(name = "MSISDN1", required = true)
    protected String msisdn1;
    @XmlElement(name = "MSISDN2", required = true)
    protected String msisdn2;
    @XmlElement(name = "WALLET_TYPE1")
    protected String wallettype1;
    @XmlElement(name = "WALLET_TYPE2")
    protected String wallettype2;
    @XmlElement(name = "EXTRA_EDR")
    protected String extraedr;

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
     * Gets the value of the msisdn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN1() {
        return msisdn1;
    }

    /**
     * Sets the value of the msisdn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN1(String value) {
        this.msisdn1 = value;
    }

    /**
     * Gets the value of the msisdn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN2() {
        return msisdn2;
    }

    /**
     * Sets the value of the msisdn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN2(String value) {
        this.msisdn2 = value;
    }

    /**
     * Gets the value of the wallettype1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWALLETTYPE1() {
        return wallettype1;
    }

    /**
     * Sets the value of the wallettype1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWALLETTYPE1(String value) {
        this.wallettype1 = value;
    }

    /**
     * Gets the value of the wallettype2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWALLETTYPE2() {
        return wallettype2;
    }

    /**
     * Sets the value of the wallettype2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWALLETTYPE2(String value) {
        this.wallettype2 = value;
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

}
