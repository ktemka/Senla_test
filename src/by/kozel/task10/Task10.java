package by.kozel.task10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//Написать программу, составляющую всевозможные комбинации 3-х
//значных чисел из 3-х введенных пользователем цифр. Цифры
//вводятся вручную.

public class Task10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array[] = new int[3];
		int num1 = 0, num2 = 0, num3 = 0;
		try {
			System.out.print("Enter 1 number: ");
			array[0] = in.nextInt();
			System.out.print("Enter 2 number: ");
			array[1] = in.nextInt();
			System.out.print("Enter 3 number: ");
			array[2] = in.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Input error!");
			return;
		}
		output(getCombinations(array));
	}

	private static List<Integer> getCombinations(int array[]) {
		Random rnd = new Random();
		int n  = getAmountOfCombinations(array.length);
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			int num = array[i] * 100;
			int amount = n / array.length;
			while (amount > 0) {
				int buff = num + array[rnd.nextInt(3)] * 10 + array[rnd.nextInt(3)];
				if (!numbers.contains(buff)) {
					numbers.add(buff);
					amount--;
				}
			}
		}
		return numbers;
	}

	private static void output(List<Integer> numbers) {
		System.out.println("All combinations: ");
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}

	}
	
	private static int getAmountOfCombinations (int n) {
		int count = 1;
		for (int i = 0; i < n; i++) {
			count *= n;
		}
		return count;
	}
}
