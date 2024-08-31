package number_programs;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		 int n=sc.nextInt();
		 sc.close();
		 int count=0,d=n;
		 while (n>0)
		 {
			 count=count+1;
			 n=n/10;
		 }
		 if(count % 2==0)
		 {
			int half=count/2;
			int pwr=1;
			for (int k=1;k<=half;k++)
				pwr=pwr*10;
			int c=d%pwr;
			int e=d/pwr;
			int sum=e+c;
			
			if(sum*sum==d)
				System.out.println("Its a Tech Number");	
			else
				System.out.println("Its Not a Tech Number");
		 }
		else
			System.out.println("Its Not a Tech Number");
			
			
		 }

	}


