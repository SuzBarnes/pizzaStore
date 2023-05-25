package com.pizza.recipe;

public class RecipeFactory {
    public Recipe createRecipe(String pizzaName){
        if(pizzaName == "Plain Pizza"){
            return new PlainPizzaRecipe();
        }
        if(pizzaName == "Pepperoni"){
            return new PepperoniPizzaRecipe();
        }
        if(pizzaName == "Hawaiian"){
            return new HawaiianPizzaRecipe();
        }
        if(pizzaName == "Four Cheese"){
            return new FourCheese();
        }
        return null;
    }
}
