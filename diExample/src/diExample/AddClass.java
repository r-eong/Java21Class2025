package diExample;

public class AddClass implements Ical {
//	더하기 함수 모듈(=부품)화
//	부품화를 해야 되는 이유 : 자바는 느슨한 결합이 기본 원칙.
//	느슨한 결합이어야 유지보수가 좋고, 협업이 편해진다.
//	add : 더하기
//	public int addclass(int num1, int num2) {
//		int result = num1 + num2;
//		return result;
//	}

//	단 추상메소드는 반드시 @Override (=재정의) 해야한다
	@Override
	public int doOper(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
