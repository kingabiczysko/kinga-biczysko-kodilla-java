package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {


        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas");

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");

        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);




        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("\nZadanie 7.1.");

        poemBeautifier.beautify("Ala ma kota Rysia.", (text) -> text.toUpperCase());
        poemBeautifier.beautify("Król Maciuś Pierwszy.", (text) -> text.toLowerCase());
        poemBeautifier.beautify(" mil do celu!", (text) -> {
           String text2 = 500 + text;
            return text2.toString();
        });
        poemBeautifier.beautify("exit", (text) ->{
            String text2 = "<<<<<< " + text + " >>>>>";
            return text2.toUpperCase();
        });



    }
}
