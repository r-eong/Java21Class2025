package diExample02;

public class KakaoPayment implements Payment {
	@Override
	public String processPayment(int money) {
		return "카카오페이로 " + money + "원 결제완료";
	}
}
