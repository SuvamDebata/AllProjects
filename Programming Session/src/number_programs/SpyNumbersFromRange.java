package number_programs;

import java.util.Scanner;

public class SpyNumbersFromRange {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the lower range: ");
			 int a=sc.nextInt();
			 System.out.print("Enter the upper range: ");
			 int b=sc.nextInt();
			 int multi,sum,j,k;
			 for(k=a;k<=b;k++) 
			 {
				 j=k;
				 multi=1;
				 sum=0;
			 while (j>0)
			 {
				 sum=sum+(j%10);
				 multi=multi*(j%10);
				 j=j/10;
			 }
			 if (sum==multi)
			 System.out.print(k+" ,");
			 }
			 sc.close();
		}
	}

}
