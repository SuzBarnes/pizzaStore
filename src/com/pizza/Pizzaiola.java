package com.pizza;

import com.pizza.recipe.Recipe;

public class Pizzaiola implements PizzaChef{
    @Override
    public Pizza prepare(Recipe recipe) {
        return new AnyPizza(recipe.getToppings());
    }

}
