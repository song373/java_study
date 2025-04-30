package cls.cls02;

public class IPad {
   String owner; //주인 소유자
   static String brand = "Apple"; //어디회사 브랜드꺼냐

  // IPad() {
  //     this.brand = apple;
  // }
   
   void powerOn() {
	   System.out.println("아이패드 전원 켜짐");
	   System.out.println(owner + "의 아이패드~");
   }
   
   static void check() {
	  System.out.println(brand + "에서 만든 아이패드");
	 //  System.out.println(IPad.brand + "에서 만든 아이패드");
	   
   }
   
}


//전자기기
//어디회사
//모델명
//종류