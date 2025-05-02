package practice.practice33;

public class Student {
        // 학과와 학번을 입력받을 수 있도록 scanner 기능 만들어줌
		private String department;
		private int studentNumber;
		
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			
		}
		public int getStudentNumber() {
			return studentNumber;
		}
		public void setStudentNumber(int studentNumber) {
			this.studentNumber = studentNumber;
		}
		Student(String d, int c){
			department=d;
			studentNumber=c;
		}
		public void print() {
			System.out.println("학과 : "+department);
			System.out.println("학번 : "+studentNumber);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student s = new Student("체육교육과",20190000);
			s.print();
		}

	
		
	}


