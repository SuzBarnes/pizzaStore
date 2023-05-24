package com.pizza.food;

import java.util.List;

public class AbstractPizza implements Pizza {
    private List<String> Toppings;
    public AbstractPizza(List<String> Toppings){this.Toppings = Toppings;}
    public List<String> getToppings(){return Toppings;}
}
