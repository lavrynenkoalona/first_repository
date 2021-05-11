package L18HW17;

import L18HW17.Auto.MessageType;
import L18HW17.Model.Message;

public class UnmarshallingAutomatically {
    public static void main(String[] args) {
            //Write program which unmarshall, change values of 3 different xml elements on different levels
            // and marshall to new xml file.
            //Work with 2 xml file. Create models which will handle both xml files.
            // Try to create models using xjc tool.

                String pathname1 = "C:\\QA autmation\\src\\L18HW17\\Resorses\\SecondExample.xml";
                String name = "C:\\QA autmation\\src\\L18HW17\\Resorses\\MarshallingResult.xml";
                MessageType message = XmlUtil.unmarshalling(pathname1);
                XmlUtil.marshalling(message, name);
            }
        }


