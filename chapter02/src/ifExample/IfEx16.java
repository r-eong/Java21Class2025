package ifExample;

import java.util.Random;
import java.util.Scanner;

public class IfEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ran.nextInt(100) + 150;
		System.out.printf("문제 [ %d ] \n가운데 숫자를 입력하세요 : ", num);
		int choice = scan.nextInt();
		
		if(choice == (num % 100) / 10) {
			System.out.println("정답");
		}else {
			System.out.println("오답");			
		}
	}

}
