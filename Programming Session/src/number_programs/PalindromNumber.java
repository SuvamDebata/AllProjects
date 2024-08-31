package number_programs;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		 int a=sc.nextInt();
		 int k,n=0,b=a;
		 sc.close();
		 while(a>0)
		 {
			 k=a%10;
			 n=n*10+k;
			 a=a/10;
		 }
		 if (n==b)
			 System.out.println(n+" is a palindrom number ");
		 else
			 System.out.println(n+" is not a palindrom number ");
	}
}
