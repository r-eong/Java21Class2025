package diExample02;

public class PaymentProcessor {
	public void pay(int money, Payment payment) {
		String payMag = payment.processPayment(money);
		System.out.println(payMag);
	}
}
