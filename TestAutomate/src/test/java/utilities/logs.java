package utilities;

import org.apache.log4j.Logger;

public class logs {

    private static Logger log = Logger.getLogger(logs.class.getName());


    public static void info(String message){
        log.info(message);
    }
}
