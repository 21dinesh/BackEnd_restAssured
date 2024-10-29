package practice_Serialization;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class run2_DeSecrialzation {

	public static void main(String[] args) throws Throwable {
	FileInputStream input = new FileInputStream("./f.txt");
	
	ObjectInputStream objIn = new ObjectInputStream(input);
	NFSGame userObj= (NFSGame) objIn.readObject();
	
	System.out.println(userObj.name);
	System.out.println(userObj.level);
	System.out.println(userObj.score);
	System.out.println(userObj.life);
	
	
	}

}
