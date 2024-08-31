package aLLjAVA;

import java.util.Scanner;

public class TargetChar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String: ");
	 String a=sc.next();
	 System.out.print("Enter the target character: ");
	 char t=sc.next().charAt(0);
	 sc.close();
	 char ch;
	 int k,count=0;
	 for (k=0;k<a.length();k++)
	 {
		 ch=a.charAt(k);
		 if (ch==t)
			 count++;
	 }
	 System.out.println(count+" times");
}
}
