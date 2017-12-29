package _pasted_code_;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int n = input.nextInt();
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		System.out.println("Factorial of " + n + " is: " + f);
	}

}