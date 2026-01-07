package methodclass;

public class ReturnClass {
//	메서드 작성 연습
	
//	void 로 메서드 작성시 값을 반환할 수 없다
	public void ReturnInt() {
		int k = 10;
	}
	
//	데이터 타입으로 메소드 작성시 반드시 값을 반환하여야한다
	public String ReturnString() {
//		return 이란
//		값을 호출한 곳으로 반환한다
		return "자바";
	}
	
	public static void main(String[] args) {
//		인스턴스화 객체화
		ReturnClass rt = new ReturnClass();
//		값을 반환하지 않았기 때문에 출력 못 함 (k = 100)
		rt.ReturnInt();
//		return 으로 반환한 "자바" 를 저장한다
		String res = rt.ReturnString();
		System.out.println(res);
	}
}
