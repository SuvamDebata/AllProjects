package number_programs;

import java.util.Scanner;

public class BaseToPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Base: ");
		 int n=sc.nextInt();
		 System.out.print("Enter the Power: ");
		 int p=sc.nextInt();
		 sc.close();
		 int k,mul=1;
		 for(k=1;k<=p;k++)
			 mul=mul*n;
		 System.out.println(mul);
		 
			 
	}
}
