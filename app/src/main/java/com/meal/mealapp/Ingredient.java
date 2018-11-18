package com.meal.mealapp;

public class Ingredient {

    public String name;
    public int calories;
    public double quantitiy;
    public String units;

    public Ingredient(String name, int calories, double quantity, String units) {
        this.name = name;
        this.calories = calories;
        this.quantitiy = quantity;
        this.units = units;
    }


    // Getter

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getQuantitiy() {
        return quantitiy;
    }

    public String getUnits() {
        return units;
    }
}
