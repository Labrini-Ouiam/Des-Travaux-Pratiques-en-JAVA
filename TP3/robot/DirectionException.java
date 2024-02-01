package robot;

public class DirectionException extends Exception {

	public DirectionException() {
		System.out.println("La direction ne peut etre que NE et SO...");
	}
}
