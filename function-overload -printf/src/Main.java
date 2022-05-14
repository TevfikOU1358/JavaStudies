
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//hello("Tevfik Osman Uluocak", 25);
			//hello(25);
		/*
		 * 
		 * if there is a Final keyword ,the variable can't chnage once again 
		 */
			 final double pi = 3.14159;
			//pi = 4; //error

	}

static void hello(String name, int age) {
	System.out.println("Hello "+name+"	you are "+age+" years old");

	}
/**
 * Overloaded method :method same name but different argument type or argument number.
 * No matter return type
 */
static void hello(int age) {
	
	System.out.println("you are "+age+" years old");
	/*
	 * printf:anathor way print value
	 * %b:boolean
	 * %c:character
	 * %d:integer
	 * %f:float
	 * %s:string
	 * ex:%.2f after ',' two digit
	 * ex:%+20f 20 escape character
	 * %,f: number greater than 1000 put ','
	 */
	double x =201220.34567;
	System.out.printf("you are %d years old\n", age);
	System.out.printf("this value is:%,f\n",x);
	}
}
