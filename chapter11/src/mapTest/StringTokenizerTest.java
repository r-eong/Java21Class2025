package mapTest;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
//		StringTonkenizer 클래스는 문자와 문자 사이의 구분자를 기준으로 문자를 분리하는 클래스
		
		String str1 = "java android fdkslfsd sdkflsdfk dfkslf";
		String str2 = "java!android";
		String str3 = "java!android-fun";
		
//		StringTonkenizer 도 객체이므로 반드시 import 해야함
		// java android => 
		StringTokenizer st1 = new StringTokenizer(str1);
		System.out.println(st1.nextToken());
		System.out.println(st1.nextToken());
		
		System.out.println("-----------");
		
		StringTokenizer st2 = new StringTokenizer(str2, "!");
		for(int i = 0; i < 2; i++) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("-----------");
		
		StringTokenizer st3 = new StringTokenizer(str3, "!-");
		for(int i = 0; i < 3; i++) {
			System.out.println(st3.nextToken());
		}
		
		System.out.println("-----------");
		
		StringTokenizer st4 = new StringTokenizer(str2, "!-", true);
		for(int i = 0; i < 3; i++) {
			System.out.println(st4.nextToken());
		}
	}

}
