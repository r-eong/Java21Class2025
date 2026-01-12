package bookMax;

public class MainClass {



	public static void main(String[] args) {
		BookList bL = new BookList();
		
//		bL.addBook("자바의 정석", "남궁성", 30000);
		BookDTO bD = new BookDTO("자바의 정석", "남궁성", 30000);
		BookDTO bD1 = new BookDTO("자바의 정석1", "남궁성", 60000);
		BookDTO bD2 = new BookDTO("자바의 정석2", "남궁성", 50000);
		
//		책 추가
		bL.addBook(bD);
		bL.addBook(bD1);
		bL.addBook(bD2);
		
		System.out.println("=== 전체 책 목록 ===");
		bL.printList();
		
		System.out.println("=== 최고가 책 ==");
		bL.maxPrice();
	}

}
