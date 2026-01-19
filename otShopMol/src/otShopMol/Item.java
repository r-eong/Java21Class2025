package otShopMol;

public class Item {
//	멤버변수
	String name;  // 카테고리
	int price; // 상품 가격
	String category;  // 카테고리
	
//	기본 생성자
	public Item() {}
	
//	매개변수 생성자 메소드
	public Item(String name, int price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
//	출력 메소드
	public void printInfo() {
		System.out.println("[" + name + "] [" + price + "] [" + category + "]");
	}
}
