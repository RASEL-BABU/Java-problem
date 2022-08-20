
package employee;
import java.util.Scanner;


public class UapHr {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);{
        System.out.print("Enter Employee  id : ");
       
       int i = input.nextInt();
       
       System.out.print("Enter   name : ");
       
       String n = input.next();
       
       System.out.print("Enter desination  : ");
       
       String d = input.next();
       
       System.out.println("Enter salary : ");
       
       double s = input.nextDouble();
       
       Employee p1 = new Employee(i,n,d,s);
       
        System.out.println("Press 1 to Update salary : \n Press 2 for get salary : \n Press 3 for display details : \n press 0 for exit/n");
        
        int c = input.nextInt();
        
        
        switch (c) {
            
            case 1:
            System.out.println("update Salary : ");
            
            double newSal = input.nextDouble();
            
            
            
           p1 .updatesalary(newSal);
           
           //System.out.print("New salary%.1f",+salary);
            
           p1 .display3();
            
                break;
            case 2:
                
            System.out.print("Get salary :");
            
            p1.display2();
             
            break;
           
            case 3:
                
            p1.display1();
            
            break;
             default:
                break;
                       
        
    }
    }
    
            
         
    
    
}
}
