package com.example.teodora.usernamepassword;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    ListView SecondListView;
    int imaginiProduse[][] = new int[][]{
            {R.drawable.oranges, R.drawable.kiwi, R.drawable.bananas, R.drawable.apple, R.drawable.donut, R.drawable.tomatoes, R.drawable.tomatoescherry, R.drawable.minerala,
                    R.drawable.oil, R.drawable.orez, R.drawable.oreo,R.drawable.peanuts, R.drawable.cofee, R.drawable.bread, R.drawable.watermelon},
            {R.drawable.zahar, R.drawable.oreo, R.drawable.onion, R.drawable.minerala, R.drawable.oil,
                    R.drawable.tomatoes,R.drawable.bread,R.drawable.cucumber, R.drawable.lemon,R.drawable.oranges},
            {R.drawable.cucumber, R.drawable.pineapple,R.drawable.kiwi, R.drawable.bananas,
                    R.drawable.straw, R.drawable.peanuts,R.drawable.apple,R.drawable.donut,R.drawable.cofee,R.drawable.lemon},
            {R.drawable.oreo, R.drawable.onion, R.drawable.cucumber, R.drawable.minerala,R.drawable.zahar, R.drawable.oil,
                    R.drawable.tomatoes,R.drawable.bread, R.drawable.oranges,R.drawable.lemon},
            {R.drawable.zahar, R.drawable.oreo, R.drawable.onion, R.drawable.minerala, R.drawable.oil,
                    R.drawable.tomatoes,R.drawable.bread,R.drawable.cucumber, R.drawable.lemon,R.drawable.oranges},
            {R.drawable.cucumber, R.drawable.pineapple,R.drawable.kiwi, R.drawable.bananas,
                    R.drawable.straw, R.drawable.peanuts,R.drawable.apple,R.drawable.donut,R.drawable.cofee,R.drawable.lemon},
            {R.drawable.oreo, R.drawable.onion, R.drawable.cucumber, R.drawable.minerala,R.drawable.zahar, R.drawable.oil,
                    R.drawable.tomatoes,R.drawable.bread, R.drawable.oranges,R.drawable.lemon},
            {R.drawable.oranges, R.drawable.kiwi, R.drawable.bananas, R.drawable.apple, R.drawable.donut, R.drawable.tomatoes, R.drawable.tomatoescherry,
                    R.drawable.oil, R.drawable.straw,R.drawable.orez, R.drawable.oreo,R.drawable.peanuts, R.drawable.cofee, R.drawable.bread, R.drawable.watermelon},
            {R.drawable.cucumber, R.drawable.pineapple,R.drawable.kiwi, R.drawable.bananas,
                    R.drawable.straw, R.drawable.peanuts,R.drawable.apple,R.drawable.donut,R.drawable.cofee,R.drawable.lemon},
            {R.drawable.zahar, R.drawable.oreo, R.drawable.onion, R.drawable.minerala, R.drawable.oil,
                    R.drawable.tomatoes,R.drawable.bread,R.drawable.cucumber, R.drawable.lemon,R.drawable.oranges}};
    String[][] product=new String[][]{{"Oranges Spain","Kiwi","Bananas","Apple","Donut","Hybrid Tomatoes",
    "Cherry Tomatoes","Sparkling water","Olive Oil","Rice","Biscuits", "Peanuts","Jacobs Coffe", "Bread", "Watermelon"},
            {"Sugar","Biscuits","Onions","Sparkling water","Olive Oil","Hybrid Tomatoes","Bread","Cucumber","Lemons","Oranges"},
            {"Cucumber","Pineapple","Kiwi","Bananas","Strawberries","Peanuts","Apples","Donut","Jacobs","Lemons"},
            {"Oreo","Onion","Cucumber","Sparkling water","Sugar","Olive Oil","Hybrid Tomatoes","Bread","Oranges","Lemons"},
            {"Sugar","Biscuits","Onions","Sparkling water","Olive Oil","Hybrid Tomatoes","Bread","Cucumber","Lemons","Oranges"},
            {"Cucumber","Pineapple","Kiwi","Bananas","Strawberries","Peanuts","Apple","Donut","Jacobs","Lemons"},
            {"Oreo","Onion","Cucumber","Sparkling water","Sugar","Olive Oil","Hybrid Tomatoes","Bread","Oranges","lemons"},
            {"Oranges","Kiwi","Bananas","Apples","Donut","Tomatoes","Cherry Tomatoes","Oil","Strawberries","Rice","Oreo","Peanuts","Jacobs Coffe", "Bread", "Watermelon"},
            {"Cucumber","Pineapple","Kiwi","Bananas","Strawberries","Peanuts","Apple","Donut","Jacobs","Lemons"},
            {"Sugar","Biscuits","Onions","Sparkling water","Olive Oil","Hybrid Tomatoes","Bread","Cucumber","Lemons","Oranges"}};
    String[][] prices=new String[][]{{"4.55lei/kg","7.55lei/kg", "3.19lei/kg","2.19lei/kg","1.99/buc","5.19lei/kg","9.20lei/kg","2.35lei",
        "7.99lei","4.00lei","2.99lei","4.45lei","11.2lei","1.19lei","1.89lei/kg"},
            {"3.55lei","2.35lei", "3.19lei/kg","2.39lei","8.99lei","5.19lei/kg","2.00lei","2.35lei/kg",
            "7.99lei","4.00lei","2.99lei","4.45lei","11.2lei","1.19lei","1.89lei/kg"},
            {"4.55lei/kg","7.55lei/kg", "3.19lei/kg","2.19lei/kg","1.99/buc","5.19lei/kg","9.20lei/kg","2.35lei",
            "7.99lei","4.00lei","2.99lei","4.45lei","11.2lei","1.19lei","1.89lei/kg"},
            {"4.55lei/kg","7.55lei/kg", "3.19lei/kg","2.19lei/kg","1.99/buc","5.19lei/kg","9.20lei/kg","2.35lei",
            "7.99lei","4.00lei","2.99lei","4.45lei","11.2lei","1.19lei","1.89lei/kg"},
            {"4.55lei/kg","7.55lei/kg", "3.19lei/kg","2.19lei/kg","1.99/buc","5.19lei/kg","9.20lei/kg","2.35lei",
            "7.99lei","4.00lei","2.99lei","4.45lei","11.2lei","1.19lei","1.89lei/kg"},
            {"4.55lei/kg","7.55lei/kg", "3.19lei/kg","2.19lei/kg","1.99/buc","5.19lei/kg","9.20lei/kg","2.35lei",
            "7.99lei","4.00lei","2.99lei","4.45lei","11.2lei","1.19lei","1.89lei/kg"},
            {"4.55lei/kg","7.55lei/kg", "3.19lei/kg","2.19lei/kg","1.99/buc","5.19lei/kg","9.20lei/kg","2.35lei",
            "7.99lei","4.00lei","2.99lei","4.45lei","11.2lei","1.19lei","1.89lei/kg"},
            {"4.55lei/kg","7.55lei/kg", "3.19lei/kg","2.19lei/kg","1.99/buc","5.19lei/kg","9.20lei/kg","2.35lei",
            "7.99lei","4.00lei","2.99lei","4.45lei","11.2lei","1.19lei","1.89lei/kg"},{"4.55lei/kg","7.55lei/kg", "3.19lei/kg","2.19lei/kg","1.99/buc","5.19lei/kg","9.20lei/kg","2.35lei",
            "7.99lei","4.00lei","2.99lei","4.45lei","11.2lei","1.19lei","1.89lei/kg"},
            {"4.55lei","2.55lei", "3.19lei/kg","2.19lei","8.99lei","5.19lei/kg","2.20lei","2.35lei/kg",
            "5.99lei/kg","4.00lei/kg"}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Resources res = getResources();
        SecondListView = (ListView)findViewById(R.id.ProductsListView);

        Intent in = getIntent();
        int index=in.getIntExtra("com.example.teodora.itemIndex",-1);
        ItemsAdapter itemAdapter = new ItemsAdapter(this,imaginiProduse[index],product[index],prices[index]);
        SecondListView.setAdapter(itemAdapter);
    }
}
