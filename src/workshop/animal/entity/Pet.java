package workshop.animal.entity;

public interface Pet { // interface는 public만 가능
	String getName(); // interface는 public abstract가 앞에 붙는다고 생각하면 됨
	void setName(String name);
	void play();

}
