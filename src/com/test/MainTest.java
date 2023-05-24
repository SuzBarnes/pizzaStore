package com.test;

import com.pizza.Customer;
import com.pizza.PizzaStore;
import com.pizza.food.Pizza;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MainTest {
    @Test
    public void testPizzaCanBePrepared(){
        Customer customer = new Customer();
        List<String> pizzas = new ArrayList<>();
        pizzas.add("Pepperoni");
        pizzas.add("Plain Pizza");
        pizzas.add("Hawaiian");
       assertEquals(3, pizzas.size());
    }
    @Test
    public void getFirstPizzaInArrayList(){
        Customer customer = new Customer();
        List<String> pizzas = new ArrayList<>();
        pizzas.add("Pepperoni");
        pizzas.add("Plain Pizza");
        pizzas.add("Hawaiian");
        assertEquals("Pepperoni", pizzas.get(0));
    }

    @Test
    public void getPizzaIngredients() throws Exception{
       List<Pizza> order;
        Customer customer = new Customer();
        PizzaStore store = new PizzaStore();
        List<String> pizzas = new ArrayList<>();
        pizzas.add("Pepperoni");
        order = store.Order(pizzas);
        customer.Order(pizzas);

        assertEquals(3, order.get(0).getToppings().size());
    }
}
