package aLLjAVA;

import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Choice");
		System.out.print("Enter \n 1: for ArrayOperations\n 2: for Array Percentage \n 3: "
				+ "for Fruits \n 4: for Character \n 5: for RevOdd \n 6: for RevEven: ");
		int choice=sc.nextInt();
		sc.close();
		switch (choice)
		{
		case 1:
		System.out.print("Enter the Size: ");
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int k=0;k<=n-1;k++)
		{
			System.out.print("Enter the value "+k+": ");
			a[k]=sc.nextInt();
		}
		for(int k=0;k<=n;k++)
			System.out.println("The value at"+k+" is: "+a[k]);
			break;
		case 2:
			ArrayOperation.percentage();
			break;
		/*
		 * case 3: ArrayOperation.fruits(); break; case 4: ArrayOperation.character();
		 * break;
		 */
			
		}	
	}
		public static void percentage()
		{	
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Size: ");
			int n=sc.nextInt();
			int[]a=new int[n];
			for(int k=0;k<=n-1;k++)
			{
				System.out.print("Enter the value "+k+": ");
				a[k]=sc.nextInt();
			}
			for(int k=0;k<=n;k++)
				System.out.println("The value at"+k+" is: "+a[k]);
			sc.close();
		}

}

