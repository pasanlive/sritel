package com.sritel.service.domain;

/**
 *
 * @author Maleen Chethiya
 */
public class UpdateBill {

    private String phoneNumber;
    private double updatingAmount;

    public UpdateBill() {
        this.phoneNumber = "727107747";
        this.updatingAmount = 100;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getUpdatingAmount() {
        return updatingAmount;
    }

    public void setUpdatingAmount(double updatingAmount) {
        this.updatingAmount = updatingAmount;
    }
}
