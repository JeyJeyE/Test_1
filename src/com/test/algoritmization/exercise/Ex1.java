package com.test.algoritmization.exercise;

public class Ex1 {

	public static void main(String[] args) {
		double x = 0.5;
		double result;

		if (x + 2.0 / 3.0 == 0) {
			System.out.println("Знаменатель равен нулю. Возьмите другую переменную");
		} else {
			result = Math.sqrt(Math.exp(2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
			System.out.printf("Результат: %.5f", result);
		}
	}

}
