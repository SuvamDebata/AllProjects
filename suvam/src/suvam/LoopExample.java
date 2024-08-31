package suvam;
import java.util.Scanner;
public class LoopExample {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter no of nos you want");
	int k=sc.nextInt();
	sc.close();
	int j;
	for(j=k;j>=1;j--)
	System.out.println(j);
	
}
}