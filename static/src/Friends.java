
 public class Friends{
  static int numberOfFriends;
  String color = "black";
	Friends(){
		numberOfFriends++;

		System.out.println("Superclass constructor");
	}
	void show_friends()
	{
		//System.out.println("number friends:"+numberOfFriends);
		System.out.println("Superclass Method");
	}
	
	void eat() {
		System.out.println("Parent eat");
	}
}

 
