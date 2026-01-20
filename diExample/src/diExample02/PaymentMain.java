package diExample02;

public class PaymentMain {

	public static void main(String[] args) {
		PaymentProcessor pp = new PaymentProcessor();
		
		pp.pay(10000, new CreditCardPayment());
		pp.pay(1000, new KakaoPayment());
		pp.pay(20000, new NaverPayment());
	}

}
