package L18HW17.Model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Issue {
    @XmlAttribute(name="type")
    private String type;
    @XmlValue
    private String text;

    public Issue() {
    }

    public Issue(String type, String text) {
        this.type = type;
        this.text = text;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "type='" + type + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
