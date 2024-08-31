package number_programs;

import java.util.Scanner;

public class HCF_LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st Number: ");
		 int a=sc.nextInt();
		 System.out.print("Enter the 2nd Number: ");
		 int b=sc.nextInt(), hcf=0, lcm=0;
		 sc.close();
		 for(int k=1;k<=a&&k<=b;k++)
			 if (a%k==0&&b%k==0)
				 hcf=k;
		 lcm=(a*b)/hcf;
		 System.out.println(hcf+" Is the HCF \n"+lcm+" Is the LCM");

	}

}
