package com.example.pocketguard;

public class Budget {
    public int BudgetImage;
    public String BudgetAmount;
    public String BudgetTitle;
    public String BudgetUsage;

    public Budget(int categoryicon, String amount, String title, String usage) {
        BudgetImage = categoryicon;
        BudgetAmount = amount;
        BudgetTitle = title;
        BudgetUsage = usage;

    }
}
