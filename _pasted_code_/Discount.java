package _pasted_code_;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the ItemPrice");
		double ItemPrice = scan.nextDouble(); // in $

		double DiscountPrice = ItemPrice - (ItemPrice * 5) / 100; // 5% discount
		System.out.println("Discount(5%) price for an Item is: " + DiscountPrice);

	}

}
