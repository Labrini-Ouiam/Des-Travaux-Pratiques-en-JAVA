package EX3;

public class Directeur extends Personne {

	private String nomC,pass;
	
	public Directeur(String nom, String prenom,String nomc,String psswd) {
		super(nom, prenom);
		this.nomC=nomc;
		this.pass=psswd;
	}

	public String getNomC() {
		return nomC;
	}

	public void setNomC(String nomC) {
		this.nomC = nomC;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public void status() {
		System.out.println("Nom: "+getNom()+" "+getPrenom()+"Statut: Directeur");
	}

}
