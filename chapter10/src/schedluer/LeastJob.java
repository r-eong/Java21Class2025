package schedluer;

public class LeastJob implements Schedluer {

	@Override
	public void getNestCall() {
		System.out.println("상담전화를 대기열에서 순서대로 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 없무가 없거나 상담대디다 가장 작은 상담원에게 할당합니다.");
	}

	@Override
	public void getLunch() {
		System.out.println("점심시간이 언제에요?");
	}
	
}
