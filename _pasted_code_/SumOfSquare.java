package _pasted_code_;

import java.util.Scanner;

public class SumOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an integer");
		Scanner scan = new Scanner(System.in);
		boolean integer = scan.hasNext();

		int Sum = 0;
		while (integer) {
			int n = scan.nextInt();
			int square = n * n;
			Sum = Sum + square;
			System.out.println("Sum = " + Sum);

		}

	}

}