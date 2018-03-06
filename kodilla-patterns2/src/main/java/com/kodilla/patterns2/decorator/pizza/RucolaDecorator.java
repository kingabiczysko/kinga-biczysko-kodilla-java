package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class RucolaDecorator extends AbstractPizzaOrderDecorator {
    public RucolaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaPrice(){
        return super.getPizzaPrice().add(new BigDecimal(3));
    }

    @Override
    public String getPizzaDescription(){
        return super.getPizzaDescription() + ", extra rucola";
    }
}
