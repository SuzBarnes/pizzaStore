package com.pizza.recipe;

import java.util.HashMap;

public class RecipeFactory {

    HashMap<String, Recipe> recipeHashMap = new HashMap<String, Recipe>();

    public Recipe createRecipe(String pizzaName) {
        recipeHashMap.put("Plain Pizza", new Plain());
        recipeHashMap.put("Pepperoni", new Pepperoni());
        recipeHashMap.put("Hawaiian", new Hawaiian());
        recipeHashMap.put("Four Cheese", new FourCheese());
        return recipeHashMap.get(pizzaName);
    }
}
