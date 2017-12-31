package _pasted_code_;

public class Sum_N_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of square of first n numbers");
		int n = 1;
		int Sum = 0;
		while (n <= 4) {
			int square = n * n;
			n++;
			Sum = Sum + square;
		}
		System.out.println("1^2+2^2+3^2+4^2 = " + Sum);
	}

}