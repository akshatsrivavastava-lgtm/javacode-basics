public class BankAccount {
	private final String accountNumber;
	private final String holderName;
	private double balance;

	public BankAccount(String accountNumber, String holderName, double initialBalance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = Math.max(0, initialBalance);
	}

	public void displayAccountDetails() {
		System.out.println("Account number: " + accountNumber);
		System.out.println("Holder name: " + holderName);
		System.out.println("Balance: " + balance);
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Deposit amount must be positive.");
			return;
		}
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive.");
		} else if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			balance -= amount;
		}
	}

	public double checkBalance() {
		return balance;
	}
}
