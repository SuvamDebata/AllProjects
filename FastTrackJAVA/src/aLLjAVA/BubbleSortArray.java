package aLLjAVA;

import java.util.Scanner;

public class BubbleSortArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size: ");
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int k=0;k<=n-1;k++)
		{
			System.out.print("Enter the value "+k+": ");
			a[k]=sc.nextInt();
		}
		sc.close();
		for (int k=0;k<n;k++)
		{
			for (int j=0;j<n-1;j++)
			{
			if (a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
				
			}
		}
		for(int k=0;k<=n-1;k++)
			System.out.println("The value at"+k+" is: "+a[k]);

	}

}
