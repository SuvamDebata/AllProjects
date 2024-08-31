package suvam;

import java.util.Scanner;

public class Extra {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter 1 for 7th table,\n2 for reverse odd,\n3 for even");
	int k=sc.nextInt();
	sc.close();
	int j=10;
	switch(k) {
	case 1:
		for (j=1;j<=10;j++)
			System.out.println("7 * "+j+"= "+7*j);
		break;
	case 2:
		while (j>0)
			if (j%2==0)
				System.out.print(j+" ");
		j--;
		break;
	case 3:
		for (j=1;j<=10;j++)
			if (j%2!=0)
			System.out.print(j+" ");
		break;
		default:
		System.out.println("invalid input");
	}
		
	}
}
