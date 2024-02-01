package EX3;
import java.util.Scanner;
import java.util.InputMismatchException;
public class CentreDeSoutien {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Matiere[] mat = new Matiere[3];
		mat[0] = new Matiere("Sciences Mathématiques ",1500,2500,3500);
		mat[1] = new Matiere("Sciences Physiques ",1300,1500,3000);
		mat[2] = new Matiere("Sciences de la vie et de la terre ",1300,1500,3000);
		
		Enseignant[] en = new Enseignant[3];
		en[0] = new Enseignant("Rebbah", "amine",mat[0]);
		en[1] = new Enseignant("Charaf", "Said",mat[1]);
		en[2] = new Enseignant("Mouline", "Dhmed",mat[2]);
		
		Eleve[] elv=new Eleve[3];
		try {
		elv[0]=new Eleve("Maknasi","Aziza",mat[0],1);
		elv[1]=new Eleve("Chiban","Aziz",mat[1],2);
		elv[2]=new Eleve("Rmili","Redouane",mat[2],3);
		}catch(NiveauException e) {
			System.out.println(e.getMessage());
		}
		
		Directeur der=new Directeur("Alaoui","Mohammed","AlLogin","alaoui1256");
		
		System.out.println("-----Personnes---");
		der.status();
		for(Enseignant es:en) es.status();
		for(Eleve ev:elv) ev.status();
		for(Matiere mt:mat) System.out.println(mt);
		System.out.println("---Choix---");
		System.out.println("Maths: 0 \n Physique: 1 \n Sciences de la vie: 2");
		System.out.print("Votre choix:");
		int choix;
		try {choix = sc.nextInt();
		System.out.println(mat[choix]);
		}catch(InputMismatchException e) {System.out.println(e.getMessage());}
		catch(ArrayIndexOutOfBoundsException e) {System.out.println(e);}
		}
	}

