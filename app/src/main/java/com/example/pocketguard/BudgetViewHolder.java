package com.example.pocketguard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class BudgetViewHolder extends RecyclerView.ViewHolder{


    public ImageView BudgetImage;
    public TextView BudgetAmount;
    public TextView BudgetTitle;
    public TextView BudgetUsage;

    public BudgetViewHolder(@NotNull View itemView){
        super(itemView);
        BudgetImage = itemView.findViewById(R.id.budgetImage);
        BudgetAmount = itemView.findViewById(R.id.budgetAmt);
        BudgetTitle = itemView.findViewById(R.id.budgetTitle);
        BudgetUsage = itemView.findViewById(R.id.budgetUsage);


    }
}
