package Day6;

import java.util.Scanner;

public class Pactice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cau 1: ");
		//tinhSn();
		
		System.out.println("Cau 2: ");
		//tichUSL();
		
		System.out.println("Cau 3: ");
		//tongUs();
		
		System.out.println("Cau 4: ");
		//tichCSL();

		System.out.println("Cau 5: ");
		//chusoDT();
		
		System.out.println("Cau 6: ");
		//sodaonguoc();
		
		System.out.println("Cau 7: ");
		//chusolonnhat();
		
		System.out.println("Cau 8: ");
		uocLN();
		
		System.out.println("Cau 9: ");
		boiCNN();
	}
	public static void tinhSn() {
		int n;
		float s=0;
		float b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n= sc.nextInt();
		for(float i=1 ; i<=n; i++) {
			b= i/(i+1);
			s=s+b;
		}
		System.out.println("Sn = " +  s);
	}
	
	public static void tichUSL() {
		int n;
		int tich = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n= sc.nextInt();
		for(int i=1; i<=n/2;i++) {
			if(n%i==0 && i%2!=0)
				tich = tich*i;
		}
		System.out.println("Tich cac USL = "+tich);
	}
	
	public static void tongUs() {
		int n;
		int tong = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n= sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0)
				tong+=i;
		}
		System.out.println("Tong cac US = "+ tong);
	}

	public static void tichCSL() {
		int n;
		int temp;
		int tich = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n= sc.nextInt();
		while(n!=0) {
			temp = n%10;
			 if(temp%2!=0)
				 tich=tich*temp;
			 n=n/10;
		}
		System.out.println("Tich cac chu so le la: "+tich);
	}
	
	public static void chusoDT() {
		int n;
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n= sc.nextInt();
		while(n!=0) {
			temp = n%10;
			 n=n/10;
		}
		System.out.println("Chu so dau tien la: "+ temp);
	}
	
	public static void sodaonguoc() {
		int n;
		int temp;
		int so=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n= sc.nextInt();
		while(n!=0) {
			temp = n%10;
			so = so +temp;
			so = so*10;
			 n=n/10;
		}
		so=so/10;
		System.out.println("So dao nguoc la: "+ so);
	}
	
	public static void chusolonnhat() {
		int n;
		int max=0;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n= sc.nextInt();
		while(n!=0) {
			temp = n%10;
			if(max<=temp)
				max = temp;
			 n=n/10;
		}
		System.out.println("Chu so lon nhat trong n la: "+ max);
	}
	
	public static int uCLN(int a,int b) {
		if(a==0||b==0)
			return a+b;
		else
		{
			while(a!=b) {
				if(a>b)
					a=a-b;
				else
					b=b-a;
			}
			return a;
		}
	}
	public static void uocLN() {
		int a,b,uCLN;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		a= sc.nextInt();
		System.out.println("Nhap so thu hai: ");
		b= sc.nextInt();
		uCLN = uCLN(a, b);
		System.out.println("Uoc chung lon nhat cua 2 so la: "+uCLN);	
	}
	
	public static void boiCNN() {
		int a,b,BCNN;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		a= sc.nextInt();
		System.out.println("Nhap so thu hai: ");
		b= sc.nextInt();
		BCNN = (a*b)/uCLN(a, b);
		System.out.println("Boi chung nho nhat cua 2 so la: "+ BCNN);
		
	}
}
