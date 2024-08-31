package number_programs;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number: ");
		 int a=sc.nextInt();
		 int sum=0;
		 while (a>0)
		 {
			 sum=sum+(a%10);
			 a=a/10;
		 }
		 System.out.print("The sum of digits are: "+sum);
		 sc.close();

	}

}
