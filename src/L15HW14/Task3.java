package L15HW14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Task3 {
    //Create program which read all pairs of values (more then 5 pairs)
    // from property file and print them in console in view of map.
    public static void main(String[] args) {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("config.properties");
            prop.load(input);
            System.out.println("db.host=" + prop.getProperty("db.host"));
            System.out.println("db.login=" + prop.getProperty("db.login"));
            System.out.println("db.password=" +  prop.getProperty("db.password"));
            System.out.println("base.url=" + prop.getProperty("base.url"));
            System.out.println("base.api.url=" + prop.getProperty("base.api.url"));
        } catch (IOException ex) {
            ex.printStackTrace(); }
        finally {if (input != null) {try {input.close();
        } catch (IOException e) {e.printStackTrace();}
        }
        }

    }
}
