package workshop.animal.entity;

public class Spider extends Animal{
	
	public Spider() { 
		super(8); // 부모에 기본 생성자가 없는 경우 반드시 하위 클래스에서 해당 생성자를 불러주어야 한다.
		
	}
	
	@Override
	public void eat() {
		System.out.println("Spider는 작은 벌레를 먹어요!");
		
	}

}
