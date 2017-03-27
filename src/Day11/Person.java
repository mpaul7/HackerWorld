package Day11;

public class Person {
	
	protected String firstName;
	protected String lastName;
	protected int id;
	
	Person(String firstName, String lastName, int id){
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void printPerson(){
		System.out.println(
				"Name:" + lastName + ", " + firstName
			+   "\nID:" + id);
	}

}
