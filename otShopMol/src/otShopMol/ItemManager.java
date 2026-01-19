package otShopMol;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemManager {
	Scanner scan = new Scanner(System.in);
	
//	카테고리는 String 자료형으로 ArrayList 생성할것
	ArrayList<String> category = new ArrayList<String>();
	
//	전체 아이템리스트를 Item 자료형으로 ArrayList 생성할것
	ArrayList<Item> itemList = new ArrayList<Item>();
	
//	전체 장바구니 : Cart 클래스를 자료형으로 ArrayList 생성한다
	ArrayList<Cart> jangList = new ArrayList<Cart>();
	
//	객체화
	UserMenu user = new UserMenu();
	
//	기본 생성자
	public ItemManager() {info();}
	
//	ItemList에 아이템 추가
//	ArrayList 에서 추가하느 메소드 : add
	public void addItem(String name, int price, String category) {
		itemList.add(new Item(name, price, category));
	}
	
//	카테고리 추가 메서드
	public void info() {
		category.add("과자");  // index : 0
		category.add("생선");  // index : 1
		category.add("육류");  // index : 2
		category.add("음료");  // index : 3
		
		addItem("새우깡", 1000, category.get(0));
		addItem("고등어", 2000, category.get(1));
		addItem("칸쵸", 3600, category.get(0));
		addItem("소고기", 6500, category.get(2));
		addItem("돼지고기", 5500, category.get(2));
		addItem("콜라", 1000, category.get(3));
		addItem("사이다", 1500, category.get(3));
		addItem("새우", 1800, category.get(1));
		addItem("양파링", 2000, category.get(0));
	}
	
//	카테고리 출력 메소드
	public void printCategory() {
		for(int i = 0; i < category.size(); i++) {
			System.out.println("[" + i + "] " + category.get(i));
		}
	}
	
//	아이템목록 출력 메소드
	public void printItemList() {
		for(int i = 0; i < itemList.size(); i++) {
			System.out.print("[" + i + "] ");
			itemList.get(i).printInfo();
		}
	}
	
//	장바구니 담기 메소드
//	userId = id / cateId = 카테고리 index 번호 / itemId = item index 번호
	public void addCart(String userId, int cateId, int itemId) {
//		중복상품 금액, 수량 누적
		
		int cnt = 0;  //개수 누적
		int jangcnt = 0;  // 중복 유무 치트키
		int log = user.logIndex;  // UserMenu 클래스에 로그인된 log값 static 으로 공유중
		
		Cart temp = new Cart();  // 객체화  // 개발에서 temp는 임시 기억장소 라는 뜻을 가짐
		temp.userId = userId;
		
//		장바구니에 중복상품이 있는지 검사
		for(int i = 0; i < itemList.size(); i++) {
//			예) itemList.get(0).name = 새우깡 을 선택했을 때 itemList를 돌면서 있는지 확인
			if(itemList.get(itemId).name.equals(itemList.get(i).name)) {
//				조건에 만족하면 누적
				jangcnt = 0;
				
//				현재 jangList에 담긴 아이템 이름과 itemList에 존재하는 이름이 같은지
				for(int j = 0; j < jangList.size(); j++) {
					if(jangList.get(j).itemName.equals(itemList.get(i).name) && 
						jangList.get(j).userId.equals(user.id[log])) {
//						┖> 지금 현재 로그인된 아이디랑 장바구니에 있는 아이디가 같으면 누적시켜라??
						jangList.get(j).itemPrice += itemList.get(i).price;
						jangList.get(j).quantity ++;
						jangcnt += 1;
					}
				}
				
//				중복되지 않을 때
				if(jangcnt == 0) {
					temp.itemName = itemList.get(i).name;
					temp.itemPrice = itemList.get(i).price;
					cnt += 1;
					temp.quantity = cnt;
					
//					장바구니 추가
					jangList.add(temp);
				}
			}
		}
	}
	
//	관리자용 장바구니 출력 메소드
	public void printCartList() {
		for(int i = 0; i < jangList.size(); i++) {
			jangList.get(i).printCart();
		}
	}
	
//	전체 item 추가 메소드
	public void addItem02(String addName, int addPrice, int addCate) {
//		Item 클래스 추가 
		Item temp = new Item(addName, addPrice, category.get(addCate));
		
		itemList.add(temp);
	}
	
//	전체 item 삭제 메소드
	public void delItem(int delIndex){
		itemList.remove(delIndex);
	}
	
//	전체 item 수정 메소드
	public void updateItem(int indexNum, String upName, int upPrice) {
		itemList.get(indexNum).name = upName;
		itemList.get(indexNum).price = upPrice;
	}
}
