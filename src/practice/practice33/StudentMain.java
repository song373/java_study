package practice.practice33;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
//		s1.department = "체육교육과";
		
		s1.setDepartment("체육교육과");
		s1.setStudentNumber(20190000);
		
		System.out.printf("%s학과 학번:%d\n" );
		

	}

}
