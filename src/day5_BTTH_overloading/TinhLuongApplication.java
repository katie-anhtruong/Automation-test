package day5_BTTH_overloading;

public class TinhLuongApplication {
    public static void main(String[] args) {
        TinhLuong test = new TinhLuong();

        double luongCoBan = 19000000;  

   
        double loai1_ChuyenKhoa = 0.2;
        double loai2_DaKhoa = 0.45;

        double result1 = test.add(luongCoBan, 3.5);
        System.out.println("luongCoBan x heSoLuong: " + result1);

      
        double result2 = test.add(luongCoBan, 3.5, 5);
        System.out.println("luongCoBan x heSoLuong x soNamKN: " + result2);

        
        double result3 = test.add(luongCoBan, 3.5, 5, loai1_ChuyenKhoa);
        System.out.println("luongCoBan x heSoLuong x soNamKN x Loại 1_Chuyên Khoa: " + result3);

        double result4 = test.add(luongCoBan, 3.5, 5, loai2_DaKhoa);
        System.out.println("luongCoBan x heSoLuong x soNamKN x Loại 2_Đa Khoa: " + result4);
    }
}
