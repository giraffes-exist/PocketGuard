package com.example.pocketguard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //

        RecyclerView rv = findViewById(R.id.rv_budget);
        rv.setHasFixedSize(false);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1);
        rv.setLayoutManager(layoutManager);

        BudgetAdapter adapter = new BudgetAdapter();
        rv.setAdapter(adapter);

        //

        RecyclerView rv2 = findViewById(R.id.rv_transactions);
        rv2.setHasFixedSize(false);

        RecyclerView.LayoutManager layoutManager2 = new GridLayoutManager(this,1);
        rv2.setLayoutManager(layoutManager2);

        TransactionsAdapter adapter2 = new TransactionsAdapter();
        rv2.setAdapter(adapter2);


    }
}