package pracownia.introduction;

import org.apache.log4j.Logger;

public class HelloWorld {

    static final Logger log = Logger.getLogger(HelloWorld.class);
    public static void main(String [ ] args) {
        System.out.println("Hello World");
        log.info("message");
    }
}