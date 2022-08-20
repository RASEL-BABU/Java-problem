package lab4;

public class BankAccount {

    public String name;
    public int id;
    public double balance;
  

    public BankAccount(String n,int i,double b )
    {
        name  = n;
        id = i;
        balance = b;
        
      
    }
    public void deposite(double amount) {
        balance += amount;
        
    }
    public void withdraw(double amount)
    {
        if (amount>balance) {
            System.out.println("Amount is Low try againg");
            
        }
        else
        {
            balance-=amount;
        }
    }

   public void display()
    {
        System.out.println("Name : "+name+"\n"+"ID :"+id+"\n"+"Balance : "+balance);
    }
}
