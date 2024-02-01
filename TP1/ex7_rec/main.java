package ex7_rec;

public class main {

	static int Fib(int n) {
		if(n<2) {
			return n;
		}else {
			return Fib(n-2)+Fib(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Fib(15) = "+Fib(15));
	}

}
