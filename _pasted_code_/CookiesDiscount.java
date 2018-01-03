package _pasted_code_;

import java.util.Scanner;

public class CookiesDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float cost_cookie = 5; // in cents
		float cost_cake = 3; // in cents

		Scanner scan = new Scanner(System.in);

		System.out.println("no of cookies");
		float n_cookies = scan.nextFloat();

		System.out.println("no of cakes");
		float n_cakes = scan.nextFloat();

		// 1$ = 100 cents
		float total_cost_Cookies = (cost_cookie * n_cookies) / 100; // in $
		System.out.println("total cost of Cookies: " + total_cost_Cookies + "$");
		
		float total_cost_cakes = (cost_cake * n_cakes) / 100; // in dollars
		System.out.println("total cost of Cakes: " + total_cost_cakes + "$");

		float CollectivePrice = total_cost_Cookies + total_cost_cakes;
		System.out.println("CollectivePrice = " + CollectivePrice + "$");

		if (CollectivePrice > 10) {
			double DiscountPrice = CollectivePrice - (CollectivePrice * 5) / 100;
			System.out.println("Discount(5%) price for an Item is: " + DiscountPrice);
		} else
			System.out.println("Discont does not apply and Price is: " + CollectivePrice);
	}

}