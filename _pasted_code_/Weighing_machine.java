package _pasted_code_;

import java.util.Scanner;

public class Weighing_machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter left side weight");
		int a = scan.nextInt();

		System.out.println("Enter right side weight");
		int b = scan.nextInt();

		if (a == b) {
			System.out.println("Both are same weights");
		} else {
			System.out.println("Both are not same weights");
		}
	}
}
