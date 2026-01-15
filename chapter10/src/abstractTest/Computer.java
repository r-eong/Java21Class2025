package abstractTest;

//추상클래스는 반드시 abstract 키워드를 입력한다
public abstract class Computer {
//	추상클래스 작성이유
//	- 어떻게 구형해야할지 구체적인 방법을 모를 때
//	  각 하위클래스에서 알아서 구현해야할 때 사용.
//	- 추상클래스는 구현은 하지 않고 선언만 하는 메서드를 작성한다.
//	public abstract display(){body} -> body는 코드를 구현하는 부분.
//	구현체가 존재하지 않는 메서드는 추상메서드이다.
	public abstract void display();
	public abstract void typing();
	
//	모두 공통으로 구현해야 되는 경우는 메소드로 작성
//	단, 코드를 구현하는 구현체 body 까지 작성한다.
//	구현체가 존재하는 메서드는 추상메서드가 아니다.
	public void turnOn() {
		System.out.println("전원 ON");  // 구현체
	}
	public void turnOff() {
		System.out.println("전원 OFF");
	}
}
