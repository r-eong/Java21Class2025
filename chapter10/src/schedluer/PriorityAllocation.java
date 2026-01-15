package schedluer;

public class PriorityAllocation implements Schedluer {

	@Override
	public void getNestCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill 이 가잘 높은 상담원의 대기열에 앞에 우선 배분합니다.");
	}

//	딱히 구현할 게 없다면 그냥 비워두면 됨!!
	@Override
	public void getLunch() {
		
	}
	
}
