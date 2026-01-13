package inheritance03;

public class ShapPencil {
//	멤버변수
	protected String name;
	protected int count;  // 잔여량
	protected int thickness;  // 굵기
	
//	기본생성자
	public ShapPencil() {}
	
//	매개변수생성자
	public ShapPencil(String name, int count, int thickness) {
		this.name = name;
		this.count = count;
		this.thickness = thickness;
	}
	
//	출력 메서드
	public void print() {
		System.out.print(name + " - 잔여량 : " + count + ", 펜 굵기 : " + thickness);
	}
}
