package io.pivotal.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

/**
 * Created by azwickey on 1/26/17.
 */
@Controller
public class ExampleContoller {

    static Logger LOG = LoggerFactory.getLogger(ExampleContoller.class);

    public String reverse(String input) {
        LOG.info("Executing method in spring contoller....");
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
