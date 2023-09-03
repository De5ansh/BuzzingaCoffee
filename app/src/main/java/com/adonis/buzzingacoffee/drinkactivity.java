package com.adonis.buzzingacoffee;

import android.app.Activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class drinkactivity extends Activity {

    public static final String EXTRA_DRINKID="drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinkactivity);

        int drinkId= (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink=Drink.drinks[drinkId];

        TextView name=(TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description=(TextView) findViewById(R.id.desc);
        description.setText(drink.getDescription());

        TextView price=(TextView) findViewById(R.id.price);
        price.setText(drink.getPrice());

        ImageView photo=(ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}