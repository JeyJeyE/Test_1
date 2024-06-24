package com.test.algoritmization.exercise;

public class Ex8 {

	public static void main(String[] args) {
        double x = 0.1;
        double step = 0.1;
        double y;

        System.out.println("|  x   |  f(x)  |");
        System.out.println("-----------------");

        while (x <= 10) {
            y = Math.pow(x, 2) - Math.pow(Math.E, 2 * x) + 4;

            if (y <= 0) {
                System.out.println("Пройден нуль функции");
                break;
            } else {
            	System.out.printf("| %.2f | %.4f |\n", x, y);
            	System.out.println("-----------------");
            }

            x += step;
        }
    }
}
