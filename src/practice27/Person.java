package practice27;

public class Person {
	/*
	사람 클래스

	이름
	성별
	나이
	키
	몸무게
	직업
	혈액형
	건강상태
	수면중여부
	*/
	
	//필드
	String name;
	String gender; //"남", "여"
	
	int age;
	double height; // 179.6 -> 180 161.6
	double weight; //
	String job;
	String bloodType;//1 2 3 4
	            // A AB O B
	boolean ishealthy; //건강
	
	//0~10
	//0:사망 1:죽기직전 암 피곤 보통 건강
	//int healthState;
	boolean isSleeping; //true false
	
	//생성자
	//생성자 선언하지 않으면? 기본생성자 자동 생성
	//Person() {}
	
	
		
	
		
	
	
	//생성자 : 객체가 생성될대 초기에 해야 할 일
	Person() {
		/*
		name = null;
		gender = null;
		age = 0;
		height = 0;
		weight = 0;
		job = "무직"; //null 직업무
		bloodType = null;
		ishealthy = true; //초기화 값
		isSleeping = false;
		*/
		
	}
	Person (String name,String gender , 
			int age, double height, double weight, String job, String bloodType, boolean ishealthy, boolean isSleeping ) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
		this.bloodType = bloodType;
		this.ishealthy = ishealthy;
		this.isSleeping = isSleeping;
		
	}
	
	//메소드
	void printPersoninfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height );
		System.out.println("몸무게 : " + weight);
		System.out.println("직업 : " + job);
		System.out.println("혈액형 : " + bloodType);
		System.out.println("건강여부 : " + ishealthy);
		System.out.println("수면중여부 : " + (isSleeping ? "자는중" : "안자는중"));
		System.out.println();

	}
	
}
