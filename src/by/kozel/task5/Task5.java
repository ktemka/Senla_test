package by.kozel.task5;

import java.util.Scanner;

//Создать программу, которая подсчитывает сколько раз
//употребляется слово в тексте (без учета регистра) . Текст и слово
//вводится вручную.

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter str: ");
		String str = in.nextLine();
		System.out.println("Enter word for find: ");
		String word = in.nextLine();
		System.out.println("Word meet in text " + findWord(str, word) + " times");
	}
	
	private static int findWord (String str, String word) {
		str = str.toLowerCase();
		word = word.toLowerCase();
		int count = 0;
		String[] words = str.split("[,. ]");
		for (String item : words) {
			if (item.contains(word)) {
				count++;
			}
		}
		return count;
	}
}
