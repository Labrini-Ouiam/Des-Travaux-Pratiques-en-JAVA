package robot;

public class RobotTest {

	public static void main(String[] args) throws DirectionException {
		Robot[] robot = new Robot[3];
		robot[0] = new RobotBissectrice("Danel" ,7 ,"NE");
		robot[1] = new RobotExtraNG("Bonbon" ,6,-10,"Nord");
		robot[2] = new RobotExtraNG("Sinsodine" ,15,-15,"SO");
		
		robot[0].rotation();
		robot[0].avance();
		robot[0].avance();
		robot[0].afficher();
		
		
	}

}
