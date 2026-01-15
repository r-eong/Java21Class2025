package interfaceExample03;

public class CircleClass implements CircleInterface {
	double pi = 3.14;
	int radius;
	
//	"반지름이10인 원입니다." 와 같이 출력
	@Override
	public void draw() {
		this.radius = 10;
		System.out.println("반지름이 " + this.radius + "인 원 입니다.");
	}

//	원의 면적을 계산하여 반환
	@Override
	public double getArea() {
		double cir = (this.radius * this.radius) * this.pi;
		return cir;
	}
	
}
