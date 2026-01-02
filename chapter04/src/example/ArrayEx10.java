package example;

import java.util.*;

public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		좌석 수 빈배열 생성
//		좌석 수 7개 지정
		int[] sit = new int[7];
		int price = 12000;
		int choi = 0;
		int res = 0;

		boolean bool = true;
		
//		좌석 출력
		for(int i = 0; i< sit.length; i++) {
			System.out.print("[ ]");
		}
		while(bool == true) {
			
			System.out.println("\n=== 영화관 ===");
			System.out.println("1. 좌석 예매\n2. 종료");
			
			System.out.println("메뉴 선택 >> ");
			int menuChoice = scan.nextInt();
			
			if(menuChoice == 1) {
				System.out.println("예매 인원을 입력하세요 [ 1 ~ 7 ] >> ");
				int people = scan.nextInt();
				
//				1명 선택시 짝수 자리 선택 불가능 안내 그림
				if(people <= 1) {
					System.out.println("예매 가능 좌석");
					for(int i = 0; i< sit.length; i++) {
						if(i % 2 != 0) {
							System.out.print("[=]");
						}else {
							System.out.print("[ ]");
						}
					}
				}else {
					for(int i = 0; i< sit.length; i++) {
						System.out.print("[ ]");
					}
				}
				
				System.out.println("\n좌석 번호 선택 [ 1 ~ 7 ]  >> ");
				int choiceSit = scan.nextInt();
				choiceSit -= 1;
				
//				1명은 홀수자리만 선택 가능
				if(people == 1) {
					if(choiceSit % 2 == 0) {
						for(int i = 0; i < sit.length; i++) {
							if(i == choiceSit) {
								System.out.print("[o]");
								choi++;
							}else {
								System.out.print("[ ]");
							}
						}
					}else {
						System.out.println("예매 불가능 좌석입니다");
					}
					
//				짝수면 바로 옆자리(우측)로 자동선택
				}else if(people % 2 == 0) {
					if(people == 2) {
//						System.out.println(people);
						for(int i = 0; i < sit.length; i++) {
							if(i == choiceSit) {
								System.out.print("[o]");
								choi++;
								res++;
								System.out.print(res);
							}else if(i == choiceSit + 1) {
								System.out.print("[o]");
								choi++;
								res++;
								System.out.print(res);
							}else {
								System.out.print("[ ]");
							}
						}
					}else {
						for(int i = 0; i < sit.length; i++) {
							if(i == choiceSit) {
								System.out.print("[o]");
								choi++;
								res++;
								System.out.print(res);
							}else if(i == choiceSit + 1) {
								System.out.print("[o]");
								choi++;
								res++;
								System.out.print(res);
							}else {
								System.out.print("[ ]");
							}
						}
						System.out.println("\n좌석 번호 선택 [ 1 ~ 7 ]  >> ");
						choiceSit = scan.nextInt();
						choiceSit -= 1;
//						System.out.println("좌석스캠"+choiceSit);
						for(int i = 0; i < sit.length; i++) {
							if(i == choiceSit) {
								System.out.print("[o]");
								choi++;
								res++;
								System.out.print(res);
							}else if(i == choiceSit + 1) {
								System.out.print("[o]");
								choi++;
								res++;
								System.out.print(res);
							}else if(res <= 2){
								System.out.print("[x]");
							}else {
								System.out.print("[ ]");
							}
						}
						System.out.println("\n좌석 번호 선택 [ 1 ~ 7 ]  >> ");
						choiceSit = scan.nextInt();
						choiceSit -= 1;
						for(int i = 0; i < sit.length; i++) {
							if(i == choiceSit) {
								System.out.print("[o]");
								choi++;
								res++;
								System.out.print(res);
							}else if(i == choiceSit + 1) {
								System.out.print("[o]");
								choi++;
								res++;
								System.out.print(res);
							}else if(res <= 4){
								System.out.print("[x]");
							}else {
								System.out.print("[ ]");
							}
						}
					}
					System.out.println(res);
//				3명이상은 2명씩만 붙어서 선택. 나머지 1명은 따로 선택하게
				}else{
						for(int i = 0; i < sit.length; i++) {
							if(i == choiceSit) {
								System.out.print("[o]");
								choi++;
								res++;
								System.out.print(res);
							}else if(i == choiceSit + 1) {
								System.out.print("[o]");
								choi++;
								res++;
								System.out.print(res);
							}else {
								System.out.print("[ ]");
							}
						}
						System.out.println("\n좌석 번호 선택 [ 1 ~ 7 ]  >> ");
						choiceSit = scan.nextInt();
						choiceSit -= 1;
//						System.out.println("좌석스캠"+choiceSit);
						for(int i = 0; i < sit.length; i++) {
							if(i == choiceSit) {
								System.out.print("[o]");
								choi++;
							}else if(i % 2 != 0) {
								System.out.print("[=]");
							}else if(res <= 2){
								System.out.print("[x]");
							}else {
								System.out.print("[ ]");
							}
						}
				}
//				종료
			}else {
				System.out.println("=== 영수증 ===");
				System.out.printf("총 금액 : %d원\n", choi*price);
				System.out.printf("총 인원 : %d명", choi);
				bool = false;
			}
			
		}
	}

}
