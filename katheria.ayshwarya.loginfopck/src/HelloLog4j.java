import org.apache.log4j.Logger;


public class HelloLog4j {
    static Logger log = Logger.getLogger(HelloLog4j.class);

    public static void main(String [] args){

        System.out.println("Hello world!!!!!");
        log.debug("This is debug log");
        log.info("This is info log");
        log.error("This is error log");
        log.warn("This is warn log");


    }



}
