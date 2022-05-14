
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Friends friends1 = new Friends();
		Friends friends2 = new Friends();
		friends1.show_friends();
		*/
		/*
		 * 
		 * Method Overriding: Declaring a method in sub class,
		 * which is already present in parent class.
		 * done so that a child class can give its own implementation
		 */
		Siblings sib = new Siblings();

		//Friends  fri = new Friends();
		sib.show_friends();
		/*
		 * 
		 *super = keyword refers to the superclass of an object
		 *super is used to refer immediate parent class instance variable.
		 *super can be used to invoke parent class method
		 *super is used to invoke parent class constructor.
		 *Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
		 */
		
		//fri.show_friends();
		
	}

}


