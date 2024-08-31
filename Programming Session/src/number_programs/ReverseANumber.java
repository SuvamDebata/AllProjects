package number_programs;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		 int a=sc.nextInt();
		 int k,n=0;
		 sc.close();
		 while(a>0)
		 {
			 k=a%10;
			 n=n*10+k;
			 a=a/10;
		 }
		 System.out.println("Reversed no is: "+n);
	
	}

}
