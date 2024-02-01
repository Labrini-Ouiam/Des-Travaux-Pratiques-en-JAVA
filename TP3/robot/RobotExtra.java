package robot;

public class RobotExtra extends Robot {

	public RobotExtra(String nom) {
		super(nom);
	}
	
	public RobotExtra(String nom, int x, int y, String direction) {
		super(nom,x,y,direction);
	}
	
	@Override
	public void avance() {
		switch(direction) {
		case "Nord":y++ ;break;
		case "NE" :x++;y++;break;
		case "Est" :x++;break;
		case "SE" :x++;y--;break;
		case "Sud" :y--;break;
		case "SO" :x--;y--;break;
		case "Ouest" :x--;break;
		case "NO" :x--;y++;break;
		}
	}
	
	@Override
	public void rotation() {
		switch(direction) {
		case "Nord" :direction="NE";break;
		case "NE" :direction="Est";break;
		case "Est" :direction="SE";break;
		case "SE" :direction="Sud";break;
		case "Sud" :direction="SO";break;
		case "SO" :direction="Ouest";break;
		case "Ouest" :direction="NO";break;
		case "NO" :direction="Nord";break;
		}
	}

	public void afficher() {
		System.out.println("Robot Extra...");
		super.afficher();
	}
	
	
}
