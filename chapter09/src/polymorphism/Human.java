package polymorphism;

public class Human extends Animal {
//	자식. 상속받음
	
	// 오버라이딩(재정의) 되면 가상 메서드에 저장됨
	@Override
	public void move() {
		System.out.println("사람은 두발로 걸어요");
	}
}
