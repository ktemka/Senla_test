package by.kozel.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

//Необходимо написать программу, которая проверяет слово на
//"палиндромность". Слово для проверки вводится вручную во время
//выполнения программы.

public class Task2 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter first number: ");
			num1 = in.nextInt();
			System.out.println("Enter second number: ");
			num2 = in.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Input error!");
			return;
		}
		
		System.out.println("LCM = " + getLcm(num1, num2));
		System.out.println("GCD = " + getGcd(num1, num2));
		System.out.println("Sum = " + getSum(num1, num2));
		System.out.println("Substract = " + getSubstract(num1, num2));
	}

	private static int getLcm(int num1, int num2) {
		return num2 == 0 ? num1 : getLcm(num2, num1 % num2);
	}
	
	private static int getGcd(int num1, int num2) {
		return (num1 * num2) / getLcm(num1, num2);
	}

	private static int getSum (int num1, int num2) {
		return num1 + num2;
	}
	
	private static int getSubstract (int num1, int num2) {
		return num1 - num2;
	}
}
