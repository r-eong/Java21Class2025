package otShopMol;

public class Cart {
	String userId;  // 구매한 유저 id
	String itemName;  // 구입한 상품
	int itemPrice; // 구매한 상품 금액
	int quantity;  // 구매 수량
	
//	기본 생성자
	public Cart() {}
//	매개변수 생성자
	public Cart(String itemName, int itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
//	출력
	public void printCart() {
		System.out.println("--- " + userId + " ---\n" + itemName + " - " + itemPrice + "(" + quantity + "개)");
	}
}
