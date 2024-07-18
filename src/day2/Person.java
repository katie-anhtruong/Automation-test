package day2;

public class Person {
	
	public static int a,b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Họ và tên: Trương Ánh Nhân");
System.out.println("Số điện thoại: 0763505807");
System.out.println("Email: anhnhantruong95@gmail.com");
a=1123;
b=6745;
int result = a*b;
System.out.println("(a*b)/500 = "+result);
printLargerNumber(a,b);
	}
public static void printLargerNumber(double st1, double st2)
{
	if(st1>st2)
		System.out.println("Số lớn hơn là:"+ st1);
	else
		System.out.println("Số lớn hơn là:"+ st2);

}

}
