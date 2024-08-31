package number_programs;

import java.util.Scanner;

public class SqrRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number: ");
			 int a=sc.nextInt();
			 sc.close();
			 int k;
			 for (k=1;k<=a;k++)
				 if (k*k==a)
				 {
					 System.out.println(k+" is the sqr root");
					 break;
				 }
				 else if (k==a)
					 System.out.println("There is no sqr root");
			 
			 

}
}
