package shopMol;

import java.util.*;

public class Shooping extends UserMenu {
	Scanner scan = new Scanner(System.in);
	
	ItemManager im = new ItemManager();
	Item it = new Item(null, log, null);
	
	public Shooping() {}
	
	//메뉴
	public void menu() {
		boolean nnow = true;
		
		if(super.log == -2) {
			while(nnow) {
				System.out.println("[1]로그아웃\n[2]아이템관리\n[3]장바구니 리스트\n메뉴선택 >>");
				int manager = scan.nextInt();
				
//			1 로그아웃
				if(manager == 1) {
					System.out.println("로그아웃 되었습니다. 안녕히 가세요.");
					super.log = -1;
					nnow = false;
					
//			2 아이템관리
				}else if(manager == 2) {
					boolean mNow = true;
					
					while(mNow) {
						System.out.println("[1]상품 추가\n[2]상품 삭제\n[3]상품 수정\n[0]아이템관리 종료");
						int mMenu2 = scan.nextInt();
//					1 상품추가
						if(mMenu2 == 1) {
							im.addItem();
							im.printItemList();
							
//					2 상품 삭제
						}else if(mMenu2 == 2) {
							System.out.println("삭제할 상품의 번호를 입력하세요.");
							im.printItemList();
							im.delItem();
							im.printItemList();
							
//					3 상품 수정
						}else if(mMenu2 == 3) {
							im.printItemList();
							im.fixItem();
							im.printItemList();
							
//					0 아이템관리 종료
						}else if(mMenu2 == 0){
							System.out.println("아이템관리 종료");
							System.out.println();
							mNow = false;
							
//					예외처리
						}else {
							System.out.println("메뉴를 다시 선택하세요.");
						}
					}
					
//			3 장바구니 리스트
				}else if(manager == 3) {
					
					
				}else {
					System.out.println("메뉴를 다시 선택하세요.");
				}
			}
		}else {
			System.out.println("[1]로그인\n[2]로그아웃\n[3]쇼핑\n[0]종료\n메뉴선택 >>");
		}
	}
	
	//쇼핑메뉴
	public void shopMenu() {
		System.out.println("[1]쇼핑목록\n[2]장바구니\n[0]뒤로가기");
		int shopMenu = scan.nextInt();
		
//		1 쇼핑 목록
		if(shopMenu == 1) {
//			카테고리 출력 -> 카테고리 선택 -> 해당 카테고리 상품 출력
			
			im.printItemList();  // 상품 목록 전체출력
			im.addCart();  // 장바구니 추가
			
//		2 장바구니
		}else if(shopMenu == 2) {
			
//		3 쇼핑
		}else if(shopMenu == 0) {
			
			
//		없는 번호 예외처리
		}else {
			System.out.println("메뉴를 다시 확인해주세요");
		}
	}
	
	//로그인 메서드
	public void login() {
		System.out.println("아이디 : ");
		String inputId = scan.next();
		System.out.println("비밀번호 : ");
		String inputPw = scan.next();
		
		if(inputId.equals("mmm") && inputPw.equals("123")) {
			System.out.println("당신은 관리자 입니다.");
			super.log = -2;
		}else {
			for(int i = 0; i < super.id.length; i++) {
				if(super.id[i].equals(inputId) && super.pw[i].equals(inputPw)) {
					System.out.println(super.id[i] + "님, 환영합니다!\n");
					super.log = i;
					break;
				}else {
					System.out.println("아이디와 비밀번호를 다시 확인해 주세요.");
					break;
				}
			}
		}
	}
	
	//로그아웃 메서드
	public void logout() {
		System.out.println("로그아웃 되었습니다. 안녕히 가세요.");
		super.log = -1;
	}

}
