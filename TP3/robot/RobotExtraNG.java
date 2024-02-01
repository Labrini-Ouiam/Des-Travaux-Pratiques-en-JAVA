package robot;

public class RobotExtraNG extends RobotExtra {

	private boolean turbo;
	
	public RobotExtraNG(String nom) {
		super(nom);
		turbo=false;
	}
	
	public RobotExtraNG(String nom,int x,int y, String direction) {
		super(nom,x,y,direction);
		turbo=false;
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

	@Override
	public void avance() {
		if(turbo) {
			super.avance();
			super.rotation();
			super.avance();
		}
		else {
			super.avance();
		}
	}
	
	public void avance(int n) {
		int i;
		for(i = 0; i < n; i++) {
			super.avance();
		}
	}
	
	public void rotationGauche() {
		for(int i=1;i<=7;i++) {
			super.rotation();
		}
	}
	
	public void demiTour() {
		for(int i=1;i<=4;i++) {
			super.rotation();
		}
	}
	
	public void afficher() {
		System.out.print("Robot ExtraNG...");
		System.out.println(turbo);
		super.afficher();
	}
}
