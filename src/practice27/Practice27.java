package practice27;

//				PersonMain
public class Practice27 {

	public static void main(String[] args) {
		//프로그램 시작 지점
		
		Person p1 = new Person();
		
		p1.name = "일이름";
		p1.gender = "남";
		p1.age = 40;
		p1.height = 179.9;
		p1.weight = 91; //91.0
		p1.job = "선생님";
		p1.bloodType = "AB";
		p1.ishealthy = true;
		p1.isSleeping = false;
		
		System.out.println("이름 : " + p1.name);
		System.out.println("성별 : " + p1.gender);
		System.out.println("나이 : " + p1.age);
		System.out.println("키 : " + p1.height );
		System.out.println("몸무게 : " + p1.weight);
		System.out.println("직업 : " + p1.job);
		System.out.println("혈액형 : " + p1.bloodType);
		System.out.println("건강여부 : " + p1.ishealthy);
		System.out.println("수면중여부 : " + (p1.isSleeping ? "자는중" : "안자는중"));
		System.out.println();

	

	Person p2 = new Person("이름이", "여", 29, 162.1,62.1,"학생", "O", false , true );
	p2.weight = 55;

	System.out.println("이름 : " + p2.name);
	System.out.println("성별 : " + p2.gender);
	System.out.println("나이 : " + p2.age);
	System.out.println("키 : " + p2.height);
	System.out.println("몸무게 : " + p2.weight);
	System.out.println("직업 : " + p2.job);
	System.out.println("혈액형 : " + p2.bloodType);
	System.out.println("건강여부 : " + p2.ishealthy);
	System.out.println("수면중여부 : " + (p2.isSleeping ? "자는중" : "안자는중"));
	System.out.println();

	p1.printPersoninfo();
	p2.printPersoninfo();
	
	Person p3 = new Person();
	
	p3.printPersoninfo();
	
	
	
}

}
