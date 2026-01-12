package arrayListEx01;

import java.util.ArrayList;

public class Cart {
	ArrayList<Product> product = new ArrayList<Product>();
	
//	상품 삭제
//	Product p 의 의미 : Product 의 멤버변수, 생성자, 메소드 접근 가능
	public void delCart(int pDel) {
		product.remove(pDel);
	}
	
//	상품 추가
	public void addCart(Product pAdd) {
		product.add(pAdd);
	}
	
//	상품 목록 
	public void List() {
		for(Product p : product) {
			p.printList();
		}
	}
//	총 금액
	
	public int totalPrice() {
		int total = 0;
		for(Product p : product) {
			total += p.price;
		}
		
		return total;
	}
}
