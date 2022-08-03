package lab3;

public class Bank{

	public static void main(String[] args) {
		
		BankAccount a1= new BankAccount();
		BankAccount a2= new BankAccount();
		a1.name="RASEL BABU";
		a1.id=19101065;
		a1.balance=1000;
		
		a2.name="RASEL BABU1";
		a2.id=19101066;
		a2.balance=10000;
		
		a1.deposit(2000);
		a2.withdraw(20000);
		a1.display();
		a2.display();
		
		
		
		
		
	}
	
	
		 
		

}
