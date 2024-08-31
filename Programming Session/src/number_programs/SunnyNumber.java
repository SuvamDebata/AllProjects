package number_programs;

import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {
		

	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		 int a=sc.nextInt();
		 sc.close();
		 int k;
		 for (k=1;k<=a;k++)
			 if (k*k==a+1)
			 {
				 System.out.println(a+" is the is sunny");
				 break;
			 }
			 else if (k==a)
				 System.out.println(a+" is not a sunny");
		 
		 

}


}
