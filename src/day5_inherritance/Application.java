package day5_inherritance;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv1= new SinhVien();
		sv1.sethoTen("Nguyen Van A");
		sv1.setmaSV("SVO1");
		sv1.setngaySinh("13/05/1999");
		sv1.setSoTinChi(20);
		System.out.println("Sinh viên: "+ sv1.gethoTen() + sv1.getmaSV() + sv1.getngaySinh() + sv1.getSoTinChi());
		sv1.diChoi();
		sv1.diHoc();
		
		GiaoVien gv1 = new GiaoVien();
		gv1.sethoTen("Nguyen Van B");
		gv1.setngaySinh("15/06/1888");
		gv1.setmaGV("GV01");
		gv1.setsoNamKN("3.5");
		System.out.println("Giáo viên: " +gv1.gethoTen() + gv1.getMaGV() + gv1.getngaySinh());
		
	}

}