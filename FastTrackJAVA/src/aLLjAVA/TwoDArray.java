package aLLjAVA;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row Size: ");
		int n=sc.nextInt();
		System.out.print("Enter the Column Size: ");
		int m=sc.nextInt();
		int[][]a=new int[n][m];
		for(int k=0;k<n;k++)
		{
			for(int j=0;j<m;j++)
			{
			System.out.print("Enter the value at ["+k+"] ["+j+"] : ");
			a[k][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println();
		System.out.println("Your array is :");
		for(int k=0;k<n;k++)
		{
			for(int j=0;j<m;j++)
			System.out.print(a[k][j]+" ");
			System.out.println();
		}
		System.out.println();
		int max=a[0][0],min=a[0][0];
		int rmax=0, cmax=0,rmin=0, cmin=0;
		for(int k=0;k<n;k++)
		{
			for(int j=0;j<m;j++)
			{
				if (a[k][j]>max)
				{
					max=a[k][j];
					 rmax= k;
					 cmax=j;
				}
				else if (a[k][j]<min)
				{
					min=a[k][j];
					rmin=k;
					cmin=j;
				}
			}
		}
		System.out.println(max+" : is the maximum value in the array at ["+rmax+ "]["+cmax+"]\n"+
							min+" : is the minimum value in the array at ["+rmin+"]["+cmin+"]");
	}

}
