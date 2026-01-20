package diExample;

public class SubClass implements Ical {
//	sub : 빼기
	@Override
	public int doOper(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
}
