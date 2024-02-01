package ex9;
import java.util.Scanner;
public class syracuse {
	static Scanner input = new Scanner(System.in);

	public static int syracuse(int u0 ,int n) {
		int u = u0;
		for(int i = 1 ; i<=n;i++) {
			if(u % 2 == 0) {
				u=u/2;
			}else {
				u=3*u+1;
			}
		}
		return u;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Entrer Uo :");
		int u0 = input.nextInt();
		int i =0 ;
		while(syracuse(u0,i)!=1) {
			i++;
		}
		System.out.println("La premiere valeur de n avec un=1 est "+i);
		
	}

}
