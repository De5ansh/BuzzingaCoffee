package com.adonis.buzzingacoffee;

public class Drink {

    private String name;
    private String description;

    private String price;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte","A couple of espresso shots with steamed milk", "2.00$",R.drawable.latte),
            new Drink("Cappuccino","Espresso, hot milk, and a steamed milk foam","2.00$",R.drawable.cappuccino),
            new Drink("Filter","Highest quality beans rosted and brewed fresh","1.50$",R.drawable.filter)
    };

    private Drink(String name,String description, String price, int imageResourceId) {
        this.name=name;
        this.description=description;
        this.price=price;
        this.imageResourceId=imageResourceId;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public String getPrice() { return price; }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }

}
