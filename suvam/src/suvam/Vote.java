package suvam;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter choice");
		int choice=sc.nextInt();
		switch (choice)
		{
			case 1:
				System.out.println("vote for BJP"); break;
			case 2:
				System.out.println("vote for jitu"); break;
				default:
					System.out.println("invalid choice");
		}
					sc.close();
					
		}
}
