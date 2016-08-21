package com.example.hwhong.recipemaster;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by hwhong on 8/21/16.
 */
public class IngredientView extends AppCompatActivity {

    private ListView listView;
    private String[] meats = new String[]{"Chicken", "Beef", "Fish"};
    private String[] veggies = new String[]{"Cabbage", "Broccoli", "Carrot"};
    private String[] main = new String[]{"Rice", "Noodle", "Soup"};
    private String[] dairy = new String[]{"Milk", "Cheese"};
    private ArrayAdapter adapterView;

    private int which;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingredient_view);
        listView = (ListView) findViewById(R.id.ingredientList);


        Intent intent = getIntent();

        switch (intent.getIntExtra("view", 0)) {
            case 0:
                adapterView = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,meats);
                which = 0;
                break;
            case 1:
                adapterView = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,veggies);
                which = 1;
                break;
            case 2:
                adapterView = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,main);
                which = 2;
                break;
            case 3:
                adapterView = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,dairy);
                which = 3;
                break;
        }

        listView.setAdapter(adapterView);

        switch(which) {
            case 0:
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        if(!MainActivity.ingredients.contains(meats[i])) {
                            MainActivity.ingredients.add(meats[i]);
                            Toast.makeText(IngredientView.this, "You've Selected " + meats[i], Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                break;
            case 1:
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        if(!MainActivity.ingredients.contains(veggies[i])) {
                            MainActivity.ingredients.add(veggies[i]);
                            Toast.makeText(IngredientView.this, "You've Selected " + veggies[i], Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                break;
            case 2:
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        if(!MainActivity.ingredients.contains(main[i])) {
                            MainActivity.ingredients.add(main[i]);
                            Toast.makeText(IngredientView.this, "You've Selected " + main[i], Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                break;
            case 3:
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        if(!MainActivity.ingredients.contains(dairy[i])) {
                            MainActivity.ingredients.add(dairy[i]);
                            Toast.makeText(IngredientView.this, "You've Selected " + dairy[i], Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                break;
        }
    }
}
