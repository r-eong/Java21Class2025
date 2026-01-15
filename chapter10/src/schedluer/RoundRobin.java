package schedluer;

public class RoundRobin implements Schedluer {

	@Override
	public void getNestCall() {
		System.out.println("상담전화 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분됩니다.");
	}

	@Override
	public void getLunch() {
		System.out.println("12시!");
	}
	
}
