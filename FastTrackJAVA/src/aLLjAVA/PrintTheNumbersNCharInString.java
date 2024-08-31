package aLLjAVA;

import java.util.Scanner;

public class PrintTheNumbersNCharInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		 String a=sc.nextLine();
		 sc.close();
		 char ch;
		 int k;
		 String resnum="";
		 String reschar="",vowles="",consonants="";
		 String symbols ="";
		 for (k=0;k<a.length();k++)
		 {
			 ch=a.charAt(k);
			 if (ch>='0'&& ch<='9')
				 resnum=resnum+ch;
			 else if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z'))
			 {
				 reschar=reschar+ch;
			 		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			 			vowles=vowles+ch;
			 		else
			 			consonants=consonants+ch;
			 			
			 }
			 else
				 symbols=symbols+ch;
		 }
		 System.out.println("The digits are : "+resnum+" \n total no of char are: "+resnum.length());
		 System.out.println("The alphabets are : "+reschar+" \n total no of char are: "+reschar.length());
		 System.out.println("The vowles are : "+vowles+" \n total no of char are: "+vowles.length());
		 System.out.println("The consonants are : "+consonants+" \n total no of char are: "+consonants.length());
		 System.out.println("The symboles are : "+symbols+" \n total no of char are: "+symbols.length());
	}

}
