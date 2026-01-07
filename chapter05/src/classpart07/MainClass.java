package classpart07;

public class MainClass {

	public static void main(String[] args) {
//		while() 문은 메인에서
		
		boolean now = true;
		
		ClassEx07 ce07 = new ClassEx07();
		
		while(now) {
			System.out.println("[햄버거]");
			for(int i = 0; i < ce07.arMenu.length; i++) {
				System.out.printf("%d. %d		%d원", (i+1), ce07.arMenu[i], ce07.arPrice[i]);
			}
			System.out.println("-----------------------------");
		}
	}

}
