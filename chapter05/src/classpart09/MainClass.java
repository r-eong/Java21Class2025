package classpart09;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassEx09 ce09 = new ClassEx09();
		
		System.out.print("학생 점수 = ");
		ce09.test(ce09.x);
		
		System.out.println("학생 총 점 = " + ce09.total(ce09.x));
		
		System.out.println("학생 전체 평균 = " + ce09.avg(ce09.x));
		
		System.out.println("1등 점수 = " + ce09.max(ce09.x));
		
		System.out.println("꼴등 점수 = " + ce09.min(ce09.x));
	}

}
