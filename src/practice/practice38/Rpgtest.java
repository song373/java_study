package practice.practice38;

public class Rpgtest {

	public static void main(String[] args) {
		
		// 객체 생성 및 초기화
		Novice novice = new Novice();
		novice.name = "프로도";
		novice.hp = 100;

		Wizard wizard = new Wizard();
		wizard.name = "해리포터";
		wizard.hp = 120;
		wizard.mp = 100;

		// 두 객체의 펀치
		novice.punch();
		wizard.punch();

		// 위자드 객체의 파이어볼
		wizard.fireball();
		}
		}

		class Novice {
		String name;
		int hp;

		public void punch() {
		System.out.printf("[%s]의 펀치!!\n", name);
		}
		}

		/* 1. Wizard 클래스를 Novice 클래스로부터 확장하세요. */
		class Wizard {

			public int mp;
			public int hp;
			public String name;
			public void punch() {
				System.out.printf("[%s]의 펀치!!\n", name);
				
			}
			public void fireball() {
				// TODO Auto-generated method stub
				System.out.printf("[%s]의 파이어볼!!\n", name);
			}
		/* 2. mp 필드를 추가하세요. */

		/* 3. fireball() 메소드를 만드세요. */
		

	}


