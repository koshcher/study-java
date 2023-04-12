package ua.step.beans;

public class Employee {
	private int id;
	private String lastName;
	private String firstName;
	private int salary;

	public Employee() {
		
	}
	public Employee(int id, String lastName, String firstName, int salary) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
	}

	public String getLastName() {
		return lastName;
	}
	public String lastName() {
		return "LAST";
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
}