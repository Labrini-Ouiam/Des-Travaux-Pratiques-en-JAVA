package EX1;

public class TroisPoints {
	
	private Point A,B,C;
	
	public TroisPoints(Point a, Point b, Point c) {
		//super();
		A = a;
		B = b;
		C = c;
	}

	

	public Point getA() {
		return A;
	}

	public void setA(Point a) {
		A = a;
	}

	public Point getB() {
		return B;
	}

	public void setB(Point b) {
		B = b;
	}

	public Point getC() {
		return C;
	}

	public void setC(Point c) {
		C = c;
	}
	
	public boolean sontAlignes() {
        double penteAB = (B.getY() - A.getY()) / (B.getX() - A.getX());
        double penteAC = (C.getY() - A.getY()) / (C.getX() - A.getX());
        return penteAB == penteAC;
    }
	
	public boolean estTriangle() {
		return !sontAlignes();
	}
	
	 public boolean estIsocele() {
	        double AB = A.calculerDistance(B);
	        double AC = A.calculerDistance(C);
	        double BC = B.calculerDistance(C);
	        return AB == AC || AB == BC || AC == BC;
	    }
	 
	 public boolean estEquilateral() {
	        double AB = A.calculerDistance(B);
	        double AC = A.calculerDistance(C);
	        double BC = B.calculerDistance(C);
	        return AB == AC && AB == BC;
	    }
	 
	 public boolean estRectangle() {
	        double AB = A.calculerDistance(B);
	        double AC = A.calculerDistance(C);
	        double BC = B.calculerDistance(C);
	        double sommeD = 0;
	        double maxDist = Math.max(AB,Math.max(AC, BC));
	        if(maxDist == AB) {
	        	sommeD+=Math.pow(AC,2)+Math.pow(BC,2);
	        }else if(maxDist == BC) {
	        	sommeD+=Math.pow(AC,2)+Math.pow(AB,2);
	        }else {
	        	sommeD+=Math.pow(AB,2)+Math.pow(BC,2);
	        }
	        return Math.pow(maxDist, 2) ==  sommeD;
	 }
}
