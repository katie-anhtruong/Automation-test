package day4_encapsolution;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person student1 = new Person();
		student1.name = "Nguyen Van A";
		student1.setPhoneNumber ("0979999888");
		System.out.println("Họ tên: "+student1.name+ ", số điện thoại: "+student1.getPhoneNumber());
	
	}

}
