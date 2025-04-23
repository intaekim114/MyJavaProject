package workshop.account.exception;

public class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException(String errMessage) {
		// 부모의 생성자를 호출 (에러 메세지 정도의 변수는 부모가 이미 가지고 있다.)
		super(errMessage); // 부모의 생성자를 호출하는 super  
		
	}
}
