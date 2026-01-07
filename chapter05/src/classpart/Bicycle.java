package classpart;

public class Bicycle {
//	멤버변수
	String color;
	int price;

//	기본 생성자
	public Bicycle() {
		System.out.println("Bicycle constructor - I");
	}
//	매개변수 존재 생성자
	public Bicycle(String c,int p) {
		System.out.println("Bicycle constructor - II");
		color = c;
		price = p;
	}
	
//	기능 = 메서드
	public void showBicycle() {
		System.out.println("-- info --");
		System.out.printf("color : %s\nprice : %d", color, price);
	}
	
	public static void main(String[] args) {
		Bicycle by00 = new Bicycle();
		by00.showBicycle();
		
		System.out.println();
		System.out.println();
		
		Bicycle by01 = new Bicycle("red", 100000);
//		by01.color = "red";
//		by01.price = 100000;
		by01.showBicycle();
	}
}
