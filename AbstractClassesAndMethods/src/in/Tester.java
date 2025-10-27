package in;

public class Tester {

	public static void main(String[] args) {
		
		CreditCardPayment  c1 = new CreditCardPayment(10000.23, 5001);
		
		c1.payBill(15000);
		
		ShoppingPayment s1 = new ShoppingPayment(5000, 549871);
		
		s1.payBill(5000);
	}
}
