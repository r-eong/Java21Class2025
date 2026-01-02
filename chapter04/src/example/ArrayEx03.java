package example;

//import java.util.Scanner;
import java.util.*;  // 모든 import 기능 사용가능

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {87, 11, 45, 98, 23};
		
		System.out.println("문제1) 인덱스를 입력받아 성적 출력");
		System.out.println("인덱스 입력 : ");
		int index = scan.nextInt();
		
//		한 줄로 쓸 수 있음!!
//		System.out.println("성적 : " + arr[index]);
		
		for(int i = 0; i < arr.length; i++) {
			if(index == i) {
				System.out.println("성적 : " + arr[i]);
			}
		}
		
		System.out.println("문제2) 성적을 입력받아 인덱스 출력");
		System.out.println("성적 입력 : ");
		int score = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(score == arr[i]) {
				System.out.println("인덱스 : " + i);
			}
		}
	}

}
