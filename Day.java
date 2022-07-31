import java.util.Scanner;
public class Day{
    public static void main(String[] args) 
    {
int day;
System.out.println("enter the value");
Scanner input= new Scanner (System.in);
 day=input.nextInt();
 
     if (day%7 == 0)
  {
 System.out.println("\n Today is satarday");  	
  }
  else if ( day%7 == 1 )
  {
  	System.out.println("\n Today is Sunday");  	
  }  
  else if ( day%7== 2)
  {
  	System.out.println("\n Today is Monday");  	
  } 
  else if ( day%7== 3)
  {
  	System.out.println("\n Today is Tuesday");  	
  } 
  else if ( day%7== 4 )
  {
  	System.out.println("\n Today is Wednesdy");  	
  } 
  else if ( day%7== 5 )
  {
  	System.out.println("\n Today is thursday");  	
  }   
  else if ( day%7== 6 )
  {
  	System.out.println("\n Today is friday");  	
  } 
  else
  {
   System.out.println("please enter correct number");
  

}
       
}
}