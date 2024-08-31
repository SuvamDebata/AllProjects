package number_programs;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		 int b=sc.nextInt();
		 sc.close();

	int c=HappyNumber.sumSqure(b);
	while (c>9)
	{
		c=HappyNumber.sumSqure(c);
	if(c==1)
		System.out.print("Its happy");
	else if (c==4)
		System.out.print("Its unhappy");
	else
		c=HappyNumber.sumSqure(c);
	}
	
}
	public static int sumSqure(int n)
	{
		int a=0,sum=0;
		while (n>0)
		{
		 a=n%10;
		 sum=sum+(a*a);
		 n=n/10;
		}
		 return sum;
	}

}
