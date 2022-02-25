package domain;

public class Person implements Greetable {
	private final int id;
	private final String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public String greet() {
		return "Person: "+ name + " says hello!";
	}
	
	
}
