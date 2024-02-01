package EX2;

public class Complexe {

	private double re,im;
	
	public Complexe(){
		re = 1;
		im = 1;
	}
	
	public Complexe(double re , double im){
		this.re = re;
		this.im = im;
	}
	
	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}

	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}

	public Complexe(Complexe z) {
		this(z.re,z.im);
	}
	
	public String toString() {
		String res = "";
		if(re != 0) {
			res += re;
		}
		if(im > 0) {
			res += " + i"+im;
	 	}else if(im < 0) {
	 		res += " - i"+Math.abs(im);
	 	}
		return res;
	}

	public Complexe add(Complexe z) {
		Complexe s;
		s.re+=z.re;
		s.im+=z.im;
		return s;
	}
	
	public Complexe mult() {
		Complexe m;
		m.re=(this.re.
	}
	
	public void sous() {
			
	}
	
	public void div() {
		
	}

}










