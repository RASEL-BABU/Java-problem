package lab3;

class BankAccount{
	
	String name;
	int id;
		double balance;
		public void deposit(double amount) {
			balance=balance+amount;
		}
		public void withdraw(double amount) {
			if(amount<=balance)
				balance=balance-amount;
			else
				System.out.println("insufficient balance.");
		}
		
	public double getbalance() {
		return balance;
	}
	public  void display() {
		
		System.out.printf("%s-%d-%.1f/n",name,id,balance);
	}
	
}

  