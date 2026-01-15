package schedluer;

public interface Schedluer {
	void getNestCall();  // 다음 고객 call 을 가져오는 메소드
	void sendCallToAgent();  // 상담원에게 call 을 던진느 메소드
	
	// 이미 상속이 끝난 상태에서 인터페이스에 메소드를 추가하면 다른 클래스에 add 해줘야함!
	void getLunch();
}
