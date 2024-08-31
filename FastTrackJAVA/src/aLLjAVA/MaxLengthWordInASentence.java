package aLLjAVA;

import java.util.Scanner;

public class MaxLengthWordInASentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		 String a=sc.nextLine();
		 sc.close();
		 String word="";
		 int temp=0;
		 String res="";
		 for(int i=0;i<a.length();i++)
		 {
			 char ch=a.charAt(i);
			 
			 if(ch!=' ') {
				 word=word+ch;
			 }
			 else {
			 if(word.length()>temp)
              {
            	  temp=word.length();
            	  res=word;
              }
			   word="";
			 }

		 }
		 System.out.println(temp);
		 System.out.println(res);
	}

}
