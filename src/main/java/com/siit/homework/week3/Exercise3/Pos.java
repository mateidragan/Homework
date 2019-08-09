package com.siit.homework.week3.Exercise3;

import java.util.ArrayList;

public class Pos {

    ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public void addKnownBankAccount(BankAccount bankAccount){
        bankAccounts.add(bankAccount);
    }

    public String pay(int amount, Card card){
        String receipt = new String();
        return receipt;
    }
}
