package strategy;

import strategy.processors.Addition;
import strategy.processors.Multiplication;
import strategy.processors.Subtraction;

public class Main {

    public static void main(String ...args) {

        System.out.println("Values: " + 2 + ", " + 3);
        Calculator c = new Calculator(2, 3);
        c.setProcessor(new Addition());
        System.out.println("Addition: " + c.getResult());

        c.setProcessor(new Subtraction());
        System.out.println("Subtraction: " + c.getResult());

        c.setProcessor(new Multiplication());
        System.out.println("Multiplication: " + c.getResult());

    }

}
