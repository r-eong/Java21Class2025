package shopMol;

import java.util.*;

public class ItemManager {
	// 카테고리를 String 자료형으로 ArrayList생성
	ArrayList<String> category = new ArrayList<String>();
	
	//전체 아이템리스트를 Item 자료형으로 ArrayList생성
	ArrayList<Item> itemList = new ArrayList<Item>();
	
	Scanner scan = new Scanner(System.in);
	
	String addItemCate;  // 카테고리 변환?
	
	public ItemManager() {
		info();
	}
	
	public void info() {
		category.add("과자");
		category.add("생선");
		category.add("육류");
		category.add("음료");
		
		itemList.add(new Item("새우깡", 1000, category.get(0)));
		itemList.add(new Item("고등어", 3000, category.get(1)));
		itemList.add(new Item("칸쵸",500, category.get(0)));
		itemList.add(new Item("소고기", 10000, category.get(2)));
		itemList.add(new Item("돼지고기", 8000, category.get(2)));
		itemList.add(new Item("콜라", 1000, category.get(3)));
		itemList.add(new Item("사이다", 1200, category.get(3)));
		itemList.add(new Item("새우", 5000, category.get(1)));
		itemList.add(new Item("양파링", 1300, category.get(0)));
		itemList.add(new Item("콘칩", 1500, category.get(0)));
	}
	
//	 카테고리 출력 메서드
	public void printCategory() {
		for(int i = 0; i < category.size(); i++) {
			System.out.print("[" + i + "]" + category.get(i) + "\t\n");
		}
	}
	
//	item 목록 출력 메서드 
	public void printItemList() {
		for(int i = 0; i < itemList.size(); i++) {
			System.out.println("[" + i + "][" + itemList.get(i).category + "][" + itemList.get(i).name + "][" + itemList.get(i).price + "]");
		}
	}
	
//	 카테고리 추가 및 item 추가 메서드
	public void addItem() {
		System.out.println("추가할 상품의 이름을 입력하세요.");
		String addItem = scan.next();
		
		System.out.println("추가할 상품의 금액을 입력하세요.");
		int addItemPrice = scan.nextInt();
		
		System.out.println("추가할 상품의 카테고리 번호를 입력하세요.");
		printCategory();
		
		int addItemCateNum = scan.nextInt();
		
		if(addItemCateNum == 0) {
			addItemCate = "과자";
		}else if(addItemCateNum == 1) {
			addItemCate = "생선";
		}else if(addItemCateNum == 2) {
			addItemCate = "육류";
		}else if(addItemCateNum == 3) {
			addItemCate = "음료";
		}else {
			System.out.println("없는 카테고리 입니다.");
		}
		itemList.add(new Item(addItem, addItemPrice, addItemCate));
	}
	
//	아이템 삭제
	public void delItem() {
		int delItem = scan.nextInt();
		itemList.remove(delItem);
	}
	
//	아이템, 금액 수정
	public void fixItem() {
		System.out.println("수정할 상품의 번호를 입력하세요.");
		int fixItemNum = scan.nextInt();
		
		System.out.println("수정할 상품의 이름을 입력하세요. (수정하지 않으려면 기존 이름을 입력하세요.)");
		String fixItem = scan.next();
		
		System.out.println("수정할 상품의 금액을 입력하세요. (수정하지 않으려면 기존 금액을 입력하세요.)");
		int fixItemPrice = scan.nextInt();
		
		itemList.get(fixItemNum).name = fixItem;
		itemList.get(fixItemNum).price = fixItemPrice;
	}
	
//	장바구니리스트
	
}
