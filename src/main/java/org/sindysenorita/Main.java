package org.sindysenorita;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 1; i <= 10; i++) {
            System.out.println(FizzBuzz.run(i));
            System.out.println(Fibonacci.run(i));
        }
    }
}