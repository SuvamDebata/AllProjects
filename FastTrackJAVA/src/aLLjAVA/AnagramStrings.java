package aLLjAVA;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st String: ");
		 String a=sc.next();
		 System.out.print("Enter the 2nd String: ");
		 String b =sc.next();
		 sc.close();
		 int k, flag=0;
		 char ch []=a.toCharArray(), ch2 []= b.toCharArray();
		 if (a.length()!=b.length())
			 System.out.println("not anagram");
		 else
		 {
			 Arrays.sort(ch);
			 Arrays.sort(ch2);
			 for (k=0;k<ch.length;k++)
			 {
				 if (ch[k]==ch2[k])
					 flag=1;
				 else 
					 flag=0;
					 
			 }
			 if (flag==1)
				 System.out.println("anagram");//top_pot
			 else
				 System.out.println("not anagram");
		 }
		 
		 

	}

}
