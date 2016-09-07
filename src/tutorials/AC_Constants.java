package tutorials;

public class AC_Constants {
	
	public static final int WIDTH = 800; //declare constant value
	public static final int HEIGHT = 600; //declare contant value
	public static final String NAME_OF_GAME = "Need For Speed"; //when constant has multiple words, then separate by underscore
	//With public, these constants can be accessed from anywhere in the program.
	//With static these constants are present with Class itself and not with instantiated objects.
	//final keyword converts a variable into constant field.
	
	
	public static void main(String[] args) {
		System.out.println(Math.PI); //Math.PI is defined inside JDK
		
		System.out.println(AC_Constants.WIDTH);
		System.out.println(HEIGHT);
	}
	
}
