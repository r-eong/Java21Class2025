package example;

public class MainTest {
	public static  void main(String[] args) {
//		아래 예외처리를 하지 않을 경우
//		IndexOutOfBoundException(존재하지 않은 index 를 사용했다는 뜻) 에러 출력
		if(args.length != 2) {
			System.out.println("값의 갯수가 부족합니다!");
			System.exit(0);
		}
		
		String strNum01 = args[0];  // ex) 10 입력 -> 결과 : "10"
		String strNum02 = args[1];  // 20 -> "20"
		
//		입력받은 args 값을 숫자로 변환해야 사칙연산 가능
//		java 에서 값을 원하는 데이터 형식으로 변환하는 작업을 파싱이라고 함
//		단, 파싱은 반드시 객체 데이터 타입이어야 함을 주의 ★
//		객체 데이터 타입은 반드시 앞 글자가 대문자이어야 함
		
//		정수의 기본 타입은 int 지만, 객체 타입은 Integer 이다
//		다른 말로 래퍼클래스 라고 부름
//		Integer.parserInt() -> 문자 데이터를 정수형으로 변환
		int num01 = Integer.parseInt(strNum01);  // "10" -> 10 
		int num02 = Integer.parseInt(strNum02);
		
		int result = num01 + num02;
		
		System.out.printf("%d + %d = %d", num01, num02, result);
	}
}
