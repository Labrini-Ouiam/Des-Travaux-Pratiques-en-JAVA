package ex5_rec;

import java.util.Scanner;
public class main {
	
	static int factoriel(int a) {
		if(a==1) {
			return 1;
		}
		else {
		return a*factoriel(a-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Entrez un entier :");
		int n = input.nextInt();
		System.out.print(n+"!= "+factoriel(n));
		
	}

}
