package suvam;

public class RandomClassForMethodChanning 
	{

		public RandomClassForMethodChanning a () {
			System.out.println("Executed method a");
			return new RandomClassForMethodChanning();
		}
		public RandomClassForMethodChanning b () {
			System.out.println("Executed method b");
			return new RandomClassForMethodChanning();
		}
		public RandomClassForMethodChanning2 c () {
			System.out.println("Executed method c");
			return new RandomClassForMethodChanning2();	
		}
		public void d () {
			System.out.println("Executed method d");
		}
	}

