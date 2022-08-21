
package lab5;

import java.util.Scanner;
public class UapHr {

	public static void main(String[] args) {
		
 	   Scanner scan = new Scanner(System.in);
 	   String name;
 	   String id;
 	   String designation;
 	   double salary;
 	   Employee[] e = new Employee[10];
 	   int len=e.length;
 	   int option,i;
 	   int e_id;
 	   double amount;
       do
       {
    	
		   System.out.println("1. Add Employee\n2. Update Salary\n3. Get Salary of a specific employee\n"
				   +"4. Employee List\n0. Exit");
		   System.out.println("Choose option : ");
		  option = scan.nextInt();
		  switch(option)
		  {
		  case 1 :
			  System.out.println("Enter Employee name : ");
			  name = scan.next();
			  System.out.println("Enter Employee id : ");
			  id = scan.next();
			  System.out.println("Enter Employee designation : ");
			  designation = scan.next();
			  System.out.println("Enter Employee salary : ");
			  salary = scan.nextDouble();
                          for(i=0; i<len; i++)
    			  {
    				  if(e[i]==null)
    				  {
    					  e[i] = new Employee(name, id, designation,salary);
    					  break;
    				  }
                          }
    			  
			 
			  break;
		  case 2 :
			  System.out.println("Enter id : ");
			  e_id = scan.nextInt();
			  System.out.println("Enter new salary : ");
			  amount = scan.nextDouble();
			  
			  for(i=0; i<len; i++)
			  {
				  if(e[i] == null)
                                     
    	
                                  break;
                                  
                                  
				  if(e[i].id.equals(e_id))
				  {
					  e[i].updateSalary(amount);
					  break;
				  }
			  }
			  break;
		  case 3 :
			  System.out.println("Enter id : ");
			  e_id = scan.nextInt();
			  double x;
			  
			  for(i=0; i<len; i++)
			  {
				  if(e[i] == null)
                                      break;
    				  
				  if(e[i].id.equals(e_id))
				  {
					 x = e[i].getSalary();
					 System.out.println("New Salary : "+x);
					  break;
				  }
			  }
			  //break;
		  case 4 :
			  for(i=0; i<len; i++)
			  {
				  if(e[i] == null)
    				  break;
				
					  e[i].display();
				  
			  }
			  break;
			  
		  }
    	   
       }while(option != 0);
      
	}

}