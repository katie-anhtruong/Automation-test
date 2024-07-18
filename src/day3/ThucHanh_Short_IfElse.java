package day3;
import java.util.Scanner;

public class ThucHanh_Short_IfElse {
	
	public static String result;
	public static void inSoLonHon(double st1, double st2)
	{
		result = (st1>st2) ? "So lon hon la: "+st1 : "So lon hon la:" +st2;
		System.out.println(result);
	}
		
	public static void kiemTraChanLe(int number) {
		result = (number%2 ==0)? "So vua nhap la so chan" : "So vua nhap la so le";
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("In ra số lớn hơn - Mời bạn nhập số thứ nhất");
		double st1=scanner.nextDouble();
		System.out.println("In ra số lớn hơn - Mời bạn nhập số thứ hai");
		double st2=scanner.nextDouble();
		inSoLonHon(st1, st2);
		
		
		
		System.out.println("Kiểm tra số chẵn lẻ - Mời bạn nhập số cần kiểm tra");
		int number = scanner.nextInt();
		kiemTraChanLe(number);
		
	}
}