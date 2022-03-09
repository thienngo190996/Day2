package Day4;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cau 1");
		//diemTB();
		
		System.out.println("Cau 2: ");
		//tongN();

		System.out.println("Cau 3: ");
		//tongSn();
		
		System.out.println("Cau 4: ");
		//ktSNT();
		
		System.out.println("Cau 5: ");
		//sNTnhohonN();
		System.out.println("");
		
		System.out.println("Cau 6: ");
		uocSolelonnhat();
		System.out.println("");
		
		
		System.out.println("Cau 7: ");
		tongUocsochan();
		
		System.out.println("Cau 8: ");
		tongChusochan();		
	}
	
	public static void diemTB() {
		Scanner sc = new Scanner(System.in);
		String name;
		float dToan;
		float dVan;
		float dTB;
		System.out.println("Nhap ho va ten: ");
		name = sc.nextLine();
		System.out.println("Nhap Diem toan: ");
		dToan = sc.nextFloat();
		System.out.println("Nhap diem van: ");
		dVan = sc.nextFloat();
		dTB=(dToan+dVan)/2;
		System.out.println("Diem trung binh la: "+dTB);
	}
	
	public static void tongN() {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		int tong=0;
		for(int i=1;i<=n;i++)
			tong=tong+i;
		System.out.println("Tong tu 1 den "+n+ " la " +tong);
	}
	
	 public static void tongSn() {
		 Scanner sc = new Scanner(System.in);
		 int n,x;
		 int tong=0;
		 System.out.println("Nhap n: ");
		 n =sc.nextInt();
		 System.out.println("Nhap x: ");
		 x=sc.nextInt();
		 for(int i=1;i<=n;i++)
			 tong = (int) (tong + Math.pow(x, n));
		 System.out.println("Tong S(n) = "+tong);
	 }
	 
	 public static int sNT(int n) {	
		 int kt=0;
		 for(int i=2;i<=n/2;i++)
			 if(n%i==0) {
				 kt=1;
				 break;
			 }
		return kt;
	 }
	 
	 public static void ktSNT() {
		 Scanner sc = new Scanner(System.in);
		 int a;
		 System.out.println("Nhap so can kiem tra: ");
		 a =sc.nextInt();
		 if(sNT(a)==0)
			 System.out.println(a+ " la so nguyen to");
		 else
			 System.out.println(a+ " khong phai la so nguyen to");
	 }
	 
	 public static void sNTnhohonN() {
		 Scanner sc = new Scanner(System.in);
		 int n;
		 System.out.println("Nhap n: ");
		 n =sc.nextInt();
		 System.out.println("Cac SNT nho hon " +n+" la ");
		 for(int i= 2;i<n;i++) {
			 if(sNT(i)==0)
				 System.out.print(i+" ");
		 }
	 }
	 
	 public static void uocSolelonnhat() {
		 Scanner sc = new Scanner(System.in);
		 int n;
		 System.out.println("Nhap n: ");
		 n =sc.nextInt();
		 for(int i=n/2;i>=1;i--)
			 if(n%i==0 && i%2!=0) {
				 System.out.print("Uoc so le lon nhat cua "+n+" la "+i);
				 break;
			 }
	 }
	 
	 public static void tongUocsochan() {
		 Scanner sc = new Scanner(System.in);
		 int n;
		 int tong = 0;
		 System.out.println("Nhap n: ");
		 n =sc.nextInt();
		 for(int i=2;i<=n;i++) {
			 if(i%2==0)
				 tong=tong+i;
		 }
		 System.out.println("Tong cac uoc so chan cua "+n+" la "+tong);
	 }
	 
	 public static void tongChusochan() {
		 Scanner sc = new Scanner(System.in);
		 int n;
		 int temp=0;
		 int tong = 0;
		 System.out.println("Nhap n: ");
		 n =sc.nextInt();
		 System.out.print("Tong cac chu so chan trong so "+n+" la ");
		 while(n>0)
		 {
			 temp = n%10;
			 if(temp%2==0)
				 tong=tong+temp;
			 n=n/10;
		 }
		 System.out.println(tong);
	 }
	 

	 
}
