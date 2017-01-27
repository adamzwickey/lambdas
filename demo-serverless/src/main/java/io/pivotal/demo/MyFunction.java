package io.pivotal.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MyFunction {

    static Logger LOG = LoggerFactory.getLogger(MyFunction.class);

    @Autowired
    private ExampleContoller _contoller;

    public String upper(String input) {
        LOG.info("Executing upper() method");
        return input.toUpperCase();
    }

    public String reverse(String input) {
        LOG.info("Executing upper() method");
        return _contoller.reverse(input);
    }

}
