package _pasted_code_;

import java.util.Scanner;

public class Quadratic_Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter input value");
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		System.out.println("input: " + X);
		int output = 3 * (int) Math.pow(X, 2) - 8 * X + 4;
		System.out.println("output: " + output); 
	}

}
