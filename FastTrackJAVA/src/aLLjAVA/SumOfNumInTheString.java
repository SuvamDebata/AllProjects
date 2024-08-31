package aLLjAVA;

import java.util.Scanner;

public class SumOfNumInTheString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		 String a=sc.nextLine();
		 sc.close();
		 char ch;
		 int k,n,sum=0;
		 for (k=0;k<a.length();k++)
		 {
			 ch=a.charAt(k);
			 if (ch>='0'&& ch<='9')
			 {
				 n=ch;
				 sum=sum+(n-48);
			 }
		 }
		 System.out.println(sum);
}
}