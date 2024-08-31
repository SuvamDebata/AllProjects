package aLLjAVA;

import java.util.Scanner;

public class AlphabateCount {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String: ");
	String a=sc.nextLine();
	sc.close();
	String s="", s1="";
	char ch,t;
	int k,j;
	for (k=0;k<a.length();k++)
	{
		int count=1;
		ch=a.charAt(k);
		if (s.indexOf(ch)==-1) 
		{
			for (j=k+1;j<a.length();j++)
			{
				t=a.charAt(j);
				if (ch==t)
					count++;
			}
			
			s=s+ch;
			if (count==1) 
				s1=s1+ch;
			System.out.println(ch+"-"+count);
		}
		
	}
	System.out.println(s+" : is without repeateation");
	System.out.println(s1+" : are the distinct characters");
}
}
