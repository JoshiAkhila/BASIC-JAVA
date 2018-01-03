package _pasted_code_;

import java.util.Scanner;

public class PurchaseDis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the ItemPrice");
		double ItemPrice = scan.nextDouble();

		if (ItemPrice > 10) {
			double DiscountPrice = ItemPrice - (ItemPrice * 5) / 100; 
			System.out.println("Discount(5%) price for an Item is: " + DiscountPrice);
		} else
			System.out.println("Discont does not apply");
	}

}
