package practice_ser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NFSGame implements Serializable{
	String name;
	int level;
	long score;
	int life;
	public NFSGame(String name, int level, long score, int life) {
		super();
		this.name = name;
		this.level = level;
		this.score = score;
		this.life = life;
	}
	
	
}


public class Run1_ser {
	public static void main(String[] args) throws Throwable {
		
		NFSGame user1Obj = new NFSGame("supriya", 10, 50000, 2);
		
		//file is creating to store
		FileOutputStream  fileout = new FileOutputStream("./f.txt");
		
		ObjectOutputStream objout = new ObjectOutputStream(fileout);
		objout.writeObject(user1Obj);
		System.out.println("====End====");
		
		
	}

}
