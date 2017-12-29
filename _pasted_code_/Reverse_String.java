package _pasted_code_;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the original string");
		String input = "", reverse = "";
		input = scan.nextLine();

		int length = input.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		System.out.println(reverse);
	}

}
