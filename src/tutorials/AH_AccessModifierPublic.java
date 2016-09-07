package tutorials;

public class AH_AccessModifierPublic {

	public static void main(String[] args) {
		AH_AccessModifiers am = new AH_AccessModifiers();
		am.doSomethingPublic();
		am.doSomethingProtected();
		am.doSomethingDefault();
		//am.doSomethingPrivate(); //this is not applicable

	}

}
