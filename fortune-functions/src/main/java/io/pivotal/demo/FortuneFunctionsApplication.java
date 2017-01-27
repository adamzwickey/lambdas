package io.pivotal.demo;

import com.amazonaws.services.lambda.runtime.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class FortuneFunctionsApplication {

	static Logger LOG = LoggerFactory.getLogger(FortuneFunctionsApplication.class);

	private static ApplicationContext springContext = null;
	private static ApplicationContext getSpringContext() {
		if(springContext == null) {
			synchronized (ApplicationContext.class) {
				if(springContext == null) {
					springContext = SpringApplication.run(FortuneFunctionsApplication.class, new String[0]);
				}
			}
		}
		return springContext;
	};

	public static <T> T getBean(Class<T> clazz) {
		return getSpringContext().getBean(clazz);
	}

	public static void main(String[] args) {
		LOG.info("Executing java main...");
		springContext = SpringApplication.run(FortuneFunctionsApplication.class, new String[0]);
		LOG.info("Fortune: " + getBean(FortuneController.class).randomFortune());
	}

	//These are actual Functions exposed
	public Iterable<Fortune> fortunes(Context c) {
		LOG.info("Retrieving all fortunes");
		FortuneController fc = getBean(FortuneController.class);
		return fc.fortunes();
	}

	public Fortune random(Context c) {
		LOG.info("Retrieving random fortune");
		FortuneController fc = getBean(FortuneController.class);
		return fc.randomFortune();
	}
}
