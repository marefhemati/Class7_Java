package accessModifiers;
import inheritance.D;

public class AccessM1 extends D{
	//Interview Question: who can access private method or where I can access private method?
	//In Same class.
	
	public static void main(String[] args) {
		//I made protected method in inheritance package and class D, then I inherit from class D now Print method d3();
d3();

dModifier();

	}
	
	public static void accessPub() {
		
	}
private static void accessPrivat() {
		
	}

protected static void accessProt() {
	
}


	

}
