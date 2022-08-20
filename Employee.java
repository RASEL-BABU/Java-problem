
package employee;

public class Employee {

   
   
	int id;
         String name;
	String desination;
	double salary;
        public  Employee(int i,String n,String d,double s)
        {
            id=i;
            name=n;
            desination=d;
            salary=s;
            
        }
	 public void updatesalary(double newSal){
         salary=newSal+salary;
         }
     public double getsalary(){
         return salary;
     }
         
         
         public void display1(){
             System.out.println("Name:"+name);
             System.out.println("ID:"+id);
             System.out.println("desination:"+desination);
             System.out.printf("salary:%.1f\n",salary);
         }
         public void display2(){
             System.out.print(+salary);
         }
             public void display3(){
             System.out.print("After update salary:"+salary);
         }
         
    
}
