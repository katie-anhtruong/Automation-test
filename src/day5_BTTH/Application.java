package day5_BTTH;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat HinhChuNhat1 = new HinhChuNhat ();
		HinhChuNhat1.setTenHinh("Hình chữ nhật 6 x 4 co diện tích: ");
		HinhChuNhat1.chieuDai = 6;
		HinhChuNhat1.chieuRong = 4;
		System.out.println (HinhChuNhat1.getTenHinh() + HinhChuNhat1.tinhDienTich());
		
		HinhTron HinhTron1 = new HinhTron();
		HinhTron1.setTenHinh("Hình tròn bán kính 5 có diện tích: ");
		HinhTron1.banKinh = 5;
		System.out.println (HinhTron1.getTenHinh() + HinhTron1.tinhDienTich());
	}

}
