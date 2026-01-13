package inheritance02;

public class IPTV extends ColorTV {
//	멤버변수
	String address;
	
//	기본 생성자
	public IPTV() {}
	
//	매개변수 생성자
	public IPTV(String address, int size, int color) {
		this.address = address;
		super.size = size;
		super.color = color;
	}
	
//	@ : 어노테이션 / Override : 재정의하다
	@Override
//	┖> IPTV 의 출력 메서드와 ColorTV 의 출력 메서드 이름이 같아서 사용하는거임!
//	해당 메서드를 재정의한다는 뜻!
	
//	출력 메서드
	public void printColortv() {
		System.out.print("나의 IPTV는 " + address + "주소의 ");
		super.printColortv();
	}
}
