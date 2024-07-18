package day5_BTTH_overloading;

public class TinhLuong {
    // Phương thức 1: Tính lương cơ bản và hệ số lương
    public double add(double luongCoBan, double heSoLuong) {
        return luongCoBan * heSoLuong;
    }

    // Phương thức 2: Tính lương cơ bản, hệ số lương và số năm kinh nghiệm
    public double add(double luongCoBan, double heSoLuong, double soNamKN) {
        return luongCoBan * heSoLuong * soNamKN;
    }

    // Phương thức 3: Tính lương cơ bản, hệ số lương, số năm kinh nghiệm và hệ số loại chuyên khoa
    public double add(double luongCoBan, double heSoLuong, double soNamKN, double loai) {
        return luongCoBan * heSoLuong * soNamKN * loai;
    }
}

