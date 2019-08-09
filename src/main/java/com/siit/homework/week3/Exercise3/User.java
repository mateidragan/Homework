package com.siit.homework.week3.Exercise3;

import java.util.ArrayList;

public class User {

    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public void addCard(Card card){
        cards.add(card);
    }

    public void addBankAccount(BankAccount bankAccount){
        bankAccounts.add(bankAccount);
    }
}
