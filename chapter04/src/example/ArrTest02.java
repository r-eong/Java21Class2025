package example;

public class ArrTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] data = new double[5];
//		double[] data = {10.0, 20.0, 30.0, 0.0, 0.0};
//		┖> 이 방식을 사용하려면 아래의 방법들을 못 씀!
		
//		유효한 값만 누적할 수 있도록함!
		int size = 0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		int total = 1;
		
//		data.length 가 5 이고, 초기값은 인덱스 0, 1, 2 만 지정되어있고
//		나머지는 0.0 이므로 무조건 0이 출력됨
//		for(int i = 0; i < data.length; i++) {
		for(int i = 0; i < size; i++) {
//			if(data[i] == 0) {
//				continue;
//			}
			
			total *= data[i];
			System.out.println(data[i]);
		}
		System.out.println(total);
	}

}
