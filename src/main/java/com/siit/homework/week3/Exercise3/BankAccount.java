package com.siit.homework.week3.Exercise3;

public class BankAccount {

    private int iban;
    private int balance;
    Card[] attachedCardNumbers = new Card[5];

    public BankAccount(int iban) {
        this.iban = iban;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addMoney(int amount, int balance){
        int newBalance = balance + amount;
    }

    public void withdrawMoney(int amount, int balance){
        int newBalance = balance - amount;
    }

//    public void attachCard(Card[] attachedCardNumbers){
//        Scanner input = new Scanner(System.in);
//
//        for (int i = 0; i <= 5; i++){
//            attachedCardNumbers[i] = input.next();
//        }
//    }
}
