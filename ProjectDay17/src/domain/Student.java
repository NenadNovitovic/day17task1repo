package domain;

public class Student extends Person {

	private final String index;
	
	public Student(int id, String name, String index) {
		super(id, name);
		this.index = index;
	}
	
	@Override
	public String greet() {
		return  "Student: "+ getName() + " says hello!";
	}

}
