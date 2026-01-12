package arrayListEx02;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		Subject 를 담은 Student
		Student stu = new Student();
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		int cnt = 0;
		
		while(cnt < 3) {
//			학생이름
//			Student 객체화
			Student sName = new Student();
			
			System.out.println("추가할 학생 이름 입력 >>");
			sName.name = scan.next();
			
//			과목 2개
			for(int i = 0; i < 2; i++) {
				Subject sSubSc = new Subject();
//				과목명, 점수
				System.out.println("추가할 과목명 입력 >>");
				sSubSc.subject = scan.next();
				
				System.out.println("과목 점수 입력 >>");
				sSubSc.score = scan.nextInt();
				
				sName.subLIst.add(sSubSc);
			}
			
			stuList.add(sName);
			
			cnt++;
		}
		
//		출력
		System.out.println("== 성적 출력 ==");
		for(int i = 0; i < stuList.size(); i++) {
//			String s 와 같은거임 Student 도 class 니까!
			Student s = stuList.get(i);
			System.out.println("학생 이름 : " + s.name);
			
			for(int j = 0; j < s.subLIst.size(); j++) {
				Subject sub = s.subLIst.get(j);
				System.out.println("과목명 : " + sub.subject + " / 점수 : " + sub.score);
			}
		}
	}

}
