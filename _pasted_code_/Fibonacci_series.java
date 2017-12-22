package _pasted_code_;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		series(n);
	}

	private static void series(int n) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 1;
		System.out.print(x + " " + y);
		int F;
		for (int i = 2; i <= n; i++) {
			F = x + y;
			x = y;
			y = F;

			System.out.print(" " + F);
		}
	}
}
