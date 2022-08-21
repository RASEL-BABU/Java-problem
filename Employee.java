
package lab5;


public class Employee {
	String name;
	String id;
	String designation;
	double salary;
	public Employee(String n, String i, String d, double s) {
		name = n;
		id = i;
		designation = d;
		salary = s;
	}
	public void updateSalary(double newSal) {
		salary = newSal;
	}
	public double getSalary() {
		return salary;
	}
	 public void display() {
		 System.out.println("Name : "+name+" Id : "+id+" Designation : "+designation+" Salary : "+salary);
	 }

}