package com.example.ashleytjon_hing_comp304lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class RestaurantActivity extends AppCompatActivity {
    public static String cType;
    private TextView title;
    private CheckBox menu1;
    private CheckBox menu2;
    private Button contbttn;
    private double cost = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        menu1.setOnClickListener(new View.OnClickListener()  {

            public void onClick (View v) {
                menu1.isChecked() ?
                        cost = cost+ :
                        "This option is not checked");
            }
        });

        cType = getIntent().getStringExtra(Cuisine.cuisine_type);
        title = (TextView) findViewById(R.id.restTitle);
        menu1 = (CheckBox) findViewById(R.id.checkBox1);
        menu2 = (CheckBox) findViewById(R.id.checkBox2);
        contbttn = (Button) findViewById(R.id.bttncont);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        switch(cType) {
            case "Chinese":
                //show the menu
                getMenuInflater().inflate(R.menu.china_restaurants, menu);
                break;
            case "Indian":
                //show the menu
                getMenuInflater().inflate(R.menu.indian_restaurants, menu);
                break;
            case "Japanese":
                //show the menu
                getMenuInflater().inflate(R.menu.japan_restaurants, menu);
                break;
            case "American":
                //show the menu
                getMenuInflater().inflate(R.menu.usa_restaurants, menu);
                break;
            case "International":
                //show the menu
                getMenuInflater().inflate(R.menu.world_restaurants, menu);
                break;
        }
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getTitle().toString()){
            case "Congee Wong":
                title.setText(R.string.chiR1);
                menu1.setText(R.string.chiF1);
                menu2.setText(R.string.chiF2);
                break;
            case "Grand Lake":
                title.setText(R.string.chiR2);
                menu1.setText(R.string.chiF3);
                menu2.setText(R.string.chiF4);
                break;
            case "Bombay Buffet":
                title.setText(R.string.indR1);
                menu1.setText(R.string.indF1);
                menu2.setText(R.string.indF2);
                break;
            case "Golden Spoon":
                title.setText(R.string.indR2);
                menu1.setText(R.string.indF3);
                menu2.setText(R.string.indF4);
                break;
            case "Irma Buffet":
                title.setText(R.string.worldR1);
                menu1.setText(R.string.worldF1);
                menu2.setText(R.string.worldF2);
                break;
            case "Circle of Food":
                title.setText(R.string.worldR2);
                menu1.setText(R.string.worldF3);
                menu2.setText(R.string.worldF4);
                break;
            case "Spring Sushi":
                title.setText(R.string.jpnR1);
                menu1.setText(R.string.jpnF1);
                menu2.setText(R.string.jpnF2);
                break;
            case "Santouka Ramen":
                title.setText(R.string.jpnR2);
                menu1.setText(R.string.jpnF3);
                menu2.setText(R.string.jpnF4);
                break;
            case "McDonalds":
                title.setText(R.string.usaR1);
                menu1.setText(R.string.usaF1);
                menu2.setText(R.string.usaF2);
                break;
            case "Cheesecake Factory":
                title.setText(R.string.usaR2);
                menu1.setText(R.string.usaF3);
                menu2.setText(R.string.usaF4);
                break;
        }
        menu1.setVisibility(View.VISIBLE);
        menu2.setVisibility(View.VISIBLE);
        contbttn.setVisibility(View.VISIBLE);
        return true;
    }

}