package number_programs;

import java.util.Scanner;

public class MultiplicationofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number: ");
		 int a=sc.nextInt();
		 int multi=1;
		 while (a>0)
		 {
			 if(a%10!=0)
			 multi=multi*(a%10);
			 a=a/10;
		 }
		 System.out.print("The sum of digits are: "+multi);
		 sc.close();

	}

}
