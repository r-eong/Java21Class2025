package inheritance;

public class Main {

	public static void main(String[] args) {
//		부모 클래스 객체화
		ParentClass pc = new ParentClass();
//		자식 클래스 객체화
		ChildClass cc = new ChildClass(1, 2);
		
//		부모 클래스의 기본 생성자는 자식 클래스보다 먼저 컴파일러 불러온다
//		없으면 자동으로 생성.
//		단, 부모의 디폴트 생성자가 존재하지 않는 경우 컴파일러는 자동생성 하지 않는다.
		cc.childfun();
		
		cc.parentfun();
//		┖> 접근 가능한 이유 : ChildClass 가 ParentClass 를 상속받았기 때문
//		=== parentfun ===
//		부모 : 25, 20
		
//		main() 메서드에서 자식의 객체를 통해서 변경된 a값을 출력할 수 있고
//		부모 객체를 새로 생성해서는 그 변경된 값을 볼 수 없다.
//		부모 객체를 따로 생성하였기 때문에 a = 10 이 됨
		pc.parentfun();
//		=== parentfun ===
//		부모 : 10, 20
		System.out.println(cc.a);
		System.out.println(cc.b);
	}

}
