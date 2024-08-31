package javaOOPsConcept;
//Dynamic Polymorphism

class Vehicle{
	   public void moves(){
		System.out.println("moves on wheels");
	   }
	}
	public class Car extends Vehicle{

	   public void moves(){
		System.out.println("moves on 4 wheels");
	   }
	   public static void main(String args[]){
		   Vehicle obj = new Car();
		obj.moves();
	   }
	}