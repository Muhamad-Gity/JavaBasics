package com.siminfo;

public class DynamicInitialization {
    // Demonstrate dynamic initalization
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        // c is dynamically initialized
        double c = Math.sqrt(a * a + b * b);

        // the Pythagorean theorem
        System.out.println("Hypotenus is " + c);
    }
}
