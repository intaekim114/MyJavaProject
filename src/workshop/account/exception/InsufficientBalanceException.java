package workshop.account.exception;

public class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException(String errMessage) {
		// �θ��� �����ڸ� ȣ�� (���� �޼��� ������ ������ �θ� �̹� ������ �ִ�.)
		super(errMessage); // �θ��� �����ڸ� ȣ���ϴ� super  
		
	}
}
