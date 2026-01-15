package queinterFace;

public class BookTest {

	public static void main(String[] args) {
//		Queue 데이터 타입으로 업캐스팅
		Queue qshelf = new Bookshelf();
		
//		문자 삽입 : FIFO
		qshelf.inQueue("A");
		qshelf.inQueue("B");
		qshelf.inQueue("C");
		qshelf.inQueue("D");
		
//			-----------------
//		<---  A | B | C | D  <---
//			-----------------
//				remove(0)
		
		System.out.println(qshelf.deQueue());
		System.out.println(qshelf.deQueue());
		System.out.println(qshelf.deQueue());
		System.out.println(qshelf.deQueue());
	}

}
