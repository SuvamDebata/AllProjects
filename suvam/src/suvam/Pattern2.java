package suvam;

public class Pattern2 {
	public static void main(String[] args) {
		int j,k;
		for(k=1;k<=4;k++)
		{
			for (j=k;j<=4;j++)
				System.out.print(j+" ");
			System.out.println();
			for (j=1;j<=k;j++)
				System.out.print("  ");
		}
	}

}