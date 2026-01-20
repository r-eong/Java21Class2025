package diExample;

public class MyCal {
//	1. 계산기 class 생성 
//	2. MyCal 클래스의 메소드들을 모듈(=부품)화
//	3. 공통 인터페이스로 도입
//	4. DI(의존성 객체)를 주입
//	   ┖> 외부로부터 객체 주입을 받음
	
//	메소드 하나로 + - * / 모두 실행 되어야 함
	public void allCal(int num1, int num2, Ical ical) {  // DI
		int result = ical.doOper(num1, num2);
		System.out.println("result : " + result);
	}
	
////	더하기, 빼기, 곱하기, 나누기 메소드
////	add : 더하기
//	public void add(int num1, int num2, Ical ical) {
////		Ical ical : Ical 이라는 타입으로 구현된 어떤 객체든 이 자리에 들어올 수 있다.
////		┖> 이게 DI!
//		
////		interface 는 객체화는 할 수 없지만 데이터 타입으로는 사용할 수 있다.
////		┖> 데이터 타입을 상속하므로 데이터 타입으로 사용할 수 있다.
//		int result = ical.doOper(num1, num2);
//		System.out.println("result : " + result);
//		
////		AddClass addclass = new AddClass();
////		int result = num1 + num2;
////		Ical ical = new AddClass();
//	}
//	
////	sub : 빼기
//	public void sub(int num1, int num2, Ical ical) {
////		Ical ical = new SubClass();
//		int result = ical.doOper(num1, num2);
//		System.out.println("result : " + result);
//	}
//	
////	mul : 곱하기
//	public void mul(int num1, int num2, Ical ical) {
////		Ical ical = new MulClass();
//		int result = ical.doOper(num1, num2);
//		System.out.println("result : " + result);
//	}
//	
////	div : 나누기
//	public void div(int num1, int num2, Ical ical) {
////		Ical ical = new DivClass();
//		int result = ical.doOper(num1, num2);
//		System.out.println("result : " + result);
//	}
}
