package day5_inherritance;

public class SinhVien extends Nguoi{
	//Thuộc tính mở rộng: maSV, soTinChi, ngaySinh
	//Ghi đè lên diChoi()
	//Mở rông: diHoc()
	
	private String maSV;
	private int soTinChi;
	private String ngaySinh;
	public String getmaSV() {
		return maSV;
	}
 public void setmaSV(String maSV) {
	 this.maSV = maSV;
 }
 public int getSoTinChi() {
	 return soTinChi;
 }
 public void setSoTinChi(int soTinChi) {
	 this.soTinChi = soTinChi;
 }
 
 public String getngaySinh() {
	 return ngaySinh;
 }
 public void setngaySinh(String ngaySinh) {
	 this.ngaySinh = ngaySinh;
 }
 
 @Override
 public void diChoi()
 {
	 System.out.println("Học hết bài và trời đẹp thì đi chơi");
 }
 
 public void diHoc()
 {
	 System.out.println("Sinh viên đi học 5 ngày / tuần");
 }
}