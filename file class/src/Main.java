import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src/secret_message.txt");
		/*
		try {
			FileWriter writer = new FileWriter("src/poem.txt");
			writer.write("Roser are yellow");
			writer.append("\ntefoli1358");
			writer.close();
		
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(file.exists()) {
			System.out.println("File found!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete();  delete file
			
			}
			else
			System.out.println("File not found:(");
	*/
		/*
		 * FileReader: read the contents of a file as stream of characters.
		 */
		try {
			FileReader reader = new FileReader("src/poem.txt");
			
			int data = reader.read();
			while(data != -1)
			{
				System.out.print(char)data);
				data =reader.read();
			}
				
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
