package workshop.animal.entity;

public class Spider extends Animal{
	
	public Spider() { 
		super(8); // �θ� �⺻ �����ڰ� ���� ��� �ݵ�� ���� Ŭ�������� �ش� �����ڸ� �ҷ��־�� �Ѵ�.
		
	}
	
	@Override
	public void eat() {
		System.out.println("Spider�� ���� ������ �Ծ��!");
		
	}

}
