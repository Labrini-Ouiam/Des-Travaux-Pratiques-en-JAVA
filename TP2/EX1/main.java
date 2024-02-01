package EX1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez le premier point:");
		double xA = input.nextDouble();
		double yA = input.nextDouble();
		Point A = new Point(xA,yA);
		System.out.println("Entrez le deuxième point:");
		double xB = input.nextDouble();
		double yB = input.nextDouble();
		Point B = new Point(xB,yB);
		System.out.println("Entrez le troisième point:");
		double xC = input.nextDouble();
		double yC = input.nextDouble();
		Point C = new Point(xC,yC);
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		System.out.println("A i B :"+A.calculerMilieu(B));
		System.out.println("B i C :"+B.calculerMilieu(C));
		System.out.println("A i C :"+A.calculerMilieu(C));
		
		System.out.println("AB = "+A.calculerDistance(B));
		System.out.println("BC = "+B.calculerDistance(C));
		System.out.println("AC = "+A.calculerDistance(C));
		
		
		
		
		
	}

}
