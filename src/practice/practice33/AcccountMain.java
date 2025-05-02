package practice.practice33;

public class AcccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ATM
		Account a1 = new Account("나", 50000);
		long insertMoney = 30000;
		//	long result = a1.deposit(30000);
		//System.out.println("입금액 : " + insertMoney);
		//System.out.println("입급 후 잔액 : " + result);
		
		long result = a1.deposit(insertMoney);
		System.out.println("입금액 : " + result);
		System.out.println("입급 후 잔액 : " + a1.getBalance());
		
		long result2 = a1.withdraw(15000);
		if(result2 == 0) {
			System.out.println("잔액 부족으로 인출 실패");
		}
		a1.deposit(500000);
		System.out.println("입금 후 잔액 : " +  a1.getBalance());
		if(result2 == 0) {
			System.out.println("잔액 부족으로 인한 실패");
		}
		System.out.println("출금 후 잔액 : + " + a1.getBalance());
	}

}
