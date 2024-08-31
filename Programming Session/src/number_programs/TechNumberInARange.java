package number_programs;

import java.util.Scanner;

public class TechNumberInARange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Lower: ");
		 int x=sc.nextInt();
		 System.out.print("Enter the Upper: ");
		 int y=sc.nextInt();
		 sc.close();
		 for (int j=x;j<=y;j++)
		 {
			 int n=j;
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
				System.out.println(d+" is a Tech Number");
		 }
		else
			System.out.println("There is no Tech Number in the range");
			
			
		 }
	}

	}


