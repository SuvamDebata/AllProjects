package suvam;
import java.util.Scanner;
public class AtoZ {
 public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
	System.out.println("enter no of alphabate you want");
		int k=sc.nextInt();
		sc.close();
		int j=k+65;
		int p;
		char a;
			for(p=65;p<j;p++)
			{
				a=(char)p;
				System.out.println(a);
			}
 }

}


