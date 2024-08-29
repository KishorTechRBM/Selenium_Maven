package Java_Codes;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the factorial number");
		int fact_number = sc.nextInt();
		int fact=1;
		for(int i=1;i<=fact_number;i++) {
			fact = fact*i;
		}
		System.out.println("Factoria of"+" " +fact_number+ " "+"is"+" "+fact );

	}

}
