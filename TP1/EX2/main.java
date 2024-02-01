package EX2;

import java.util.Scanner;

public class main {
	static Scanner input = new Scanner(System.in);

	static double lireDonnee(String s) {
		System.out.print("Entrer la "+s+" :");
		double r = input.nextDouble();
		return r;
	}

	static boolean testerDonnees(double a, double b) {
		return a >= 0 && b >= 0;
	}

	static double calculerS(double a, double b) {
		return a * b;
	}

	static double calculerP(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		double largeur = lireDonnee("largeur");
		double hauteur = lireDonnee("hauteur");
		boolean donneesOk = testerDonnees(largeur, hauteur);
		if (donneesOk) {
			System.out.print("Surface ('s/S') ou perimetre ('p/P')?:");
			char c = input.next().charAt(0);
			if (c == 's' || c == 'S') {
				System.out.print("la surface est :" + calculerS(largeur, hauteur));
			} else if (c == 'p' || c == 'P') {
				System.out.print("le perimetre est :"+calculerP(largeur,hauteur));
			}
		}else {
			System.out.print("Erreur: vous avez introduit une largeur ou une hauteur negative!");
		}
			
	}
}
