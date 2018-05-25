package by.kozel.task8;

import java.util.InputMismatchException;
import java.util.Scanner;

//Создать программу, которая будет сообщать, является ли целое
//число, введенное пользователем, чётным или нечётным, простым
//или составным. Если пользователь введёт не целое число, то
//сообщать ему об ошибке.

public class Task8 {

	public static void main(String[] args) {
		int n = 0;
		try {
			System.out.println("Enter n: ");
			n = new Scanner(System.in).nextInt();
			if (n > 100 || n <= 0) {
				throw new InputMismatchException();
			}
		} catch (InputMismatchException ex) {
			System.out.println("Input error!");
			return;
		}
		
		findAllPalindroms (n);
	}

	private static void findAllPalindroms (int n) {
		System.out.println("Palindrom numbers: ");
		for (int i = 0; i < n; i++) {
			if (isPalindrom(String.valueOf(i)))
				System.out.print(i + " ");
		}
	}
	
	private static boolean isPalindrom (String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
