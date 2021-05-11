package L18HW17;

import L18HW17.Model.Message;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Unmarshalling {
    //Write program which unmarshall, change values of 3 different xml elements on different levels
    // and marshall to new xml file.
    //Work with 2 xml file. Create models which will handle both xml files.
    // Try to create models using xjc tool.
    public static void main(String[] args) {
        try{
            //getting the xml file to read
            File file = new File("C:\\QA autmation\\src\\L18HW17\\SecondExample.xml");
            //creating the JAXB context
            JAXBContext jContext = JAXBContext.newInstance(Message.class);
            //creating the unmarshall object
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            //calling the unmarshall method
            Message message=(Message) unmarshallerObj.unmarshal(file);
            System.out.println(message);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
