package day4;

public class Motobike_Object {
	
	public static String hangXe;
	public static String mauXe;
	public static String bienSoXe;
	public static String ngayDangKy;
	
	public static String getInformation()
	{
		return ("Hang xe la: "+hangXe+", mau xe: "+mauXe+", bien so xe: "+bienSoXe+", ngay dang ky: "+ngayDangKy);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motobike_Object xe1 = new Motobike_Object();
		xe1.hangXe = "Lead";
		xe1.mauXe = "Xanh";
		xe1.bienSoXe = "H12-344";
		xe1.ngayDangKy = "01/01/2010";
		System.out.println(xe1.getInformation());
		
		Motobike_Object xe2 = new Motobike_Object();
		xe2.hangXe = "Wave";
		xe2.mauXe = "Do";
		xe2.bienSoXe = "H12-004";
		xe2.ngayDangKy = "01/01/2011";
		System.out.println(xe2.getInformation());
	}

}
