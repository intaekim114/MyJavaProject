package workshop.account.test;

import workshop.account.entity.Account;
import workshop.account.exception.InsufficientBalanceException;

//	ctrl + shift + o

public class AccountTest {
	public static void main(String[] args) {
		// Account 객체
		Account account = new Account("A1100", "221-22-3477",100000);
		System.out.println(account); //account.toString() -> println이 호출해 줌
		// Object에서 상속받은 클래스이기 때문에 Object의 함수 toString() 사용이 가능하다.
		System.out.println("고객번호: "+ account.getCustId());
		System.out.println("계좌번호: "+ account.getAcctId());
		System.out.println("잔액: "+ account.getBalance());
		
		System.out.println("10000원 입금");
		account.deposit(10000);
		System.out.println("잔액: "+ account.getBalance());
		
		System.out.println("20000원 출금");
		try {
			account.withdraw(20000);
			System.out.println("잔액: "+ account.getBalance());
			
			account.withdraw(100000);
			System.out.println("잔액: "+ account.getBalance());
			
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
