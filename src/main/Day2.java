package main;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		short s =20;
		int i = 30;
		long l  = 40;
		float f= 10.5f;
		double db = 20.1;
		boolean isStudent = true;
		char c = 'T';
		String str = "Thien";
		System.out.println("Kieu du lieu byte gan cho b = " + b);
		System.out.println("Kieu du lieu short gan cho s = " + s);
		System.out.println("Kieu du lieu int gan cho i = " + i);
		System.out.println("Kieu du lieu long gan cho l = " + l);
		System.out.println("Kieu du lieu float gan cho f = " + f);
		System.out.println("Kieu du lieu double gan cho db = " + db);
		System.out.println("Kieu du lieu boolean gan cho isStudent = " + db);
		System.out.println("Kieu du lieu char gan cho c = " + c);
		System.out.println("Kieu du lieu String gan cho str = " + str);
		hoTen();
		int firstNum = 19;
		int secondNum = 14;
		math(firstNum,secondNum);
		float length = 3.5f;
		float width = 4.5f;
		chuViDienTich(length, width);
				
	}
	public static void hoTen() {
		System.out.println("Ngo Duc Thien");
	}
	public static void math(int a,int b) {
		int tong = a+b;
		int hieu = a-b;
		int tich = a*b;
		float thuong = a/b; 
		System.out.println("Tong cua firstNum va secondNum la: "+ tong);
		System.out.println("Hieu cua firstNum va secondNum la: "+ hieu);
		System.out.println("Tich cua firstNum va secondNum la: "+ tich);
		System.out.println("Thuong cua firstNum va secondNum la: "+ thuong);
	}
	public static void chuViDienTich(float a, float b)
	{
		System.out.println("Chu vi Hinh vuong co chieu dai canh = length la: "+ a *a);
		System.out.println("Dien tich Hinh vuong co chieu dai canh = length la: "+ 4 *a);
		System.out.println("Chu vi Hinh chu nhat co chieu dai canh = length va chieu rong = width la: "+2*(a+b));
		System.out.println("Dien Tich Hinh chu nhat co chieu dai canh = length va chieu rong = width la: "+a*b);
	}

}
