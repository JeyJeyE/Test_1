package com.test.algoritmization.exercise;

public class Ex2 {

	public static void main(String[] args) {
		double a = 0.5;
		double b = 1.0;
		int n = 10;
		
		System.out.println("---------------------------");
		System.out.println("| № |    x     |   f(x)   |");
		System.out.println("---------------------------");
		
		double x = 0.5;
		for(int i = 1; i <= n; i++) {
			x = x + (b - a)/n;
			double result = Math.sqrt(Math.exp(2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
			System.out.printf("|%2d | %.6f | %.6f |\n ", i, x, result);
			System.out.println("--------------------------");
		}
	}
	
}
