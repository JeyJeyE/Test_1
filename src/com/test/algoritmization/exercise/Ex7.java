package com.test.algoritmization.exercise;

public class Ex7 {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        double xStart = 0.5;
        double zStart = 0.1;
        double hx = 0.5;
        double hz = 0.7;

        calculation(n, m, xStart, zStart, hx, hz);
    }

    public static void calculation(int n, int m, double xStart, double zStart, double hx, double hz) {
        System.out.println("|  x   |  z   |Результат|");
        System.out.println("-------------------------");

        for (int i = 0; i < n; i++) {
            double x = xStart + i * hx;
            for (int j = 0; j < m; j++) {
                double z = zStart + j * hz;
                double result = (Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log(z) + Math.abs(Math.log(z)))
                        / Math.sqrt(Math.pow(z, 2) - Math.pow(x, 2) + 3.2);
                System.out.printf("| %.2f | %.2f | %.4f |\n", x, z, result);
                System.out.println("-------------------------");
            }
        }
    }
}