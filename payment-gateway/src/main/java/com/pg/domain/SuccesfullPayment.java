package com.pg.domain;

/**
 *
 * @author Maleen Chethiya
 */
public class SuccesfullPayment {

    private double amount;
    private int transactionStatus;
    private String message;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(int transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
