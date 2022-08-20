
package uapbazar1;
import java.util.Scanner;


public class UapBazar {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter product  id : ");
       
       int i = input.nextInt();
       
       System.out.print("Enter product  name : ");
       
       String n = input.next();
       
       System.out.print("Enter product category  : ");
       
       String c = input.next();
       
       System.out.print("Enter product  price : ");
       
       double p = input.nextDouble();
       
        Product p1 = new Product(i,n,c,p);
        System.out.println("Press 1 to Update price : \n Press 2 for Discount price : \n Press 3 for dsiplay details : \n press 0 for exit/n");
        
        int d = input.nextInt();
        
        
        switch (d) {
            
            case 1:
            System.out.println("How many price : ");
            
            p = input.nextDouble();
            
            p1.updatePrice(p);
            
            p1.display();
            
                break;
            case 2:
            System.out.println("discount % price :");
             
            double m2 = input.nextDouble();
	    double m3 = p1.getDiscountedPrice(m2);
	    System.out.println("The discounted price of the product is : "+m3);
	   break;
           
            case 3:
            p1.display();
            break;
            
            default:
                break;
                        
        }
   }
}
   
        
   
    
    

    
    
    

