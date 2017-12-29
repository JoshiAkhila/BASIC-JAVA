package _pasted_code_;

import java.util.Scanner;

public class ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input");
		String input = scan.nextLine();
		replecespace(input);
	}

	private static String replecespace(String input) {
		// TODO Auto-generated method stub

		String[] words = input.split(" ");
		StringBuilder SB = new StringBuilder(words[0]);
		for (int i = 1; i < words.length; i++) {
			SB.append("20%");
			SB.append(words[i]);
		}
		System.out.println(SB.toString().trim());
		return null;
	}
}
