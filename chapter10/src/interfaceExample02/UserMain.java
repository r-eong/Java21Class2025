package interfaceExample02;

public class UserMain {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal chik = new Chicken();
		Animal mon = new Monkey();
		
		System.out.print("고양이는 ");
		cat.eat("생선");
		System.out.println("을 먹어요.");
		
		System.out.print("원숭이는");
		chik.eat("과일");
		System.out.println("을 먹어요.");
		
		System.out.print("닭은 ");
		mon.eat("사료");
		System.out.println("를 먹어요.");
		
		System.out.println();
		
		System.out.print("고양이는 ");
		cat.work("네발");
		System.out.println("로 걸어요.");
		
		System.out.print("원숭이는 ");
		mon.work("네발 또는 두발");
		System.out.println("로 걸어요.");
		
		System.out.print("닭은 ");
		chik.work("두발");
		System.out.println("로 걸어요.");
		
		System.out.println();
		
		System.out.print("고양이는 ");
		cat.sleep("엎드려서");
		System.out.println("자요.");
		
		System.out.print("원숭이는 ");
		cat.sleep("누워서");
		System.out.println("자요.");
		
		System.out.print("닭은 ");
		cat.sleep("서서");
		System.out.println("자요.");
	}

}
