package diExample03;

public class EmailMessage implements Message {
	@Override
	public String message(String name, String msg) {
		return name + "에게 [" + msg + "]를 Email로 전송";
	}
}
