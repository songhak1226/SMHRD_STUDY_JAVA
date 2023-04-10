package 성적관리프로그램;

public class Simulator {

	public static void main(String[] args) {
		// stu1 객체 생성 -> 생성자 호출
		Student stu1 = new Student("윤영현", "001", 100, 95, 90);
		// stu2 객체 생성
		Student stu2 = new Student("윤굥", "002", 99,99,99);
		
//		stu1.stuName = "윤영현";
//		stu1.stuNum = "001";
//		stu1.javaScore = 100;
//		stu1.dbScore = 90;
//		stu1.webScore = 95;
		
		System.out.println(stu1.getStuName());
		System.out.println(stu1.getStuNum());
		System.out.println(stu1.getJavaScore());
		
		//stu1 학번 수정
		stu1.setStuNum("002");
		System.out.println(stu1.getStuNum());
		
		
		
		
	}

}
