package number_programs;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number: ");
			 int a=sc.nextInt();
			 int k;
			 for(k=1;k<=a;k++)
				 if(a%k==0)
				 System.out.print(k+" ");
sc.close();
		}	 

	}

}
