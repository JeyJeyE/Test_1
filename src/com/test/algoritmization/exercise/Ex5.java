package com.test.algoritmization.exercise;

public class Ex5 {

	public static void main(String[] args) {
		double a = 1.0;
		double x1 = -2 * a;
		double dx = a / 5.0;
		int n = 10;

		for (int i = 0; i < n; i++) {
			double x = x1 + i * dx;
			double y = calculationOfY(a, x);
			System.out.printf("x = %.2f, y = %.2f%n", x, y);
		}
	}

	public static double calculationOfY(double a, double x) {
		double y;
		if (x <= 0) {
			y = (a / 2.0) * (Math.exp(x / a) + Math.exp(-x / a));
		} else {
			if ((Math.pow(x, 2.0) + 4 * Math.pow(a, 2.0) == 0)) {
				System.out.println("Ошибка. Знаменатель равен нулю.");
				return 0;
			} else {
				y = 4.0 * Math.pow(a, 3.0) / (Math.pow(x, 2.0) + 4 * Math.pow(a, 2.0));
			}
		}
		return y;
	}
}
