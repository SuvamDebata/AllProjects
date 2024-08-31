package number_programs;

import java.util.Scanner;

public class FirstDigitEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		 int a=sc.nextInt();
		 int k=0,b=a;
		 sc.close();
		 while(a>0)
		 {
			 k=a%10;
			 a=a/10;
		 }
		 if (k%2==0)
			 System.out.println(b+"'s 1st is "+k+" and its even.");
		 else
			 System.out.println(b+"'s 1st is "+k+" and its odd.");

}
}