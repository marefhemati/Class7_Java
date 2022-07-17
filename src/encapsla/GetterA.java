package encapsla;

public class GetterA {
	private String employee = "Ahamad";
	private int salary = 5000;
	

	public static void main(String[] args) {
		
	}

	//Getter(get) use to get the value private
	public String getStudent() {
		return employee;
	}
	//setter (set) use to insert new value or change the value of private 
	public void set(String employee ) {
		//this keyword is used to specify the global variable and this keyword use only for non-static one like super keyword.
		this.employee = employee;
	}
		
		
	



}
