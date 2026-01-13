package inheritance02;

public class ColorTV extends TV {
//	멤버변수
	int color;
	
//	기본 생성자
	public ColorTV() {}
	
//	매개변수 생성자
	public ColorTV(int size, int color) {
		this.color = color;
		super.size = size;
//		super.setSize(size);  // 위랑 같은거임!
	}
	
//	출력 메서드
	public void printColortv() {
//		size 는 부모 클래스인 TV 에서 멤버변수로 상속받아 접근가능
		System.out.println(size + "인치 " + color + "컬러");
	}
}
