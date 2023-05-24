package com.pizza.chef;

import com.pizza.food.Pizza;
import com.pizza.recipe.Recipe;

public interface PizzaChef {
    public Pizza prepare(Recipe recipe);
}
