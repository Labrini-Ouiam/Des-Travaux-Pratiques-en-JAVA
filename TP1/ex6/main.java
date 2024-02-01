package ex6;
import java.util.Scanner;
public class main {

	static int sommeDiviseurs(int a) {
		int s = 0;
		for (int i = 1; i <= a / 2; ++i) {
			if(a%i==0) {
				s+=i;
			}
		}
		return s;
	}
	
	static boolean amiable(int a ,int b) {
		return a == sommeDiviseurs(b) && b == sommeDiviseurs(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Entrer un entier :");
		int n = input.nextInt();
		
		
	}

}
