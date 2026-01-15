package interfaceTest;

//Calculator 추상클래스를 extends 로 상속받는다.
public class CompleteCalc extends Calculator {
//	extends 는 구현체를 상속한다라는 의미.
	
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		return ERROR;
	}
	
//	출력 메소드
	public void showInfo() {
		System.out.println("Calc 인터페이스 구현하겠음");
	}
}
