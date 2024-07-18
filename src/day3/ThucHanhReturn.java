package day3;

import java.util.Scanner;

public class ThucHanhReturn {
	
	public static int returnLargerNumber(int x, int y)
	{
		if(x>y) return x;
		else return y;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("In ra số lớn hơn - Mời bạn nhập số thứ nhất");
		int st1=scanner.nextInt();
		System.out.println("In ra số lớn hơn - Mời bạn nhập số thứ hai");
		int st2=scanner.nextInt();
	int result = returnLargerNumber(st1, st2);
	System.out.println("So lon hon la: "+ result);
	}

}
