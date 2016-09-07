package tutorials;

public class AH_AccessModifiers {
	//private is most restrictive
	//default
	//protected
	//public
	
	//Access Modifiers is also applicable for variables
	public int x = 0;
	private int y = 0;
	
	public static void main(String[] args) {
		AH_AccessModifiers am1 = new AH_AccessModifiers();
		am1.x = 10;
		am1.y = 20;
		am1.doSomethingPrivate();
		am1.doSomethingDefault();
		am1.doSomethingProtected();
		am1.doSomethingPublic();
		am1.printVariables();
		
		System.out.println("------------------");
		AH_AccessModifiers am2 = new AH_AccessModifiers();
		am2.x = 100;
		am2.y = 200;
		am2.doSomethingPrivate();
		am2.doSomethingDefault();
		am2.doSomethingProtected();
		am2.doSomethingPublic();
		am2.printVariables();
	}
	
	//printing non-static variables
	public void printVariables(){
		System.out.println(x+ ", " + y);
	}
	
	//this method can be accessed from anywhere in the program
	//as long as you have an instance of this class to call it from
	public static void doSomethingPublic(){
		System.out.println("I am a public method");
		
	}
	
	//this method means that this method can't be accessed anywhere other than inside this class
	private static void doSomethingPrivate(){
		System.out.println("I am a private method");
	}
	
	//this method can be accessed inside of this package
	//and from subclasses of this class
	protected static void doSomethingProtected(){
		System.out.println("I am a protected method");
	}
	
	//this method can only be accessed from inside of this package
	void doSomethingDefault(){
		System.out.println("I am a default method");
	}

}
