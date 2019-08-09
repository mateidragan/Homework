package com.siit.homework.week3.Exercise3;

public class Card {

    private int cardNumber;
    private String expirationDate;
    private String ownerName;

    public Card(int cardNumber, String expirationDate, String ownerName) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.ownerName = ownerName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }



}
