package com.example.hwhong.recipemaster;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hwhong on 8/21/16.
 */
public class RecipeView extends AppCompatActivity {

    private TextView textView, textView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);

        textView = (TextView) findViewById(R.id.finalngred);
        textView2 = (TextView) findViewById(R.id.foodTV);
        Intent intent = getIntent();
        ArrayList<String> array = intent.getStringArrayListExtra("array");

        for(int i = 0; i < array.size(); i++) {
            if(i == 0) {
                textView.setText("You've Selected ... " + "\n");
            }

            textView.append(array.get(i) + "\n");
        }

        if(array.contains("Rice") && array.contains("Beef") && array.contains("Milk")) {
            textView2.append("You can Make Beef Risotto" + "\n");
        }

        if(array.contains("Broccoli") && array.contains("Cabbage") && array.contains("Noodle")) {
            textView2.append("You can Make Veggie Spaghetti" + "\n");
        }

        if(array.contains("Fish") && array.contains("Soup") && array.contains("Carrot")) {
            textView2.append("You can Make Fish Soup" + "\n");
        }

        if(array.contains("Chicken") && array.contains("Rice") && array.contains("Cabbage")) {
            textView2.append("You can Make Chicken and Rice" + "\n");
        }

        if(array.contains("Cabbage") && array.contains("Beef") && array.contains("Rice")) {
            textView2.append("You can Make Beef Stew" + "\n");
        }
    }
}
