package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExpressDecorator extends AbstractPizzaOrderDecorator {
    public ExpressDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaPrice(){
        return super.getPizzaPrice().add(new BigDecimal(10));
    }

    @Override
    public String getPizzaDescription(){
        return super.getPizzaDescription() + " and express delivery";
    }
}
