package com.example.pocketguard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BudgetAdapter extends RecyclerView.Adapter<BudgetViewHolder>{

    List<Budget> Budgets;

    public BudgetAdapter() {
        super();
        Budgets = new ArrayList<>();
        Budgets.add(new Budget(R.drawable.housefloor, "$1200", "Rent & Utilities", "95%"));
        Budgets.add(new Budget(R.drawable.cart, "$500", "Groceries", "63%"));
        Budgets.add(new Budget(R.drawable.shopping, "$50", "Shopping", "14%"));
    }

    @NonNull
    @Override
    public BudgetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.budgets,parent,false);
        BudgetViewHolder viewHolder = new BudgetViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BudgetViewHolder holder, int position) {
        Budget budget = Budgets.get(position);
        holder.BudgetImage.setImageResource(budget.BudgetImage);
        holder.BudgetAmount.setText(budget.BudgetAmount);
        holder.BudgetTitle.setText(budget.BudgetTitle);
        holder.BudgetUsage.setText(budget.BudgetUsage);


    }

    @Override
    public int getItemCount() {
        return Budgets.size();
    }
}
