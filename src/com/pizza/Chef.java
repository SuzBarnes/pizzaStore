package com.pizza;

import com.pizza.recipe.PepperoniPizzaRecipe;
import com.pizza.recipe.PlainPizzaRecipe;

public class Chef {
    public PlainPizza prepare(PlainPizzaRecipe recipe){
        //here's where we build the pizza according to the recipe
        PlainPizza pizza = new PlainPizza();
        pizza.Toppings = recipe.Toppings;
        return pizza;
    }

    public PepperoniPizza prepare(PepperoniPizzaRecipe recipe){
        //here's where we build the pizza according to the recipe
        PepperoniPizza pizza = new PepperoniPizza();
        pizza.Toppings = recipe.Toppings;
        return pizza;
    }
}
