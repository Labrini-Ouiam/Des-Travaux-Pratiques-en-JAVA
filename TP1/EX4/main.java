package EX4;

import java.util.Scanner;

public class main {

	static boolean premier(int a) {
		for (int i = 2; i <= a / 2; ++i) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Entrer N :");
		int n = input.nextInt();
		for (int i = n; i > 0; --i) {
			if(premier(i)) {
				System.out.print(i+" , ");
			}
		}

	}

}
