package number_programs;

import java.util.Scanner;

public class LargestDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number: ");
		 int a=sc.nextInt();
		 int min=a%10, max=a%10;
		 while (a>0)
		 {
			 if(a%10>max)
				 max=a%10;
			 if(a%10<min)
				 min=a%10;
			 a=a/10;
		 }
		 System.out.println("The Largest digit in your number is: "+max);
		 System.out.println("The Smallest digit in your number is: "+min);

		 sc.close();

	}
}
