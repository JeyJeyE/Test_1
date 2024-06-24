package com.test.algoritmization.exercise;

import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {
		int n = 5;
		double[][] points = new double[2][n];

		creationCoordinatesOfPoints(points);

		System.out.println("Координаты точек: ");
		printCoordinatesOfPoints(points);

		int count = coincidenceInCoordination(points);
		System.out.println("Количество точек в заданной области: " + count);

	}

	public static void creationCoordinatesOfPoints(double[][] coord) {
		Random rand = new Random();

		for (int i = 0; i < coord[0].length; i++) {
			coord[0][i] = rand.nextDouble() * 3.0;
			coord[1][i] = rand.nextDouble() * 3.0;
		}
	}

	public static void printCoordinatesOfPoints(double[][] coord) {
		for (int i = 0; i < coord[0].length; i++) {
			System.out.printf("По оси x - %.2f, ", coord[0][i]);
			System.out.printf("по оси y - %.2f", coord[1][i]);
			System.out.println();
		}
	}

	public static int coincidenceInCoordination(double[][] coord) {
		int count = 0;
		for (int i = 0; i < coord[0].length; i++) {
			double x = coord[0][i];
			double y = coord[1][i];

			if (((x >= -2 && x <= 1 && y >= 0 && y <= 2) || (x >= -1 && x <= 2 && y >= -2 && y <= 1))) {
				count++;
			}
		}
		return count;
	}

}