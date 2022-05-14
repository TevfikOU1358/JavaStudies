package exception_handler;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a whole number to divide");
		int x = scanner.nextInt();

		
		
		System.out.println("Enter a whole number to divide by:");
		int y = scanner.nextInt();
		
		int z = x/y;
		
		System.out.println("result:"+z);
		}
	
	catch(ArithmeticException e)
	{
		System.out.println("You can't divide by zero");
	}
	catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println("please enter a number");
	}
		finally {
			System.out.println("this will always print");
			scanner
		}
	}
}
