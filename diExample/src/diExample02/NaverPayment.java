package diExample02;

public class NaverPayment implements Payment {
	@Override
	public String processPayment(int money) {
		return "네이버페이로 " + money + "원 결제완료";
	}
}
