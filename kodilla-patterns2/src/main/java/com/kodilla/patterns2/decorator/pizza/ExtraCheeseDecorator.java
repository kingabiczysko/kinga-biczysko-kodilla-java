package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator {

    public ExtraCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaPrice(){
        return super.getPizzaPrice().add(new BigDecimal(3));
    }

    @Override
    public String getPizzaDescription(){
        return super.getPizzaDescription() + ", extra cheese";
    }
}
