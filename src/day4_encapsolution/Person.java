package day4_encapsolution;

public class Person {
	public String name;
	private String phoneNumber;
	public String getPhoneNumber() {
		return phoneNumber;
	}

	
	//Vì phoneNumber là biến private nên cần tạo phương thức get để lấy thông tin
	//Và set để nhập thông tin số điện thoại
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
	
}
