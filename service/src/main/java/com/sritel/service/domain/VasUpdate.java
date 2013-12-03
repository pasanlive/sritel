package com.sritel.service.domain;

/**
 * Resource which can be used to update vas service
 *
 * @author Maleen Abewardana
 * @since 0.1.0
 * @date Dec 3, 2013
 */
public class VasUpdate {

    private int vasCode;
    private String phoneNumber;

    public int getVasCode() {
        return vasCode;
    }

    public void setVasCode(int vasCode) {
        this.vasCode = vasCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
