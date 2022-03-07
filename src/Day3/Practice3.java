package Day3;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cau 1: ");
		//ktChanLe();
		System.out.println("Cau 2: ");
		//soLonNhat();
		System.out.println("Cau 3: ");
		//ktKhoang();
		System.out.println("Cau 4: ");
		//ktTangGiam();
		System.out.println("Cau 5: ");
		//tinhLuong();
		System.out.println("Cau 6: ");
		//giaiPT();
		System.out.println("Cau 7: ");
		tinhNgay();
	}
	public static void ktChanLe(){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap so can kiem tra: ");
		n = sc.nextInt();
		if(n%2==0)
			System.out.println( n+ " La so chan ");
		else
			System.out.println(n+ " La so le");
	}
	public static void soLonNhat() {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		a = sc.nextInt();
		System.out.println("Nhap so thu hai: ");
		b = sc.nextInt();
		System.out.println("Nhap so thu ba: ");
		c = sc.nextInt();
		if(a>b&&a>c)
			System.out.println(a+ " la so lon nhat");
		else if (b>a&&b>c)
			System.out.println(b+ " La so lon nhat");
		else
			System.out.println(c+ " La so lon nhat");
	}
	public static void ktKhoang() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra: ");
		n = sc.nextInt();
		if(n>=10&&n<=100)
			System.out.println(n+ " la so nam trong khoang tu 10 den 100");
		else
			System.out.println(n+ " khong phai la so nam trong khoang tu 10 den 100");
	}
	public static void ktTangGiam() {

		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		a = sc.nextInt();
		System.out.println("Nhap so thu hai: ");
		b = sc.nextInt();
		System.out.println("Nhap so thu ba: ");
		c = sc.nextInt();
		if(a>b&&b>c)
			System.out.println("3 so nay la day giam dan");
		else if(a<b&&b<c)
			System.out.println("3 so nay la day tang dan");
		else
			System.out.println("3 so nay khong tang cung khong giam dan");
	}
	public static void tinhLuong() {
		int n;
		int luong = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao TNCT cua nv: ");
		n= sc.nextInt();
		if(n<12)
			luong = (int) (1.92 * 650000);
		if (12<= n && n <36)
			luong = (int) (2.34 * 650000);
		if(36<=n && n<60)
			luong = (int) (3 * 650000);
		if(n>=60)
			luong  =  (int) (4.5 * 650000);
		System.out.println("Luong Cua Nv do la: " + luong);
	}
	public static void giaiPT() {
		float a,b;
		float nghiem = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a= sc.nextFloat();
		System.out.println("Nhap b: ");
		b= sc.nextFloat();
		if(a==0)
			if(b==0)
				System.out.println("Phuong trinh vo so nghiem");
			else
				System.out.println("Phuong trinh vo nghiem");
		if(a!=0&&b!=0)
			{
			nghiem = -b/a ;
			System.out.println("Nghiem cua pt ax+b = 0 la: "+ nghiem);
			}
			
			
	}
	public static void tinhNgay() {
		int thang;
		int ngay=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thang can kiem tra: ");
		thang = sc.nextInt();
		switch(thang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				ngay = 31;
				System.out.println(" Thang "+thang+" co "+ngay+ " ngay");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				ngay = 30;
				System.out.println(" Thang "+thang+" co "+ngay+ " ngay");
				break;
			case 2:
				int nam;
				System.out.println("Nhap vao nam can kiem tra ");
				nam =sc.nextInt();
				if(nam%400==0 || nam%4==0 && nam%100!=0)
				{
						ngay = 29;
						System.out.println("Thang "+thang+ " co "+ngay+ " ngay");
				}
				else
				{
					ngay = 28;
					System.out.println("Thang "+thang+ " co "+ngay+ " ngay");
				}
				break;
				default:
					System.out.println("**********");
					break;
		}
	}
}
