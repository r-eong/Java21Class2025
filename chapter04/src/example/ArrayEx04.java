package example;

import java.util.*;

public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		
		System.out.println("문제3) 학번을 입력 받아 성적 출력");
		
		System.out.println("학번 입력 : ");
		int hak = scan.nextInt();
		
		for(int i = 0; i < hakbuns.length; i++) {
			if(hak == hakbuns[i]) {
				System.out.println("성적 : " + scores[i] + "점");
			}
		}
	}

}
