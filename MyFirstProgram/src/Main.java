import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		var Name ="tefoli13";
		var x = 123;
		var y = 12.;
		var z = true;
		var t = 'c';
		
		System.out.println("My First Program");
		System.out.println("it's really good");
		System.out.println("\\tMy First Program");
		System.out.println("\\tMy First Program");
		System.out.println("My nickname is:"+Name);
		System.out.println("My number is:"+x);
		
		/*
		 * Primitive data types added ((Object)var).
		 */
		System.out.println(Name.getClass().getSimpleName());
		System.out.println(((Object)x).getClass().getSimpleName());
		System.out.println(((Object)y).getClass().getSimpleName());
		System.out.println(((Object)z).getClass().getSimpleName());
		System.out.println(((Object)t).getClass().getSimpleName());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter name:");
		String name = scanner.nextLine();
		System.out.println("Hello\t"+name);
		String age = scanner.nextLine();
		System.out.println("You are "+age+" years old");
		int number = scanner.findInLine(null);
	}
}

