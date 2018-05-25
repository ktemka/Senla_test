package by.kozel.task6;

import java.util.InputMismatchException;
import java.util.Scanner;

//Написать программу, которая проверяет три отрезка на
//возможность создать прямоугольный треугольник. Длина отрезков
//вводится вручную.

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = 0, b = 0, c = 0;
		try {
			System.out.println("Enter a: ");
			a = in.nextDouble();
			System.out.println("Enter b: ");
			b = in.nextDouble();
			System.out.println("Enter c: ");
			c = in.nextDouble();
		} catch (InputMismatchException ex) {
			System.out.println("Input error!");
			return;
		}
		System.out.println("Triangle can " + (isPosibleToCreate(a, b, c) ? " "  : "not ") + "be create");
	}
	
	private static boolean isPosibleToCreate(double a, double b, double c) {
		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
			return true;
		}
		return false;
	}
}
