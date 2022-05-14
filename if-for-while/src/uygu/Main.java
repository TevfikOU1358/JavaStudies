package uygu;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("String giriniz:");
		String in = scanner.nextLine();
		if(in.contains("q") || in.contains("Q"))
			System.out.println("Quit the app");
		else 
			System.out.println("keep continue");
		
		String name = "";
		do {
			System.out.println("Enter the name");
			name = scanner.nextLine();
		}
		while(name.isBlank());
		System.out.println("Name:"+name);
		
		String str = "Tevfik Osman Uluocak";
		
		for(int i = 0; i<str.length() ;i++)
		{
			System.out.println(str.charAt(i));
			
		}
	


	}
}
