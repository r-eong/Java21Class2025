package diExample03;

public class MessageMain {

	public static void main(String[] args) {
		MessageSender ms = new MessageSender();
		
		ms.msgSender("홍길동", "하이", new SmsMessage());
		ms.msgSender("김철수", "10시에 보자", new EmailMessage());
		ms.msgSender("김영희", "집에가자", new KakaoMessage());
	}

}
