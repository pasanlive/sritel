package com.sritel.service.domain;

/**
 *
 * @author Maleen Chethiya
 */
public class BillStatus {

    private String phoneNumber;
    private double outstandingAmount;
    private double lastPaidAmount;
    private double lastpaidDate;
    private double creditLimit;
    private Boolean activationStatus;

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

    public double getLastpaidDate() {
        return lastpaidDate;
    }

    public void setLastpaidDate(double lastpaidDate) {
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
