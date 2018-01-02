package _pasted_code_;

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Payrate;
		double hoursWorked;
		double Salary_month;

		Scanner scan = new Scanner(System.in);
		System.out.println("no of hours he/she worked per day");
		hoursWorked = scan.nextInt();

		System.out.println("pay rate value per hour");
		Payrate = scan.nextInt();

		Salary_month = hoursWorked * Payrate;
		System.out.println("salary of the person per month is: " + Salary_month);

	}

}
