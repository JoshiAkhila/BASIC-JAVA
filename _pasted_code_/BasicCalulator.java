package _pasted_code_;

import java.util.Scanner;

public class BasicCalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int n1 =scan.nextInt();
		System.out.println("Enter the 2nd number");
		int n2 =scan.nextInt();
		Addition(n1,n2);
		substraction(n1,n2);
		multiplication(n1,n2);
		division(n1,n2);
		
	}

	private static void division(int n1, int n2) {
		// TODO Auto-generated method stub
		float division = n1/n2;
		System.out.println(n1+" "+ "/"+" "+ n2 +" "+"="+" "+ division);
	}

	private static void multiplication(int n1, int n2) {
		// TODO Auto-generated method stub
		int multiplication = n1*n2;
		System.out.println(n1+" "+ "*"+" "+ n2 +" "+"="+" "+ multiplication);
		
	}

	private static void substraction(int n1, int n2) {
		// TODO Auto-generated method stub
		int substraction = n1-n2;
		System.out.println(n1+" "+ "-"+" "+ n2 +" "+"="+" "+substraction);
	}

	private static void Addition(int n1, int n2) {
		// TODO Auto-generated method stub
		int sum = n1+n2;
		System.out.println(n1+" "+ "+"+" "+ n2 +" "+"="+" "+sum);
	}

}
