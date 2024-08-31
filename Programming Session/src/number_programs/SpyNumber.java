package number_programs;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number: ");
		 int a=sc.nextInt();
		 int multi=1,sum=0;
		 while (a>0)
		 {
			 sum=sum+(a%10);
			 multi=multi*(a%10);
			 a=a/10;
		 }
		 if (sum==multi)
		 System.out.print("Hooraa!!! Its a Spy Number");
		 else
		 System.out.print("Oh noo!!! Its not a Spy Number");
		 sc.close();

	}

}
