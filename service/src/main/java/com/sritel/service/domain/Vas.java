package com.sritel.service.domain;

/**
 *
 * @author Maleen Chethiya
 */
public class Vas {

    private int code;
    private String name;
    private String description;
    private int chargePerDay;
    private String activationCode;
    private String deactivationCode;

    public Vas() {
        this.code = 100;
        this.name = "ringTone";
        this.description = "Ring tones are money";
        this.chargePerDay = 5;
        this.activationCode = "a100";
        this.deactivationCode = "d100";
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public int getChargePerDay() {
        return chargePerDay;
    }

    public void setChargePerDay(int chargePerDay) {
        this.chargePerDay = chargePerDay;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDeactivationCode() {
        return deactivationCode;
    }

    public void setDeactivationCode(String deactivationCode) {
        this.deactivationCode = deactivationCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
