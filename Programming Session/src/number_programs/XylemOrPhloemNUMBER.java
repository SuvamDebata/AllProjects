package number_programs;

import java.util.Scanner;

public class XylemOrPhloemNUMBER {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		 int a=sc.nextInt();
		 int k=0,b=a, c=a%10,inr=0;
		 a=a/10;
		 sc.close();
		 while(a>0)
		 {
			 k=a%10;
			 if(a>9)
				 inr=inr+k;
			 a=a/10;
		 }
		 if ((c+k)==inr)
			 System.out.println(b+" is xylem number.");
		 else
			 System.out.println(b+" is not xylem number.");

}
}
