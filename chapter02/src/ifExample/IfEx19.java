package ifExample;

import java.util.Random;
import java.util.Scanner;

public class IfEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int a = ran.nextInt(10) + 1;
		int b = ran.nextInt(10) + 1;
		int c = ran.nextInt(4) + 1;
		
		int ans = 0;
		
		if(c == 1) {
			ans = a + b;
		}else if(c == 2) {
			ans = a - b;
		}else if(c == 3) {
			ans = a * b;
		}else {
			ans = a % b;
		}
		
		System.out.printf("%d ? %d = %d", a, b, ans);
		System.out.println("\n1) +   2) -   3) *   4) %");
		
		int res = scan.nextInt();
		
		if(res == c) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
	}

}
