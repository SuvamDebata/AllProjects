package practice_ser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Run1_DeSerTest {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream input= new FileInputStream("./f.txt");
		 
		ObjectInputStream objIn = new ObjectInputStream(input);
		NFSGame user1obj = (NFSGame) objIn.readObject();
		
		System.out.println(user1obj.name);
		System.out.println(user1obj.level);
		System.out.println(user1obj.score);
		System.out.println(user1obj.life);
		

	}

}
