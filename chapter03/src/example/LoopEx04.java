package example;

import java.util.Scanner;

public class LoopEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
//		내가 한거  음... 틀린듯
//		int num = scan.nextInt();
//		while(num > -100) {
//			num ++;
//			break;
//		}
//		System.out.println(num);
		
//		선생님 코드
		boolean bool = true;
//		while(조건) 에 true 는 무한루프 돈다는 의미
		while(bool == true) {
			System.out.println("입력 >> ");
			int num = scan.nextInt();
			
			if(num == -100) {
				System.out.println("종료");
				bool = false;  // 여긴 break 를 사용해도 되지만 추천하지 않음!
			}
		}
	}

}
