package in;

public class CreditCardPayment extends RRPaymentServices {

	private static int counter = 1234;
	private String paymentId;
	private double cashBack;
	private double balanceDue;
	
	CreditCardPayment(double balance,int customerId){
		super(balance,customerId);
	}
	
	public String getPaymentId() {
		return paymentId;
	}
	public double getCashBack() {
		return cashBack;
	}
	public double getBalanceDue() {
		return balanceDue;
	}
	
	void payBill(double amount) {
		
		paymentId = "C"+counter;
		
		
		if(amount > this.getBalance()) {
			
			this.cashBack = amount - this.getBalance();
			this.balanceDue = 0;
			
			System.out.println("Congratulations!! You have successfully made a payment of Rs."+amount+" Payment details are-");
			
			System.out.println("Customer ID:"+this.getCustomerId());
			System.out.println("Payment ID:"+this.getPaymentId());
			System.out.println("Previous Due:Rs."+this.getBalance());
			System.out.println("Remaining Due:Rs."+this.getBalanceDue());
			System.out.println("Cashback wallet balance:"+this.getCashBack());
			
		}
		
		else if(amount < this.getBalance()) {
			
			this.balanceDue = this.getBalance()-amount;
			this.cashBack = 0;
			
			System.out.println("Congratulations!! You have successfully made a payment of Rs."+amount+" Payment details are-");
			
			System.out.println("Customer Id:"+this.getCustomerId());
			System.out.println("Payment ID:"+this.getPaymentId());
			System.out.println("Previous Due:Rs."+this.getBalance());
			System.out.println("Remaining Due:Rs."+this.getBalanceDue());
			System.out.println("Cashback wallet balance:"+this.getCashBack());
		}
	};
	
	
	
}
