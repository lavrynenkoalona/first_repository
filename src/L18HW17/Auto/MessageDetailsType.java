//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.08 at 11:27:16 PM EEST 
//


package L18HW17.Auto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MessageDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatatypeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OriginalFilename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDetailsType", propOrder = {
    "messageId",
    "datatype",
    "type",
    "datatypeDescription",
    "originalFilename"
})
public class MessageDetailsType {

    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "Datatype", required = true)
    protected String datatype;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "DatatypeDescription", required = true)
    protected String datatypeDescription;
    @XmlElement(name = "OriginalFilename", required = true)
    protected String originalFilename;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatatype() {
        return datatype;
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatatype(String value) {
        this.datatype = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the datatypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatatypeDescription() {
        return datatypeDescription;
    }

    /**
     * Sets the value of the datatypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatatypeDescription(String value) {
        this.datatypeDescription = value;
    }

    /**
     * Gets the value of the originalFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalFilename() {
        return originalFilename;
    }

    /**
     * Sets the value of the originalFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalFilename(String value) {
        this.originalFilename = value;
    }

    @Override
    public String toString() {
        return "MessageDetailsType{" +
                "messageId='" + messageId + '\'' +
                ", datatype='" + datatype + '\'' +
                ", type='" + type + '\'' +
                ", datatypeDescription='" + datatypeDescription + '\'' +
                ", originalFilename='" + originalFilename + '\'' +
                '}';
    }
}
