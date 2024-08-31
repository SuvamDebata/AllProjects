package suvam;

public class LoopWithoutLoopingStatement {

	public static void main(String[] args) {
	
		int k=1;
		if (k>10)
		{
			k++;
			System.out.println(k);
			LoopWithoutLoopingStatement.main(null);
		}
	}

}
