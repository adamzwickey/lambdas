package io.pivotal.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

/**
 * Created by azwickey on 1/26/17.
 */
public class Hello {

    public Hello() {
        System.out.println("Expensive init");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String myHandler(int myCount, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("received : " + myCount);
        System.out.println("Testing system out\n");
        return String.valueOf(myCount);
    }
}