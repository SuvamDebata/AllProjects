package number_programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		 int n=sc.nextInt(),factorial=1;
		 sc.close();
		 for (int k=1;k<=n;k++)
			 factorial=factorial*k;
		 System.out.println(factorial+" is the factorial");
	}

}
