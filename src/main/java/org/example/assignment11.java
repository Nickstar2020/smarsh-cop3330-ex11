package org.example;
import java.util.Scanner;

public class assignment11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //ask for euro amount
        System.out.println("How many euros are you exchanging?");
        double c_from = scan.nextDouble();

        //ask for exchange rate
        System.out.println("What is the exchange rate?");
        double rate = scan.nextDouble();

        //print out exchange rate
        double c_to = Math.round(c_from * rate * 100.0) / 100.0;
        System.out.println(String.format("%.2f", c_from) + " euros at an exchange rate of " + rate + " is " + String.format("%.2f", c_to));

    }
}
