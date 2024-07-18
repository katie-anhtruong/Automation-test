package day5_inherritance;

public class GiaoVien extends Nguoi{
	//Thuộc tính mở rộng: maGV, soNamKN, ngaySinh
	//Ghi đè lên diChoi()
	//Mở rông: diDay()
	
	private String maGV;
	private String soNamKN;
	private String ngaySinh;
	
	public String getMaGV() {
		return maGV;
	}
 public void setmaGV(String maGV) {
	 this.maGV= maGV;
 }
 public String getsoNamKN() {
	 return soNamKN;
 }
 public void setsoNamKN(String soNamKN) {
	 this.soNamKN = soNamKN;
 }
 public String getngaySinh() {
	 return ngaySinh;
 }
 public void setNgaySinh(String ngaySinh) {
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