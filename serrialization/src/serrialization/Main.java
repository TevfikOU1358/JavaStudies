package serrialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		/*
		 * Serialization: the process of  converting an object to byteStream
		 */
		User user = new User();
		user.name = "Tefo";
		user.password = "123tevfik123";
		
		FileOutputStream fileOut = new FileOutputStream("src/serrialization/UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		
		out.writeObject(user);
		out.close();
		fileOut.close();
		System.out.println("object info serializied!");
		

	}

}
