package aLLjAVA;

import java.util.Scanner;

public class AlternateCharChange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String b=sc.nextLine(),res="";
		sc.close();
		char ch,ch2;
		int k,a;
		for (k=0;k<b.length();k++) 
		{
			ch=b.charAt(k);
			if (k%2==0&&ch>='a'&&ch<='z')
			{
				a =ch;
				a=a-32;
				ch2=(char) a;
				res=res+ch2;
			}
			else if(k%2!=0&&ch>='A'&&ch<='Z')
			{
				a =ch;
				a=a+32;
				ch2=(char) a;
				res=res+ch2;
			}
			else
				res=res+ch;
		}
		System.out.println(res);

	}

}
