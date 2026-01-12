package staticExample;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		StaticEx01 se01 = new StaticEx01("박찬호");
		se01.addMoney(100);
		se01.printInfo();
		System.out.println(se01.money);
		
		System.out.println("----------------");
		
		StaticEx01 se02 = new StaticEx01("이승엽");
		se02.addMoney(200);
		se02.printInfo();
		System.out.println(se02.money);
	}

}
