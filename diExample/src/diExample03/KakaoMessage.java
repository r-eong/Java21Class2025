package diExample03;

public class KakaoMessage implements Message {
	@Override
	public String message(String name, String msg) {
		return name + "에게 [" + msg + "]를 kakao로 전송";
	}
}
