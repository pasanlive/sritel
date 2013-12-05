package com.sritel.service.domain;

/**
 *
 * @author Maleen Chethiya
 */
public class UpdateBill {

    private String phoneNumber;
    private double updatingAmount;
    private int earnedPoints;
    private int totalPoints;

    public int getEarnedPoints() {
        return earnedPoints;
    }

    public void setEarnedPoints(int earnedPoints) {
        this.earnedPoints = earnedPoints;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public double getUpdatingAmount() {
        return updatingAmount;
    }

    public void setUpdatingAmount(double updatingAmount) {
        this.updatingAmount = updatingAmount;
    }
}
