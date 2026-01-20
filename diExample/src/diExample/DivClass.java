package diExample;

public class DivClass implements Ical {
//	div : 나누기
	@Override
	public int doOper(int num1, int num2) {
		int result = (num2 != 0) ? num1 / num2 : 0;
		return result;
	}
}
