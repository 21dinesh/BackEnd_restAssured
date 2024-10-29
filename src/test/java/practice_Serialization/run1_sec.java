package practice_Serialization;

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
    	this.name=name;
    	this.level=level;
    	this.score=score;
    	this.life=life;
    }
}
public class run1_sec {
	public static void main(String[] args) throws Throwable {
		NFSGame userObj = new NFSGame("DK", 5, 255000, 2);
		FileOutputStream fileOut = new FileOutputStream("./f.txt");
		
		ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
		objOut.writeObject(userObj);
		System.out.println("============END============");
	}

}
