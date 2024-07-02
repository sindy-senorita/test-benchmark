package org.sindysenorita;

public class Fibonacci {
    public static int run(int n) {
        if (n <= 1) {
            return n;
        } else {
            return run(n - 1) + run(n - 2);
        }
    }
}

