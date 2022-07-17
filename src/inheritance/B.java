package inheritance;

public class B extends D{
	// what is method override?
	//In concept of inheritance when we have a method in sub-class(child class) and same method in the super class( parent class)
	//and when we call the method it prefer the sub-class and sub-class method will be printed. that's called method override.
	//example: public void b3(){ System.out.println("new B3");} in B class and same method public void b3(){System.out.println("B3");} in A class b
	//when we call b3(); it will print B3.

	
	
public static void b1() {
	System.out.println("B1");
		
	}
	public void b2() {
		System.out.println("B2");
	}
	
	public void b3()
	{
		System.out.println("B3");
		}
	
	public void c2() {
		System.out.println("Parent C2");
	}
}
