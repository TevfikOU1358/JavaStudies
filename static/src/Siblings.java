
public class Siblings  extends Friends{
	String color = "white"; 
	Siblings() {
		super(); //Default come
		// TODO Auto-generated constructor stub
		System.out.println("subclass constructor");
		System.out.println("color:"+super.color);	//Parent Class
		System.out.println("color:"+color);        //Child Class
	}
	void show_friends()
	{	
		
		//System.out.println("number friends:"+numberOfFriends);
		System.out.println("SubClass Method");
		eat();			//Child Class
		super.eat();	//Parent eat
	}
	void eat() {
		System.out.println("Child eat");
	}

}
