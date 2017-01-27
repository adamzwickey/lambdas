package io.pivotal.demo;


import org.apache.log4j.Logger;

/**
 * Created by azwickey on 1/26/17.
 */
public class ExampleContoller {

    static Logger LOG = Logger.getLogger(ExampleContoller.class);

    public String reverse(String input) {
        LOG.info("Executing method in spring contoller....");
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
