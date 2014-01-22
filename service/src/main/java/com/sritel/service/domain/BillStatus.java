package com.sritel.service.domain;

import java.util.Date;

/**
 *
 * @author Maleen Chethiya
 */
public class BillStatus {

    private String phoneNumber;
    private double outstandingAmount;
    private double lastPaidAmount;
    private Date lastpaidDate;
    private double creditLimit;
    private Boolean activationStatus;

    public BillStatus() {
        this.phoneNumber = "727107747";
        this.outstandingAmount = 2000;
        this.lastPaidAmount = 1000;
        Date date = new Date();
        this.lastpaidDate = date;
        this.creditLimit = 5000;
        this.activationStatus = true;
    }

    public Boolean getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(Boolean activationStatus) {
        this.activationStatus = activationStatus;
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
