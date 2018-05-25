package by.kozel.task9;

import java.util.InputMismatchException;
import java.util.Scanner;

//Написать программу выводящую на экран все четные числа и их
//сумму из последовательности от 0 до N. N вводится вручную.

public class Task9 {

	public static void main(String[] args) {
		int n = 0;
		try {
			System.out.println("Enter n: ");
			n = new Scanner(System.in).nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Input error!");
			return;
		}
		output(n);
		System.out.println("Sum of even numbers = " + sumEvenNumbers(n));
	}
	
	private static int sumEvenNumbers (int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	private static void output (int n) {
		System.out.println("Even numbers: ");
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		System.out.println();
	}

}
