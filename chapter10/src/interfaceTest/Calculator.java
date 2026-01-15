package interfaceTest;

//Calc 인터페이스 상속받기. 키워드 : implements
public abstract class Calculator implements Calc {

//	implements 는 인터페이스 타입을 상속했다. 라는 의미
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
}
