package practice.practice33;

public class Computer {
//	public final String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
	public static final String[] OS_TYPE = {"윈도우10", "애플 OS X", "안드로이드"};
	public int osIndex;
	public int memory;
//	public String os; //os 이름
	
	public Computer(int osIndex, int memory) {
		this.osIndex = osIndex;
		this.memory =  memory;
	
//		this.os = osType[osIndex]; //"윈도우10"
	}
	
	public void print() {
		//System.out.printf("운영체제: %s, 메인메모리: %d \n" , osType[osIndex], memory );
		System.out.printf("운영체제: %s, 메인메모리: %d \n" , OS_TYPE[osIndex], memory );
//		System.out.printf("운영체제: %s, 메인메모리: %d \n" , os, memory );
	}

}
