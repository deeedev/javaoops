import java.util.ArrayList;

public class Employee {
	private String name;
	private int empid;
	private double salary;
	private String email;
	private String managerName;
	private int noOfWorkingDays;
	
	//We have no constraint on length of the arraylist
	ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
	
	public ArrayList<Employee> getEmployeeList() {
		return EmployeeList;
	}

	
	public void setEmployeeList(ArrayList<Employee> employeeList) {
		EmployeeList = employeeList;
	}

	public void addEmployee(Employee emp) {
		EmployeeList.add(emp);
	}

	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}

	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
}
