package com.pg.domain;

import java.util.Date;

/**
 *
 * @author Maleen Chethiya
 */
public class Payment {

    public enum CardType {

        VISA("Visa"), MASTER("Master"), Amex("Amex");
        private String cardType;

        private CardType(String s) {
            cardType = s;
        }

        public String getCardType() {
            return cardType;
        }
    }
    private double amount;
    private String checksum;
    private String cardNo;
    private String cvc;
    private Date expireDate;
    private CardType cardType;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}
