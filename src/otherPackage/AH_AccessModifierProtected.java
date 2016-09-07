package otherPackage;

import tutorials.AH_AccessModifiers;

public class AH_AccessModifierProtected {
	public static void main(String[] args) {
		AH_AccessModifiers am = new AH_AccessModifiers();
		am.x = 50;
		//am.y is not accessible because y is private variable
		am.doSomethingPublic();
		am.printVariables();
		
	}
}
