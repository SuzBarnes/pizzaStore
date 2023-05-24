package com.pizza;

import com.pizza.chef.PizzaChef;
import com.pizza.chef.Pizzaiola;
import com.pizza.food.Pizza;
import com.pizza.recipe.Recipe;
import com.pizza.recipe.RecipeFactory;

import java.util.ArrayList;
import java.util.List;

public class PizzaStore {

    public List<Pizza> Order(List<String> PizzaNames) throws Exception {
        List<Pizza> order = new ArrayList<>();
        RecipeFactory factory = new RecipeFactory();

        for(String PizzaName: PizzaNames){
            Recipe recipe = factory.createRecipe(PizzaName);
            PizzaChef chef = new Pizzaiola();
            order.add(Process(chef, recipe));
        }
        return order;

    }
    private Pizza Process(PizzaChef chef, Recipe recipe){
        return chef.prepare(recipe);
    }

}


