package EX3;

public class Matiere {
	
	private String nomM;
	private int prixTc,prixBac1,prixBac2;
	
	public Matiere(String nomM, int prixTc, int prixBac1, int prixBac2) {
		this.nomM = nomM;
		this.prixTc = prixTc;
		this.prixBac1 = prixBac1;
		this.prixBac2 = prixBac2;
	}
	
	public String toString() {
		return nomM+"->(Niveau 1: " +prixTc+" Dh),(Niveau 2 : " +prixBac1+"Dh),(Niveau 3 :" + prixBac2+" Dh)";
	}

	public void setNomM(String nomM) {
		this.nomM = nomM;
	}

	public void setPrixTc(int prixTc) {
		this.prixTc = prixTc;
	}

	public void setPrixBac1(int prixBac1) {
		this.prixBac1 = prixBac1;
	}

	public void setPrixBac2(int prixBac2) {
		this.prixBac2 = prixBac2;
	}
	
}
