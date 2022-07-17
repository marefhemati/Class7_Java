package encapsla;

public class SetterA {
//Encapsulation: If we have private methods or variables and try to access them in another class we not have access to them directly,
//therefore we us make getter and setter methods for them and can have access to them through getter and setter methods.
	public static void main(String[] args) {
		GetterA g = new GetterA();
		System.out.println(g.getStudent());
		//below we set or insert a new value in our private variable
		g.set("Kabir");
		System.out.println(g.getStudent());
		
		
		
	}		

	

}
