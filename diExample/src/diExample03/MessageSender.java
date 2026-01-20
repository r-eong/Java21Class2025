package diExample03;

public class MessageSender {
	public void msgSender(String name, String msg, Message message) {
		String msgs = message.message(name, msg);
		System.out.println(msgs);
	}
}
