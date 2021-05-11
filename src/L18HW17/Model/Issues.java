package L18HW17.Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)

public class Issues {
    @XmlElement(name="Issue")
    private List<Issue> issue;


    public Issues() {
    }

    public Issues(List<Issue> issue) {
        this.issue = issue;
    }

    public List<Issue> getIssue() {
        return issue;
    }


    public void setIssue(List<Issue> issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return "Issues{" +
                "issue=" + issue +
                '}';
    }
}
