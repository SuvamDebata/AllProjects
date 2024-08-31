package aLLjAVA;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		 String a=sc.next();
		 sc.close();
		 String rev="";
		 for(int k=a.length()-1;k>=0;k--)
		 {
			 char ch=a.charAt(k);
			 rev=rev+ch;
		 }
		 System.out.println(rev);
		 if(rev.equalsIgnoreCase(a))
			 System.out.println("Its a Palindrom");
		 else
			 System.out.println("Its not a Palindrom");

	}

}
