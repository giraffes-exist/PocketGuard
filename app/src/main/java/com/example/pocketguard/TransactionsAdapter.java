package com.example.pocketguard;

import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TransactionsAdapter extends RecyclerView.Adapter<TransactionViewHolder> {

    List<Transaction> Transactions;

    public TransactionsAdapter() {
        super();
        Transactions = new ArrayList<>();
        Transactions.add(new Transaction(R.drawable.shopping, "$50", "Dec 20, Shopping"));
        Transactions.add(new Transaction(R.drawable.cart, "$150", "Dec 19, Groceries"));
        Transactions.add(new Transaction(R.drawable.water, "$700", "Dec 18, Utilities"));
    }

        @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transactions,parent,false);
        TransactionViewHolder viewHolder = new TransactionViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder holder, int position) {
        Transaction transaction = Transactions.get(position);
        holder.TransactionImage.setImageResource(transaction.TransactionImage);
        holder.TransactionAmount.setText(transaction.TransactionAmount);
        holder.TransactionDetails.setText(transaction.TransactionDetails);

    }

    @Override
    public int getItemCount() {
        return Transactions.size();
    }
}
