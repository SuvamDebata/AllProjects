package number_programs;

import java.util.Scanner;

public class Armstrong_Number_Range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Lower: ");
		 int a=sc.nextInt();
		 System.out.print("Enter the Upper: ");
		 int b=sc.nextInt();
		 System.out.print("The Armstrong numbers are: ");
		 sc.close();
		 int k,n,m,j,l;
		 for(k=a;k<=b;k++)
			 {
			 int count=0,sum=0;
			 n=k;
			 m=k;
			 while(n>0)
			 {
				 count++;
				 n=n/10;
			 }
			 while(m>0)
			 {	
				 l=m%10;
				int pwr=1;
				 for(j=1;j<=count;j++)
					 pwr=pwr*l;
				 sum=sum+pwr;
				 m=m/10;
			 }
			 if(k==sum)
				 System.out.print(sum+", ");
				 
			 }
		 
	
}
}
