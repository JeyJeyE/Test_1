package com.test.algoritmization.exercise;

public class Ex3 {

    public static void main(String[] args) {
        double x = 0.5;
        int n = 20;

        double result = Math.sqrt(n * Math.PI) * calculationOfSum(x, n);

        System.out.printf("Результат: %.3f", result);
    }

    public static double calculationOfSum(double x, int n) {
        double sum = 0.0;

        for (int k = 1; k <= n; k++) {
            double num = (Math.sin(k * x / 2.0) + Math.sin((k * x - 1.0) / 2.0));
            double den = Math.exp(x - 1.0 / k);
            sum += num / den;
        }
        
        return sum;
    }
}
