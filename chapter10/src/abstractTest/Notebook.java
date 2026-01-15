package abstractTest;

//부모 추상클래스 Computer에서 상속받은 추상메소드 일부만 구현(사용)하길 원하면
//반드시 abstract 키워드를 입력해 추상클래스임을 명시하여야한다.
public abstract class Notebook extends Computer {

	@Override
	public void display() {
		System.out.println("Notebook display() ---");
	}
}
