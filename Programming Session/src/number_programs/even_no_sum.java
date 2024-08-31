package number_programs;

import java.util.Scanner;

public class even_no_sum {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the lower range: ");
			 int a=sc.nextInt();
			 System.out.print("Enter the upper range: ");
			 int b=sc.nextInt();
			 int k,sum=0;
			 for (k=a;k<=b;k++) {
				 if (k%2==0)
				 sum = sum+k;
			 }
			 System.out.println("The Sum is "+sum);
sc.close();
		}
	}

}


