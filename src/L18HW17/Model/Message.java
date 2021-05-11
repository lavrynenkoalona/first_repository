package L18HW17.Model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Message")
@XmlAccessorType(XmlAccessType.FIELD)

public class Message {
    @XmlAttribute(name="type")
    private String type;
    @XmlElement(name="DateTime")
    private String dateTime;
    @XmlElement(name="CustomerId")
    private String customerId;
    @XmlElement(name="CompanyName")
    private String companyName;
    @XmlElement(name="MessageDetails")
    private MessageDetails messageDetails;
    @XmlElement(name="Issues")
    private Issues issues;

    public Message() {
    }

    public Message(String type, String text,String dateTime, String customerId, String companyName, MessageDetails messageDetails, Issues issues) {
        this.dateTime = dateTime;
        this.customerId = customerId;
        this.companyName = companyName;
        this.messageDetails = messageDetails;
        this.issues = issues;
        this.type = type;

    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public MessageDetails getMessageDetails() {
        return messageDetails;
    }

    public void setMessageDetails(MessageDetails messageDetails) {
        this.messageDetails = messageDetails;
    }

    public Issues getIssues() {
        return issues;
    }

    public void setIssues(Issues issues) {
        this.issues = issues;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




    @Override
    public String toString() {
        return "Message{" +
                "type='" + type + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", customerId='" + customerId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", messageDetails=" + messageDetails +
                ", issues=" + issues +
                '}';
    }
}
