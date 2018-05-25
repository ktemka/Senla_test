package by.kozel.task7;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//Написать программу, которая рандомно генерирует массив 2-ух
//значных чисел длины N (вводится вручную) и выводит наименьшее
//и наибольшее число из списка.

public class Task7 {

	public static void main(String[] args) {
		int lenght = 0;
		try {
			System.out.println("Enter lenght of array: ");
			lenght = new Scanner(System.in).nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Input error!");
			return;
		}
		int array[] = new int[lenght];
		fillArray(array);
		System.out.println("Maximum number: " + getMax(array));
		System.out.println("Minimum number: " + getMin(array));
	}
	
	private static int getMax (int array[]) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	private static int getMin (int array[]) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	private static void fillArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = getRandomNumber();
		}
	}
	// (-100; 100)
	private static int getRandomNumber () {
		boolean sign = new Random().nextBoolean();
		return (int)(Math.random() * 90 + (sign ? -10 : 10)); 
	}
}
