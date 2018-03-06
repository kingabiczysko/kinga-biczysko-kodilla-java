package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SeefoodDecorator extends AbstractPizzaOrderDecorator {
    public SeefoodDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }


    @Override
    public BigDecimal getPizzaPrice(){
        return super.getPizzaPrice().add(new BigDecimal(10));
    }

    @Override
    public String getPizzaDescription(){
        return super.getPizzaDescription() + ", extra seefood";
    }
}
