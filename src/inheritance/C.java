package inheritance;

public class C extends B{

	//interview Question: what is super keyword in java and what it does do?
			//In concept of inheritance when ever the override is in play, means the child has a method same as parent one,
			//when we call the child get preference. except when we use the super keyword it calls superclass(parent class) method.
			//super keyword can not be use inside static methods.

	public static void c1() {
		System.out.println("C1");
			
		}
		public void c2() {
			c2();
			super.c2();
			System.out.println("C2");
			
			
		}
}
