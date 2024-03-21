package week07.arya.id.ac.umn;

public class Employee {
	private String name;
	private Position position;
	private String department;
	private int attendance;
	
	public Employee(String name, Position position, String department, int attendance) {
		this.name = name;
		this.position = position;
		this.department = department;
		this.attendance = attendance;
	}
	
	public String getEmpName() {
		return name;
	}
	
	public String getEmpPositionName() {
		return position.getPositionName();
	}
	
	public int getEmpAttendance() {
		return attendance;
	}
	
	public long getMonthlySalary() {
		long salary = position.getSalary() * (attendance / 20);
		
		return salary;
	}
}
