package javaOOPsConcept;
//Inheritance

class Professor {
	   String designation = "Professor";
	   String college = "Beginnersbook";
	   void doing(){
		System.out.println("Teaching");
	   }
	}
	public class MathProfessor extends Professor{
	   String subject = "Maths";
	   public static void main(String args[]){
	      MathProfessor obj = new MathProfessor();
	      System.out.println(obj.college);
	      System.out.println(obj.designation);
	      System.out.println(obj.subject);
	      obj.doing();
	   }
	}