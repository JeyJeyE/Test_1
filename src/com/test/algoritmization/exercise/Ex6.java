package com.test.algoritmization.exercise;

public class Ex6 {

    public static void main(String[] args) {
        double a = 3.0 * Math.pow(10, 3);
        double b = 6.0 * Math.pow(10, 4);
        double m = 4.0;

        int fk = 0;
        int count = 0;
        int notOfCount = 0;
        for (int k = -30; k <= 60 && count <= 20; k++) {
            fk = (int) (Math.pow(k, 3) - 25 * Math.pow(k, 2) + 50 * k + 1000);
            

            if (checkForConditions(a, b, m, fk)) {
                System.out.println("fk = " + fk);
                count++;
            } else {
            	notOfCount++;
            }
        }

        System.out.println("Количество элементов не удовлетворяющих условиям: " + notOfCount);
    }

    public static boolean checkForConditions(double a, double b, double m, int fk) {
        double t1 = Math.sqrt(a + b + m);
        double t2 = m * Math.sqrt(a + b);
        double t3 = Math.sqrt(a * b * m);
        double t4 = m * Math.sqrt(a * b);
        
        return (fk > t1 && fk < t2) || (fk > t3 && fk < t4);
    }
}
