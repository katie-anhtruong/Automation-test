package day4_QuanLyXe;

public class XeTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xe xeTaxi1 = new Xe();
		xeTaxi1.setLoaiXe("Toyota");
		xeTaxi1.setTenXe("H123");
		xeTaxi1.setVanTocMax(120);
		System.out.println(xeTaxi1.getLoaiXe()+","+ xeTaxi1.getVanTocMax()+","+xeTaxi1.getTenXe());
	}

}
