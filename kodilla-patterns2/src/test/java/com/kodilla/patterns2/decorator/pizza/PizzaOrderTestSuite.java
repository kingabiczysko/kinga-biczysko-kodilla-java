package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaWithExtraCheeseAndHam(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);

        //When

        BigDecimal price = theOrder.getPizzaPrice();
        String pizzaDescription = theOrder.getPizzaDescription();

        //Then
        Assert.assertEquals(new BigDecimal(16), price);
        Assert.assertEquals("Perfect Italian Pizza with parmezan cheese," +
                " extra cheese, extra ham", pizzaDescription);
    }

    @Test
    public void testBasicPizzaWithExtraCheeseRucolaHamSeefoodAndExpressDelivery(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new RucolaDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new SeefoodDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);

        //When
        BigDecimal price = theOrder.getPizzaPrice();
        String pizzaDescription = theOrder.getPizzaDescription();
        System.out.println(pizzaDescription);
        System.out.println("Total price: " + price + "PLN.");

        //Then
        Assert.assertEquals(new BigDecimal(39), price);
        Assert.assertEquals("Perfect Italian Pizza with parmezan cheese," +
                " extra cheese, extra rucola, extra ham, extra seefood and express delivery", pizzaDescription);
    }
}
