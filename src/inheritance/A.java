package inheritance;

public class A extends B{
	// Inheritance concept in java is like to access or acquires the properties from one class to another classes.
	//for example; the relationship between father and son. in java a class can inherit attributes and method from another class.
	//The class that inherits the properties is known as sub-class or child class.
	//The class which inherits from is known Superclass or parent class.
	
	//Interview Question: What's the keyword use for inheritance in Java that?
	//keyword is extends

	public static void main(String[] args) {
		//In below A inherit from B, and B inherit from D, then what ever B and D have, A can have it too.
		a1();
		b1();
		d1();
		
		A obj2 = new A();
		obj2.b2();
		obj2.a2();
		obj2.d2();
		
		//override we have same method in two class A and Class B
		obj2.b3();
		
		obj2.c2();
	}

	public static void a1() {
		System.out.println("A1");
		
	}
	public void a2() {
	;
		System.out.println("A2");
	}
	public void b3(){
		
		System.out.println("new B3");
		}
}
