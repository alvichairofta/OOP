package week07.arya.id.ac.umn;

import java.util.*;

public class Department {
	private String name;
	private List<Employee> employees = new ArrayList<Employee>();
	private List<Position> listOfPosition = new ArrayList<Position>();
	private List<String> listOfEmployee = new ArrayList<String>();
	
	{
		listOfEmployee.add("Sakura Nakamura");
		listOfEmployee.add("Takashi Tanaka");
		listOfEmployee.add("Aiko Yamamoto");
		listOfEmployee.add("Yukihiro Suzuki");
		listOfEmployee.add("Hikari Matsumoto");
		listOfEmployee.add("Haruka Kimura");
		listOfEmployee.add("Mizuki Fujimoto");
		listOfEmployee.add("Kazuki Aoki");
		listOfEmployee.add("Kiyoko Sato");
		listOfEmployee.add("Renjiro Takahashi");
	}
	
	{
		Position pos1 = new Position("Head of Department", 1200, 10);
		Position pos2 = new Position("Product Manager", 1000, 10);
		Position pos3 = new Position("Animator", 700, 10);
		Position pos4 = new Position("Designer", 600, 10);
		Position pos5 = new Position("Copywriter", 600, 10);
		Position pos6 = new Position("Software Engineer", 650, 10);
		Position pos7 = new Position("Intern", 100, 10);
		
		listOfPosition.add(pos1);
		listOfPosition.add(pos2);
		listOfPosition.add(pos3);
		listOfPosition.add(pos4);
		listOfPosition.add(pos5);
		listOfPosition.add(pos6);
		listOfPosition.add(pos7);
	}
	
	
	
	public Department(String name, int empAmt) {
		this.name = name;
		
		Random rand = new Random();
		
		for(int i = 0; i < empAmt; i++) {
			String empName = listOfEmployee.get(rand.nextInt(listOfEmployee.size() - 1));
			Position empPos = listOfPosition.get(rand.nextInt(listOfPosition.size() - 1));
			int attend = rand.nextInt(10, 20);
			
			Employee newEmp = new Employee(empName, empPos, name, attend);
			employees.add(newEmp);
		}
	}
	
	public Employee getEmpDataByEmpName(String empName) {
	    Employee find = null;

	    for (Employee employee : employees) {
	        if (employee.getEmpName().equals(empName)) {
	            find = employee;
	            break;
	        }
	    }
	    
	    return find;
	}
	
	public List<Employee> getEmployeeList(){
		return employees;
	}
	
//	public List<Employee> getEmployeeMonthlySalaryList() {
//		
//	    
//	    return ;
//	}
	
}
