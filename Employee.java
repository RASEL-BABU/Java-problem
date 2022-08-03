package lab3;

public class Employee{
	String name;
	int id;
	String desination;
	double salary;
	
	 public void updatesalary(double newSalary){
         salary=newSalary;
         }
     public double getsalary(){
         return salary;
     }
         
         
         public void display(){
             System.out.println("Name:"+name);
             System.out.println("ID:"+id);
             System.out.println("desination:");
             System.out.printf("salary:",salary);
         }
             
         
}
	 


