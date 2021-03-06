package com.sritel.service.domain;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author Maleen Chethiya
 */
public class MonthlyBill {

    private String phoneNumber;
    private double outstandingAmount;
    private double lastPaidAmount;
    private Date lastpaidDate;
    private double creditLimit;
    private int noOfUnits;
    private int noOfMessages;
    private Date biilingDateFrom;
    private Date biilingDateTo;
    private int billingMonth;
    private int billingYear;

    public MonthlyBill() {
        this.phoneNumber = "727107747";
        this.outstandingAmount = 2000;
        this.lastPaidAmount = 1000;
        Date billingDate = new Date();
        this.lastpaidDate = billingDate;
        this.creditLimit = 5000;
        this.noOfUnits = 300;
        this.noOfMessages = 100;
        this.biilingDateFrom = billingDate;
        this.biilingDateTo = billingDate;
        this.billingMonth = 12;
        this.billingYear = 2013;
    }

    public Date getBiilingDateFrom() {
        return biilingDateFrom;
    }

    public void setBiilingDateFrom(Date biilingDateFrom) {
        this.biilingDateFrom = biilingDateFrom;
    }

    public Date getBiilingDateTo() {
        return biilingDateTo;
    }

    public void setBiilingDateTo(Date biilingDateTo) {
        this.biilingDateTo = biilingDateTo;
    }

    public int getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(int billingMonth) {
        this.billingMonth = billingMonth;
    }

    public int getBillingYear() {
        return billingYear;
    }

    public void setBillingYear(int billingYear) {
        this.billingYear = billingYear;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getLastPaidAmount() {
        return lastPaidAmount;
    }

    public void setLastPaidAmount(double lastPaidAmount) {
        this.lastPaidAmount = lastPaidAmount;
    }

    public Date getLastpaidDate() {
        return lastpaidDate;
    }

    public void setLastpaidDate(Date lastpaidDate) {
        this.lastpaidDate = lastpaidDate;
    }

    public int getNoOfMessages() {
        return noOfMessages;
    }

    public void setNoOfMessages(int noOfMessages) {
        this.noOfMessages = noOfMessages;
    }

    public int getNoOfUnits() {
        return noOfUnits;
    }

    public void setNoOfUnits(int noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    public double getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(double outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
