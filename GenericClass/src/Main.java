
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
		MyGenericClass<Double> myDouble = new MyGenericClass<>(2.3);
		MyGenericClass<Character> myChar = new MyGenericClass<>('@');
		MyGenericClass<String> myString = new MyGenericClass<>("hello");
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());

	}

}
