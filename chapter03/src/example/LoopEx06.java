package example;

import java.util.Scanner;

public class LoopEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int bul = 8700;
		int shi = 6200;
		int coke = 1500;
		
		int bulcount = 0;
		int shicount = 0;
		int cokecount = 0;
		
		System.out.println("=== 메뉴 ===");
		System.out.printf("1. 불고기버거 : %d원\n2. 새우버거 : %d원 \n3. 콜라 : %d원", bul, shi, coke);
		
		int menu = 1;
		int choice = 0;
		int totalPrice = 0;
		
		while(menu <= 5) {
			System.out.println("\n메뉴 선택 : ");
			choice = scan.nextInt();
			menu ++;
			
			if(choice == 1) {
				totalPrice += bul;
				bulcount++;
			}
			if(choice == 2) {
				totalPrice += shi;
				shicount++;
			}
			if(choice == 3) {
				totalPrice += coke;
				cokecount++;
			}
		}
		
		System.out.printf("총 금액 : %d", totalPrice);
		
		System.out.println("\n현금 입력 : ");
		int money = scan.nextInt();
		
		if(money - totalPrice > 0) {
			System.out.println("=== 영수증 ===");
			System.out.printf("1. 불고기버거 : %d개", bulcount);
			System.out.printf("\n2. 새우버거 : %d개", shicount);
			System.out.printf("\n3. 콜라 : %d개", cokecount);
			System.out.printf("\n4. 총 금액 : %d", totalPrice);
			System.out.println("\n5. 잔돈 : " + (money - totalPrice) + "원");			
		}else {
			System.out.println("현금이 부족합니다.");
		}
	}

}
