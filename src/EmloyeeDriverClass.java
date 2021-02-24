import java.util.ArrayList;
import java.util.Iterator;

public class EmloyeeDriverClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setEmail("abc@gmail.com");
		emp1.setEmpid(101);
		emp1.setManagerName("XYZ");
		emp1.setName("ABC");
		emp1.setSalary(1000);
		emp1.setNoOfWorkingDays(25);
		
		Employee emp2 = new Employee();
		emp2.setEmail("bcd@gmail.com");
		emp2.setEmpid(201);
		emp2.setManagerName("MNB");
		emp2.setName("BCD");
		emp2.setSalary(2000);
		emp2.setNoOfWorkingDays(20);
		
		Employee emp = new Employee();
		emp.addEmployee(emp1);
		emp.addEmployee(emp2);
		
		ArrayList<Employee> list = emp.getEmployeeList();
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Employee e = (Employee)itr.next();//Object --> Class
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getEmpid());
			System.out.println(e.getSalary());
			System.out.println(e.getNoOfWorkingDays());
			System.out.println(e.getManagerName());
			System.out.println("---------------------");
		}
		
//		for(Employee e: list) {
//			System.out.println(e.getName());
//			System.out.println(e.getEmail());
//			System.out.println(e.getEmpid());
//			System.out.println(e.getSalary());
//			System.out.println(e.getNoOfWorkingDays());
//			System.out.println(e.getManagerName());
//			System.out.println("---------------------");	
//		}
	}
}
