package diExample03;

public class SmsMessage implements Message {
	@Override
	public String message(String name, String msg) {
		return name + "에게 [" + msg + "]를 SMS로 전송";
	}
}
