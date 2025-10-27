package in;

public abstract class RRPaymentServices {

	private double balance;
	private int customerId;

	RRPaymentServices(double balance, int customerId){
		this.setBalance(balance);
		this.customerId = customerId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	abstract void payBill(double amount);
	
}
