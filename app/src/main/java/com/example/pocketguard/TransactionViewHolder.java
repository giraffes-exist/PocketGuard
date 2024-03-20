package com.example.pocketguard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class TransactionViewHolder extends RecyclerView.ViewHolder {

    public ImageView TransactionImage;
    public TextView TransactionAmount;
    public TextView TransactionDetails;

    public TransactionViewHolder(@NotNull View itemView){
        super(itemView);
        TransactionImage = itemView.findViewById(R.id.transactionCat);
        TransactionAmount = itemView.findViewById(R.id.transactionAmt);
        TransactionDetails = itemView.findViewById(R.id.transactionTitle);


    }

}
