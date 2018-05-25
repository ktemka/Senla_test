package by.kozel.task3;

import java.util.Scanner;

//Необходимо написать программу, которая проверяет слово на
//"палиндромность". Слово для проверки вводится вручную во время
//выполнения программы.

public class Task3 {

	public static void main(String[] args) {
		System.out.print("Enter word: ");
		String str = new Scanner(System.in).nextLine();
		System.out.println("You word is " + (isPalindrome(str) ? "palindrome" : "not a palindrome"));
	}
	
	private static boolean isPalindrome (String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
