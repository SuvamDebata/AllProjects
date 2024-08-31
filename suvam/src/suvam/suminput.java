package suvam;

import java.util.Scanner;

public class suminput {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the value of A");
	int a = sc.nextInt();
	System.out.println("Enter the value of B");
	int b = sc.nextInt();
	int c= a+b;
	System.out.println("The sum is "+c);
	sc.close();
}
}

