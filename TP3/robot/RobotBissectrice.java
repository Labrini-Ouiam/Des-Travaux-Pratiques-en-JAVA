package robot;

public class RobotBissectrice extends Robot {

	public RobotBissectrice(String nom) {
		super(nom);
		this.direction="NE";
	}
	
	public RobotBissectrice(String nom,int x ,String direction) throws DirectionException {
		super(nom,x,x,direction);
		if(!direction.equals("NE")&&!direction.equals("SO")) {
			throw new DirectionException();
		}
	} 
	
	@Override
	public void avance() {
		if((direction.equals("NE") && x<0)||direction.equals("SO") && x>0) {
			this.x=-this.x;
			y=-y;
		}
		else if((direction.equals("NE")&&x>=0)){
			x++;
			y++;
		}
		else if((direction.equals("SO")&&x<=0)){
			x--;
			y--;
		}
	}

	@Override
	public void rotation() {
			if(direction.equals("NE"))direction="SO";
			else direction = "NE";
	}

	public void afficher() {
		System.out.print("Robot Bissectrice...");
		super.afficher();
	}
	
}
