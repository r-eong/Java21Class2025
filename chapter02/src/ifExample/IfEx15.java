package ifExample;

import java.util.Random;
import java.util.Scanner;

public class IfEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ra = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ra.nextInt(100) + 1;
		System.out.printf("문제 [ %d ]", num);
		System.out.println("\n1. 홀수 \n2. 짝수 \n번호를 선택하세요 : ");
		int choice = scan.nextInt();
		
//		if(choice == 1  && num % 2 == 0) {
//			System.out.println("오답");
//		}else if(choice == 1 && num % 2 != 0) {
//			System.out.println("정답");
//		}else if(choice == 2 && num % 2 == 0) {
//			System.out.println("정답");
//		}else if(choice == 2 && num % 2 != 0){
//			System.out.println("오답");
//		}
		
//		-------------------- 같은 코드고 줄였음! ---------------------
		
		if((choice == 1  && num % 2 == 0) || (choice == 2 && num % 2 != 0)) {
			System.out.println("오답");
		}else {
			System.out.println("정답");
		}
	}

}
