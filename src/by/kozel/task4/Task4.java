package by.kozel.task4;

import java.util.Arrays;
import java.util.Scanner;

//Создать программу, которая будет подсчитывать количество слов в
//предложении и выводить их в отсортированном виде. Предложение
//вводится вручную. (Разделители пробел (“ ”) и запятая (“,”)).

public class Task4 {

	public static void main(String[] args) {
		System.out.println("Enter str: ");
		String str = new Scanner(System.in).nextLine();
		String[] words = getWords(str);
		System.out.println("Amount of words: " + words.length);
		System.out.println("Sorted words: ");
		Arrays.sort(words);
		output(words);
		
	}
	
	private static String[] getWords (String str) {
		return str.split("[, ]");
	}
	
	private static void output (String[] str) {
		for (String item : str) {
			System.out.print(item + " ");
		}
	}

}
