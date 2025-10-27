package in;

public class ShoppingPayment extends RRPaymentServices {

	private static int counter = 5678;
	private String paymentId;
	
	ShoppingPayment(double balance,int customerId){
		super(balance,customerId);
		
	}
	
	public String getPaymentId() {
		return paymentId;
	}
	
	@Override
	void payBill(double amount) {
		
		if(amount == this.getBalance()) {
			
			paymentId = "S"+counter;
			
			System.out.println("Congratulations!! Your payment of Rs."+amount+" is successfull with payment id:"+paymentId);
		}
		else if(amount < this.getBalance()) {
			System.out.println("Insufficient amount entered!! Please try again.");
		}
		
		else if(amount > this.getBalance()) {
			
			System.out.println("Excess amount entered!! Please try again.");
		}
	}
	
	
	
}
