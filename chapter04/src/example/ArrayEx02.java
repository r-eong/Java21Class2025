package example;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String[] user = new String[] {"홍길동", "개나리", "진달래", "김백합", "최동훈"};
		int[] score = new int[user.length];
		
		for(int i = 0; i < user.length; i++) {
			System.out.println(user[i] + "의 점수를 입력하세요 : ");
			score[i] = scan.nextInt();
		}
		
		for(int i = 0; i < user.length; i++) {
			System.out.println(user[i] + "의 점수 : " + score[i]);
		}
		
		System.out.println("----------------------");
		
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < user.length; i++) {
			sum += score[i];
			avg = sum / user.length;
		}
		System.out.println("평균 : " + avg);
	}

}
