package arrayListEx01;

public class Product {
//	멤버변수
	String fruit;
	int price;
	
//	기본 생성자
	public Product() {};
	
//	매개변수 추가 생성자
	public Product(String fruit, int price) {
		this.fruit = fruit;
		this.price = price;
	}
	
//	장바구니 목록 출력
	public void printList() {
		System.out.print(fruit + "\t" + price + "원\n");
	}
}
