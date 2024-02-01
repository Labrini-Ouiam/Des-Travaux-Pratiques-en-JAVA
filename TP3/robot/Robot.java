package robot;

public abstract class Robot {
	
	protected String nom;
	protected int x;
	protected int y;
	protected String direction;
	
	public Robot(String nom) {
		this.nom = nom;
		this.x = 0;
		this.y = 0;
		this.direction = "Est";
	}
	
	public Robot(String nom, int x, int y, String direction) {
		this(nom);
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public abstract void avance();
	public abstract void rotation();
	public void afficher() {
		System.out.println("Nom: "+nom);
		System.out.println("Position: ("+x+","+y+")");
		System.out.println("Direction: "+direction);
	}
	
}
