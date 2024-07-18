package day5_inherritance;

public class Nguoi {
// Thuộc tính private: hoTen, tuoi,ngaySinh => getter và setter
// Phương thức diChoi(){//Triển khai code}
	
	private String hoTen;
	private String tuoi;
	private String ngaySinh;
	
	public String gethoTen() {
		return hoTen;
	}
	public void sethoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String gettuoi() {
		return tuoi;
	}
	public void settuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public String getngaySinh() {
		return ngaySinh;
	}
	public void setngaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public void diChoi()
	{
		System.out.println ("Trời đẹp thì đi chơi");
	}

	}