package com.pizza;

import com.pizza.recipe.PlainPizzaRecipe;

public class PlainPizzaChef {
    public PlainPizza prepare(PlainPizzaRecipe recipe){
        PlainPizza pizza = new PlainPizza();
        pizza.Toppings = recipe.Toppings;
        return pizza;
    }
}

