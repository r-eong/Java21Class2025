package diExample02;

public class CreditCardPayment implements Payment {

	@Override
	public String processPayment(int money) {
		return "신용카드로 " + money + "원 결제완료";
	}

}
