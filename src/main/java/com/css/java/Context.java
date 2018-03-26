package com.css.java;

/**
 * This is context for transaction id for each new transation
 * initiated by thread.
 *
 * @author Kishore Routhu on 13/7/17 1:33 PM.
 */
public class Context {

    private String transactionId;

    public Context(String transactionId) {
        this.transactionId = transactionId;
    }

    public Context() {
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
