package lab.student.control;

import lab.student.entity.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student("202510402", "��μ�", "��ǻ�Ͱ���", 3);
		System.out.println(student.getName() + " / " + student.getMajor() + " / " + student.getGrade() + "�г�" );
		
		System.out.println("5�г����� ����");
		student.setGrade(5);
	}
}
