package number_programs;

import java.util.Scanner;

public class Count_the_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number: ");
		 int a=sc.nextInt();
		 int count=0;
		 while (a>0)
		 {
			 a=a/10;
			 count++;
		 }
		 System.out.print("The no of digits are: "+count);
		 sc.close();
	}

}
