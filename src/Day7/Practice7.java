package Day7;

import java.util.Random;
import java.util.Iterator;
import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int[] arr = new int[n];
		mang1chieu(arr, n);
		System.out.println("Gia tri lon nhat trong mang la: "+timMax(arr, n));
		timMinDuong(arr, n);
		vitriMax(arr, n);
		vitriChandautien(arr, n);
		vitriChancuoicung(arr, n);
		sntLonnhat(arr, n);
		uclnCuaMang(arr, n);
		boiNhoNhat(arr, n);
		lietkeDoan(arr, n);

	}
	
	public static void mang1chieu(int arr[],int n) {
		//Scanner sc = new Scanner(System.in);
		Random rd= new Random();
		for(int i=0;i<n;i++) {
			//System.out.println("Nhap gia tri arr[]"+i+" : ");
			arr[i]= -50 + rd.nextInt(100);
		}
		System.out.println("Mang 1 chieu la: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
	}
	
	
	public static int timMax(int arr[],int n) {
		int max = arr[0];
		for(int i=0;i<n;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	public static void timMinDuong(int arr[],int n) {
		int min = 0,kt=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				min = arr[i];
				kt=1;
				break;
			}
		}
		if(kt==1) {
			for(int i=0;i<n;i++)
				if (arr[i]>0 && min>arr[i])
					min=arr[i];
			System.out.println("So nguyen duong nho nhat trong mang la: "+min);
		}
		else
			System.out.println("Khong co so nguyen duong trong mang!");
	}
	
	public static void vitriMax(int arr[],int n) {
		System.out.print("Vi tri co gia tri lon nhat la: ");
		for(int i=0;i<n;i++) {
			if(timMax(arr, n)==arr[i])
				System.out.print("arr["+i+"] ");
		}
		System.out.println("");
	}
	
	public static void vitriChandautien(int arr[],int n) {
		int kt=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				kt=1;
				System.out.println("Vi tri co gia tri chan dau tien la arr["+i+"]");
				break;
			}		
		}
		if(kt==0)
			System.out.println("Khong co gia tri chan trong mang");
	}
	
	public static void vitriChancuoicung(int arr[],int n) {
		int kt=0;
		for(int i=n-1;i>=0;i--) {
			if(arr[i]%2==0) {
				kt=1;
				System.out.println("So chan dau cuoi cung co trong mang  arr["+i+"] = "+arr[i]);
				break;
			}		
		}
		if(kt==0)
			System.out.println("Khong co gia tri chan trong mang");
	}
	
	public static int snt(int n) {
		int kt=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				kt=0;
		}
		return kt;
	}
	
	public static void sntLonnhat(int arr[],int n) {
		int max=arr[0];
		int kt=0;
		for(int i=0;i<n;i++) {
			if(snt(arr[i])==1 && max<arr[i]) {
				max=arr[i];
				kt=1;
			}
		}
		if(kt==1)
			System.out.println("So nguyen to lon nhat trong mang la: "+max);
		else
			System.out.println("Khong co so nguyen to trong mang");
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
	
	public static void uclnCuaMang(int arr[],int n) {
		int temp = Math.abs(arr[0]);
		for(int i=1;i<n;i++)
			temp= uCLN(temp, Math.abs(arr[i]));
		System.out.println("Uoc chung lon nhat cua mang la: "+temp);
	}
	
	public static int bcnn(int a,int b) {
		return (a*b/uCLN(a, b));
	}
	
	public static void boiNhoNhat(int arr[],int n) {
		int temp = bcnn(Math.abs(arr[0]), Math.abs(arr[1]));
		for(int i=2;i<n;i++)
			temp=bcnn(temp, Math.abs(arr[i]));
		System.out.println("Boi chung nho nhat la: "+temp);
		}
	
	public static void lietkeDoan(int arr[],int n) {
		int x=10;
		int y=20;
		System.out.print("Cac phan tu nam trong doan ["+x+"]...["+y+"] la: ");
		for (int i = 0; i < n; i++) {
			if(x<=arr[i] && arr[i]<=y)
				System.out.print(arr[i]+ " ");
		}
	}
}
