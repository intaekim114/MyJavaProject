package workshop.animal.control;

import workshop.animal.entity.Animal;
import workshop.animal.entity.Cat;
import workshop.animal.entity.Pet;

public class AnimalTest {

	public static void main(String[] args) {
		// Cat ��ü�� �����ϴ� 3���� ���
		Cat cat1 = new Cat(); // 5��
		Pet cat2 = new Cat(); // 3��
		Animal cat3 = new Cat(); // 2��
		
		// Pet���κ��� ��� ���� �޼��� 
		cat1.setName("��");
		System.out.println(cat1.getName());
		cat1.play();
		// Animal�κ��� ��� ���� �޼���
		cat1.eat();
		cat1.walk();
		
		// Pet���κ��� ��� ���� �޼��� 
		cat2.setName("�̿�");
		System.out.println(cat2.getName());
		cat2.play();
		
		// Animal�κ��� ��� ���� �޼���
		cat3.eat();
		cat3.walk();
		

	}

}
