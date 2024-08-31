package aLLjAVA;

import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String a=sc.next();
		sc.close();
		String s="",res="";
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
				if(count==1) {
				res=res+ch;
			}
			
		}
		}System.out.println(res);
	}
		
	}