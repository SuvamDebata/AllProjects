package number_programs;

import java.util.Scanner;

public class OddInRange {

	public static void main(String[] args) {
		 try (Scanner var = new Scanner(System.in)) {
			System.out.println("enter the upper range");
			 int a=var.nextInt();
			 System.out.println("enter the lower range");
			 int b=var.nextInt();
			 int k;
			 for (k=a;k<=b;k++) 
			 {
				if (k%2!=0)
				{if (k!=b)
						 System.out.print(k+", ");
				  else
					System.out.print(k+".");
				}
			 }
			 System.out.println();
var.close();
		}

}
}