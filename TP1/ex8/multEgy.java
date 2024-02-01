package ex8;

public class multEgy {

	static int multiplicationEgyptienne(int a ,int b) {
		
		 if (a == 0)
			    return 0;
			  else if (a % 2 == 0)
			    return multiplicationEgyptienne(a / 2, 2*b);
			  else if (a % 2 == 1)
			    return multiplicationEgyptienne(a - 1, b) + b;
			  else
			    return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(multiplicationEgyptienne(8,6));
	}

}
