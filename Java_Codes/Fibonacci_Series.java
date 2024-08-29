package Java_Codes;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3,term;
		n1=0;
		n2=1;
		term=5;
		System.out.print(n1 +" "+n2);
		for(int i=0;i<=term;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
