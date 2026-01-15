package abstractTest;

public class ComputerTest {

	public static void main(String[] args) {
//		추상클래스는 인스턴스화(객체화) 할 수 없다
//		Computer c = new Computer() {
//			
//			@Override
//			public void typing() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void display() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
//		Computer 추상클래스를 상속받는 하위클랫의 뎅터타입으로 업캐스팅을 할 수 있다.
//		-> 다형성 성립
//		다형성의 성립 요건 - 상속, 오버라이딩, 업캐스팅
		Computer c1 = new Desktop();
		Computer c2 = new MyNotebook();
		
		c1.display();
		c1.typing();
		c2.display();
		c2.typing();
	}

}
