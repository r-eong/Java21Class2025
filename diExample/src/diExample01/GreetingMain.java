package diExample01;

import java.util.Scanner;

public class GreetingMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		GreetingService gs = new GreetingService();
		
//		System.out.print("이름 입력 >> ");
//		String name = scan.next();
		
		gs.mygreet("이름", new KoreanGreeting());
		gs.mygreet("apple", new EnglishGreeting());
		gs.mygreet("이름", new JapaneseGreeting());
	}

}
