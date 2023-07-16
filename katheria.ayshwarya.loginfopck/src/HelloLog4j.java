import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Date;


public class HelloLog4j {
    static Logger log = Logger.getLogger(HelloLog4j.class);

    public static void main(String [] args){
        Date d = new Date();
        System.setProperty("current.date",d.toString().replace(":","_").replace(" ","_"));

        PropertyConfigurator.configure("./log4j.properties");

        System.out.println("Hello world!!!!!");
        log.debug("This is debug log");
        log.info("This is info log");
        log.error("This is error log");
        log.warn("This is warn log");


    }



}
