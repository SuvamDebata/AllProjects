package suvam;

public class RandomStaticClassForMethodChanning3 
	{

		public static RandomStaticClassForMethodChanning3 h () {
			System.out.println("Executed method h");
			return new RandomStaticClassForMethodChanning3();
		}
		public RandomClassForMethodChanning2 i () {
			System.out.println("Executed method i");
			return new RandomClassForMethodChanning2();
		}
		public static void j () {
			System.out.println("Executed method j");
		}
	}

