package ex5_itr;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Entrez un entier :");
		int n = input.nextInt();
		int r=1;
		for (int i = n; i > 0; --i) {
			r*=i;
		}
		System.out.print(n+"! = "+r);
	}

}
