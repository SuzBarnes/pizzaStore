package com.pizza.recipe;

public class RecipeFactory {
    public Recipe createRecipe(String pizzaName){
        if(pizzaName == "PlainPizza"){
            return new PlainPizzaRecipe();
        }
        if(pizzaName == "Pepperoni"){
            return new PepperoniPizzaRecipe();
        }
        return null;
    }
}
