package com.example.pocketguard;

public class Transaction {

    public int TransactionImage;
    public String TransactionAmount;
    public String TransactionDetails;

    public Transaction(int categoryicon, String amount, String details) {
        TransactionImage = categoryicon;
        TransactionAmount = amount;
        TransactionDetails = details;
    }
}
