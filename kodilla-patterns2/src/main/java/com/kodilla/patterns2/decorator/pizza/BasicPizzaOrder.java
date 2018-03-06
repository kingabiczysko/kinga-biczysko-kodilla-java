package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {

    @Override
    public BigDecimal getPizzaPrice(){
        return new BigDecimal(10);
    }

    @Override
    public String getPizzaDescription(){
        return "Perfect Italian Pizza with parmezan cheese";
    }
}
