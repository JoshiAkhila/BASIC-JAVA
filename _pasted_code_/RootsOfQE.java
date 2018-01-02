package _pasted_code_;

import java.util.Scanner;

public class RootsOfQE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for a,b and c");

		System.out.println("Enter value of a");
		double a = Double.parseDouble(scan.nextLine());

		System.out.println("Enter value of b");
		double b = Double.parseDouble(scan.nextLine());

		System.out.println("Enter value of c");
		double c = Double.parseDouble(scan.nextLine());

		// double d= Math.sqrt(Math.pow(b, 2) - (4 * a * c)); // check for NAN

		double root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		double root2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

		if (Double.isNaN(root1) || Double.isNaN(root2)) {
			System.out.println("no roots");
		} else
			System.out.println("The roots are: " + root1 + ", " + root2);
	}

}
