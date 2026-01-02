package example;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		
		System.out.println("문제) 학번을 입력받아 성적 출력\n단, 없는학번 입력 시 예외처리");
		
		System.out.println("학번 입력 : ");
		int hak = scan.nextInt();
		boolean bool = true;
		int chk = -1;  // 학번 존재 유무 확인하는 키
//		┖> -1 을 쓰는 이유 : 인덱스 번호와 겹치지 않게 하려고!
		
		for(int i = 0; i < hakbuns.length; i++) {
//			if(bool == true) {
				if(hak == hakbuns[i]) {
					chk = i;  // true/false 와 같은? 비슷한? 논리인듯! 
//					System.out.println("성적 : " + scores[i] + "점");
//					break;
//					bool = true;
//				}
			}			
		}
//		if(chk == -1) {
//			System.out.println("해당학번은 존재하지 않습니다");
//		}
		
//		이렇게 아래에 몰아서 출력해도 됨!
		if(chk != -1) {
			System.out.println(hakbuns[chk]);
		}else {
			System.out.println("해당학번은 존재하지 않습니다");
		}
		
	}

}
