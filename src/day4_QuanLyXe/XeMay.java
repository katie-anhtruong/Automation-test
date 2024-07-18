package day4_QuanLyXe;

public class XeMay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xe xeMay1 = new Xe();
		xeMay1.setLoaiXe("Honda");
		xeMay1.setTenXe("Lead");
		xeMay1.setVanTocMax(120);
		System.out.println(xeMay1.getLoaiXe()+","+ xeMay1.getVanTocMax()+","+xeMay1.getTenXe());
	}

}
