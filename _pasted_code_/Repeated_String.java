package _pasted_code_;

import java.util.HashSet;
import java.util.Scanner;

public class Repeated_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scan.nextLine();
		char[] arr = input.toCharArray();
		System.out.println("Repeated Character is: " + CheckString(arr));
	}

	private static char CheckString(char[] arr) {
		// TODO Auto-generated method stub
		HashSet<Character> hash = new HashSet<>();
		int length = arr.length;
		for (int c = 0; c < length; c++) {
			char Character = arr[c];
			if (hash.contains(Character))
				return Character;
			else
				hash.add(Character);
		}
		return 0;

	}
}
