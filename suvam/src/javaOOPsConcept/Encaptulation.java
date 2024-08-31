package javaOOPsConcept;

import java.util.Random;

class RandomEmployeeID
{
   private int pickRandomEmpID;
   public void setRandomEmpID (int count)
   {
	   pickRandomEmpID = count;
   }
   public double getRandomEmpID () 
   {
       return pickRandomEmpID;
   }
   public int getRandomNumber(int n)
   {
   	Random random=new Random();
   	int randomnum=random.nextInt(n);
   	return randomnum;
   }
}
public class Encaptulation
{
   public static void main(String args[]) throws InterruptedException
   {
	  RandomEmployeeID obj = new RandomEmployeeID ();
      obj.setRandomEmpID(obj.getRandomNumber(1000));
      System.out.println("EmployeesID: "+(int)obj.getRandomEmpID());
      System.out.println("Setting new EmployeesID.....");
      obj.setRandomEmpID(obj.getRandomNumber(1000));
      Thread.sleep(2000);
      System.out.println("EmployeesID: "+(int)obj.getRandomEmpID());
      int x= (int) (Math.random()*1000);
      System.out.println(x);
    }
}