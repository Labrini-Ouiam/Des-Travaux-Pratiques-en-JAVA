package EX3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Entrez a (int) : ");
		int a = input.nextInt();
		System.out.print("Entrez b (int) : ");
		int b = input.nextInt();
		if(a+b!=0) {
		System.out.print("Entrez c (int) : ");
		int c = input.nextInt();

		// Lecture de la valeur de x
		System.out.print("Entrez x (double) : ");
		double x = input.nextDouble();

		double p = (double)((a + b) / 2) * Math.pow(x, 3) + Math.pow(a + b, 2) * Math.pow(x, 2) + a + b + c;
		
		System.out.print("P("+x+") = "+p);
		}
		else {
			System.out.print("Erreur ! (a+b=0) ");
		}
	}

}
