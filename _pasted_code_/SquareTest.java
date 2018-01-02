package _pasted_code_;

import java.util.Scanner;

public class SquareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a and b value");
		int a = scan.nextInt();
		int b = scan.nextInt();
		for (int i = a; i <= b ; i++) {
			int square = i * i;
			System.out.println(i + " " + square);
		}
	}
}
