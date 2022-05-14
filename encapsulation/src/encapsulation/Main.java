package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Encapsulation = attributes of a class will be hidden or private
		 * can be access only through methods (getters & setters)
		 * You should make private
		 */
		car Car1 = new car("Chevrolet","Camaoro",2021);
		car Car2 = new car("Ford","Mustang",2019);
		
		Car1.copy(Car2); // method 1
		car Car3 = new car(Car2); //copy constructor
		
		System.out.println(Car1.getMake());
		System.out.println(Car1.getModel());
		System.out.println(Car1.getYear());

		System.out.println(Car2.getMake());
		System.out.println(Car2.getModel());
		System.out.println(Car2.getYear());

		System.out.println(Car3.getMake());
		System.out.println(Car3.getModel());
		System.out.println(Car3.getYear());
	}

}
