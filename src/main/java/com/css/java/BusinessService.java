package com.css.java;

/**
 * Service class which uses the transaction ID for logging
 * @author Kishore Routhu on 13/7/17 1:38 PM.
 */
public class BusinessService {

    public void businessMethod() {
        //Get the context from thread local context
        Context context = MyThreadLocal.get();

        //Use the transaction Id from the context
        System.out.println(context.getTransactionId());
    }
}
