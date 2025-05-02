package practice.practice33;

public class SalaryMan {
	 //필드 salary는 월 급여액를 저장하며, int형으로 초기 값으로 1000000 저장 + 기본 생성자에서 필드 salary의 초기 값을 사용
    int salary;
    
    public SalaryMan(){
    	salary = 1000000;
    } 
    //생성 자는 class와 이름이 같아야 한다.
    //생성자
    public SalaryMan(int salary){
        this.salary = salary;
    }
    // 메소드 getAnnualGross()는 연봉을 반환하는 메소드로 월급에 보너스 500%로 계산
    // 연봉 월 * 12, 보너스 500% 수령 5.0을 곱해야지만 int 정수형이므로 5 곱한다.
    public int getAnnualGross() {
       int annualGross = salary*12 + salary * 5; // 연봉 + 500% 보너스 수령
       return annualGross;
    }

    
}


