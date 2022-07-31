import java.util.Scanner;
class Factorial{
 
 static int factorial(int n)
 {
  if (n == 0)
  return 1;
   
  return n*factorial(n-1);
 }
  

 public static void main(String[] args)
 {
  int num;
System.out.println("enter the value");

  Scanner input = new Scanner(System.in);
 num= input.nextInt();
if(num<0){
System.out.println("Invalid");
}
else{


  System.out.println("Factorial of "+ num + " is " + factorial(num));
}
 }
}