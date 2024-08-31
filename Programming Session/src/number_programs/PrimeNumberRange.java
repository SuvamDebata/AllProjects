package number_programs;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the lower range: ");
			 int a=sc.nextInt();
			 System.out.print("Enter the upper: ");
			 int b=sc.nextInt();
			 int k,j,count;
			 for(k=a;k<=b;k++)
			 {
			 count=0;
			 for(j=1;j<=k;j++)
				 if(k%j==0)
					 count++;
			 if(count==2)
				 System.out.print(k+" ");
			 }
			 
			 sc.close();

	}

}
