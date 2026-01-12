package arrayListEx01;

import java.util.Scanner;

public class CartMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Cart ca = new Cart();
		
		ca.addCart(new Product("사과", 1000));
		ca.addCart(new Product("바나나", 2000));
		ca.addCart(new Product("망고", 5000));
		ca.addCart(new Product("포도", 8000));
		ca.addCart(new Product("수박", 10000));
//		┖> ArrayList<Product> product = new ArrayList<Product>() 여기에 담김 (cart.java = Heap 메모리에)
		
//		-----------------------------------------------------------------------------
		
		System.out.println("[장바구니 목록]");
		ca.List();
		System.out.println("총 금액" + ca.totalPrice());
		
		System.out.println("삭제할 상품 번호를 입력하세요 >>");
		int del = scan.nextInt();
		ca.delCart(del - 1);
		
		System.out.println("-------------------");
		
		System.out.println("[삭제 후 장바구니 목록]");
		ca.List();
		System.out.println("총 금액" + ca.totalPrice());

		System.out.println("추가할 상품 이름을 입력하세요 >>");
		String add = scan.next();
		ca.addCart(new Product(add, 3000));
		
		System.out.println("-------------------");
		
		System.out.println("[추가 후 장바구니 목록]");
		ca.List();
		System.out.println("총 금액" + ca.totalPrice());
	}

}
