package week07.arya.id.ac.umn;

import java.util.*;

public class PayrollSystem {
	private List<Department> department = new ArrayList<Department>();
	private List<String> listOfDepartment = new ArrayList<String>();
	
	{
		listOfDepartment.add("Marketing");
		listOfDepartment.add("Publishing");
		listOfDepartment.add("IT");
		listOfDepartment.add("Artists");
	}
	
	
	public PayrollSystem(int deptAmt, int empAmt) {
		
		
		for(int i = 0; i < deptAmt; i++) {
			
			Random rand = new Random();
			
			int temp = empAmt / listOfDepartment.size();
			String name = listOfDepartment.get(rand.nextInt(listOfDepartment.size() - 1));
			
			
			if(i == (deptAmt - 1)) {
				int sisa = empAmt % listOfDepartment.size();
				temp += sisa;
				Department newDept = new Department(name, temp);
				department.add(newDept);
			}else {				
				Department newDept = new Department(name, temp);
				department.add(newDept);
			}
			
		}	
	}
	
	public List<String> getDeptNameList() {
		return listOfDepartment;
	}
}
