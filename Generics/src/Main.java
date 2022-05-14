
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Use 1 version fýr all reference data types
		 * 
		 */
		Integer[] intArray = {1, 3, 5, 7, 9};
		Double[] doubleArray = {1.8, 3.2, 5.9, 7.3, 9.5};
		Character[] charArray = {'s', 'e', 'l', 'a', 'm'};
		String[] stringArray = {"te", "fo", "li"};
		
		/*displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
			displayArray(stringArray);
		*/
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(string Array));
	}
	public static <Thing> void displayArray(Thing[] array) {
		for(Thing x: array) {
			System.out.print(x+"");
		
		}
		System.out.println();
		
	}
	public static <Thing> Thing getFirst(Thing[] array) {
		return array[0];
	}
}
