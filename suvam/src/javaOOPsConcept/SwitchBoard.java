package javaOOPsConcept;

abstract class Switch{
	   //abstract method
	   public abstract void lineOff();

	   
	}
	public class SwitchBoard extends Switch{

	 
	@Override
	public void lineOff() {
		// TODO Auto-generated method stub
		System.out.println("current is flowing");
	   }
	   public static void main(String args[]){
		   Switch obj = new SwitchBoard();
		obj.lineOff();
		
	}
	}
