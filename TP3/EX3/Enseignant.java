package EX3;

public class Enseignant extends Personne {

	private Matiere mat;
	
	public Enseignant(String nom, String prenom,Matiere mat) {
		super(nom, prenom);
		this.mat = mat;
	}

	@Override
	public void status() {
		System.out.println("Nom: "+getNom()+" "+getPrenom()+"Statut: Enseignant");

	}

	public Matiere getMat() {
		return mat;
	}

	public void setMat(Matiere mat) {
		this.mat = mat;
	}

}
