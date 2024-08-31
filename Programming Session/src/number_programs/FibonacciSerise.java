package number_programs;

import java.util.Scanner;

public class FibonacciSerise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		 int n=sc.nextInt(),a=0,b=1,c=0;
		 sc.close();
		 for(int k=1;k<=n;k++)
		 {
			 System.out.println(a);
			 c=a+b;
			 a=b;
			 b=c;
			 
		 }
		 System.out.println((b-a)+" is the "+n+"th term ");
	}
	

}
