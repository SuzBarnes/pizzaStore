package com.pizza.chef;

import com.pizza.chef.PizzaChef;
import com.pizza.food.AnyPizza;
import com.pizza.food.Pizza;
import com.pizza.recipe.Recipe;

public class Pizzaiola implements PizzaChef {
    @Override
    public Pizza prepare(Recipe recipe) {
        return new AnyPizza(recipe.getToppings());
    }

}
