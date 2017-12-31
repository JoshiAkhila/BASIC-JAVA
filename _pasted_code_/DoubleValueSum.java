package _pasted_code_;

import java.util.Scanner;

public class DoubleValueSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an double value");
		Scanner scan = new Scanner(System.in);
		boolean integer = scan.hasNextDouble();

		double Sum = 0d;
		while (integer) {
			double value = scan.nextDouble();
			Sum = Sum + value;
			System.out.println(Sum);
			System.out.println("Enter an double value");
		}

	}

}
