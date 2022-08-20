package lab4;

import java.util.Scanner;

public class BankApp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter  name : ");
        String  n = input.nextLine();
        System.out.print("\n");
        System.out.print("Enter  Id : ");
        int i = input.nextInt();
        System.out.print("\n");
        System.out.print("Enter your Account Balance : ");
        double b = input.nextDouble();

        BankAccount client1 = new BankAccount(n,i,b);

        System.out.println("Press 1 to deposite money : \n Press 2 for withdraw money : \n Press 3 for dsiplay details : \n");
        int p = input.nextInt();
        switch (p) {
            case 1:
            System.out.println("How many aamount do you want to deposite : ");
            b = input.nextDouble();
            client1.deposite(b);
            client1.display();
                break;
            case 2:
            System.out.println("How many ammount do you want to withdraw :");
             b = input.nextDouble();
            client1.withdraw(b);
            client1.display();
            break;
            case 3:
            client1.display();
            break;
            default:
                break;
        }

        
     
        
    }
}