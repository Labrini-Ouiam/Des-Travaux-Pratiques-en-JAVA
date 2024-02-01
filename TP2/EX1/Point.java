package EX1;

import java.util.Objects;

public class Point {
	private double x,y;

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double calculerDistance(Point p) {
		return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
	}
	
	public Point(Point p) {
		//super();
		//this.setX(p.getX());
		//this.setY(p.getY());
		this(p.x,p.y);
	}

	public Point() {
		this(0.0,0.0); 
	}
	
	public Point(double x, double y) {
		//super();
		this.x = x;
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	@Override
	public String toString() {
		return "( "+x+","+y+" )";
	}
	
	public Point  calculerMilieu(Point p) {
		double xI = (this.x+p.x)/2;
		double yI = (this.y+p.y)/2;
		return new Point(xI,yI);
	}

	public void translater(double dx,double dy) {
		this.x+=dx;
		this.y+=dy;
	}
	
	public void homothetie(int k) {
		this.x*=k;
		this.y*=k;
	}
	
	public void  symetrie() {
		double tmp;
		tmp=this.x;
		this.y=this.x;
		this.x=tmp;
	}
	
	public void rotation() {
		double tmp;
		tmp = x;
		this.x=-this.y;
		this.y=tmp;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
	
	
	
	
	
}

