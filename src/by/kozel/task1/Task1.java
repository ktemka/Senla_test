package by.kozel.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

//Создать программу, которая будет сообщать, является ли целое
//число, введенное пользователем, чётным или нечётным, простым
//или составным. Если пользователь введёт не целое число, то
//сообщать ему об ошибке.

public class Task1 {

	public static void main(String[] args) {
		int number = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Input number: ");
		try {
			number = in.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Input error");
			return;
		}
		System.out.println("Your number is:");
		System.out.print(isEvenNum(number) ? "even & " : "odd & ");
		System.out.print(isSimpleNum(number) ? "simple" : "composite");
	}

	private static boolean isEvenNum(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	private static boolean isSimpleNum(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}