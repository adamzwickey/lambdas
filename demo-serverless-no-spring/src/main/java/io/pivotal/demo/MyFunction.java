package io.pivotal.demo;

import org.apache.log4j.Logger;

public class MyFunction {

    static Logger LOG = Logger.getLogger(MyFunction.class);

    public MyFunction() {
        LOG.info("Initializing Application...");
    }

    public String upper(Request input) {
        LOG.info("Executing upper() method");
        return input.getMessage().toUpperCase();
    }

    public String reverse(Request input) {
        LOG.info("Executing upper() method");
        return new ExampleContoller().reverse(input.getMessage());
    }

}
