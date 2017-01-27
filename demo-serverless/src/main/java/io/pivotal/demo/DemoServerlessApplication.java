package io.pivotal.demo;

import com.amazonaws.services.lambda.runtime.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class DemoServerlessApplication {

	static Logger LOG = LoggerFactory.getLogger(DemoServerlessApplication.class);

	public String upper(Request input, Context c) {
		LOG.info("Executing Handle function...");
		MyFunction f = Spring.getBean(MyFunction.class);
		return f.upper(input.getMessage());
	}

	public String reverse(Request input, Context c) {
		LOG.info("Executing Handle function...");
		MyFunction f = Spring.getBean(MyFunction.class);
		return f.reverse(input.getMessage());
	}

	public static void main(String[] args) {
		LOG.info("Executing java main...");
		MyFunction f = Spring.getBean(MyFunction.class);
		LOG.info(f.upper(args[0]));
		LOG.info(f.reverse(args[0]));
	}
}
