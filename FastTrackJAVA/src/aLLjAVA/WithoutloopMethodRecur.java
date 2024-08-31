package aLLjAVA;

import java.util.Scanner;

public class WithoutloopMethodRecur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter \n 1: for Increasing \n 2: for Reverse \n 3: "
				+ "for Odd \n 4: for Even \n 5: for RevOdd \n 6: for RevEven: ");
		 int choice=sc.nextInt();
		System.out.print("Enter the Lower: ");
		 int a=sc.nextInt();
		 System.out.print("Enter the Upper: ");
		 int b=sc.nextInt();
		 sc.close();
		 switch(choice) {
		 case 1:
			 WithoutloopMethodRecur.numbInc(a,b);
			 break;
		 case 2:
			 WithoutloopMethodRecur.numbRev(a,b);
			 break;
		 case 3:
			 WithoutloopMethodRecur.numbOdd(a,b);
			 break;
		 case 4:
			 WithoutloopMethodRecur.numbEven(a,b);
			 break;
		 case 5:
			 WithoutloopMethodRecur.numbRevOdd(a,b);
			 break;
		case 6:
			WithoutloopMethodRecur.numbRevEven(a,b);
			break;
		default:
			System.out.print("Invalid choice");
		 }
			 

	}
	public static void numbInc(int c, int d) {
		if(c>d)
			return;
		System.out.println(c);
		c++;
		WithoutloopMethodRecur.numbInc(c,d);
	}
	public static void numbRev(int c, int d) {
		if(d<c)
			return;
		System.out.println(d);
		d--;
		WithoutloopMethodRecur.numbRev(c,d);
	}
	public static void numbOdd(int c, int d) {
		if(c%2!=0)
			System.out.println(c);
		if(c>d)
			return;
		c++;
		WithoutloopMethodRecur.numbOdd(c,d);
	}
	public static void numbEven(int c, int d) {
		if(c%2==0)
			System.out.println(c);
		if(c>d)
			return;
		c++;
		WithoutloopMethodRecur.numbEven(c,d);
	}
	public static void numbRevOdd(int c, int d) {
		if(d%2!=0)
			System.out.println(d);
		if(d<c)
			return;
		d--;
		WithoutloopMethodRecur.numbRevOdd(c,d);
	}
	public static void numbRevEven(int c, int d) {
		if(d%2==0)
			System.out.println(d);
		if(d<c)
			return;
		d--;
		WithoutloopMethodRecur.numbRevEven(c,d);
	}

}
