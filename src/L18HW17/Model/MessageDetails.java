package L18HW17.Model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class MessageDetails {

    @XmlElement(name="MessageId")
    private Integer messageId;
    @XmlElement(name="Datatype")
    private String dataType;
    @XmlElement(name="Type")
    private String type;
    @XmlElement(name="DatatypeDescription")
    private String datatypeDescription;
    @XmlElement(name="OriginalFilename")
    private String originalFilename;


    public MessageDetails() {
    }

    public MessageDetails(Integer messageId, String dataType, String type, String datatypeDescription, String originalFilename) {
        this.messageId = messageId;
        this.dataType = dataType;
        this.type = type;
        this.datatypeDescription = datatypeDescription;
        this.originalFilename = originalFilename;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDatatypeDescription() {
        return datatypeDescription;
    }

    public void setDatatypeDescription(String datatypeDescription) {
        this.datatypeDescription = datatypeDescription;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    @Override
    public String toString() {
        return "MessageDetails{" +
                "messageId=" + messageId +
                ", dataType='" + dataType + '\'' +
                ", type='" + type + '\'' +
                ", datatypeDescription='" + datatypeDescription + '\'' +
                ", originalFilename='" + originalFilename + '\'' +
                '}';
    }
}
