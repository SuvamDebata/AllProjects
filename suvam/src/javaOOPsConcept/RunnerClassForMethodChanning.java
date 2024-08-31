package javaOOPsConcept;

import suvam.RandomClassForMethodChanning;
import static suvam.RandomStaticClassForMethodChanning3.*;


public class RunnerClassForMethodChanning {

	public static void main(String[] args) {
		RandomClassForMethodChanning obj=new RandomClassForMethodChanning();
		
		obj.d();// method chaining is not allowed as method d is of void return type
		System.out.println("method chaining is not allowed as method d is of void return type");
		
		obj.a().b();//method chaining with current class object
		System.out.println("method chaining with current class object");
		
		obj.a().d();// further method chaining is not allowed as a method of void return type incurred
		System.out.println("further method chaining is not allowed as a method of void return type incurred");
		
		obj.a().b().c();//method chaining with other class object
		System.out.println("method chaining with other class object");
		
		obj.a().b().c().e();//method chaining with other class object and accessing methods of that other class
		System.out.println("method chaining with other class object and accessing methods of that other class");
		
		obj.a().b().c().f().g();//method chaining with other class object and accessing methods of that other class but further method chaining is not allowed as a method of void return type incurred
		System.out.println("method chaining with other class object and accessing methods of that other class but further method chaining is not allowed as a method of void return type incurred");
		
		h().i().e().g();//static method chaining with non static method(i()is non static) with other class object and that other class method
		System.out.println("static method chaining with non static method(i()is non static) with other class object and that other class method");
	}

}
