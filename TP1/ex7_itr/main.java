package ex7_itr;

public class main {

	static int Fib(int n) {
		int i,nb1=0,nb2=1,res=0;
		for(i=0;i<=n;i++) {
			if(i<=1) {
				res=i;
			}else {
				res = nb1+nb2;
				nb1 = nb2;
				nb2 = res;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("F(15) = "+Fib(15));
	}

}
