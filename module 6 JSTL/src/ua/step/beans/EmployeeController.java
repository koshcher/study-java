package ua.step.beans;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
	private List<Employee> employes = new ArrayList<>();

	public List<Employee> getEmployes() {
		return employes;
	}
	
	public void addEmployee(Employee employee){
		employes.add(employee);
	}
}