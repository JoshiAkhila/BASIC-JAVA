package _pasted_code_;

public class DisplayStarts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("  ");
	}

}
