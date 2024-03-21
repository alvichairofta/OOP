package week07.arya.id.ac.umn;

public class Position {
	private String name;
	private int salary, positionAmt;
	
	public Position(String name, int salary, int positionAmt){
		this.name = name;
		this.salary = salary;
		this.positionAmt = positionAmt;
	}
	
	public String getPositionName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getPositionAmt() {
		return positionAmt;
	}
}
