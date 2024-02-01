package EX3;

public class Eleve extends Personne {

	private Matiere mat;
	private int niv;
	
	public Eleve(String nom, String prenom,Matiere mat,int niv) throws NiveauException {
		super(nom, prenom);
		this.mat = mat;
		if(niv<1 || niv>3) throw new NiveauException();
		else this.niv = niv;
		}

	@Override
	public void status() {
		System.out.println("Nom: "+getNom()+" "+getPrenom()+"Statut: Elève");
	}

	public Matiere getMat() {
		return mat;
	}

	public void setMat(Matiere mat) {
		this.mat = mat;
	}

	public int getNiv() {
		return niv;
	}

	public void setNiv(int niv) {
		this.niv = niv;
	}
	
}
