package Day9;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Practice9 {

	public static void main(String[] args) {
		int n=10;
		int[] arr = new int[n];
		mang1chieu(arr, n);
		System.out.println("Mang 1 chieu la: ");
		xuatmang(arr, n);
		//solanXxuathien(arr, n);
		//sntnhohon100(arr, n);
		//tangdan(arr, n);
		//letang(arr, n);
		//duongtangamgiam(arr, n);
		//sapxepchiahet3(arr, n);
		//chandaulecuoi(arr, n);
		//themXvaovitriK(arr, n);
		xoaK(arr, n);
		
	}
	
	public static void mang1chieu(int arr[],int n) {
		//Scanner sc = new Scanner(System.in);
		Random rd= new Random();
		for(int i=0;i<n;i++) {
			//System.out.println("Nhap gia tri arr[]"+i+" : ");
			arr[i]= rd.nextInt(10);
		}
	}
	
	public static void xuatmang(int arr[],int n) {
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
	}
	
	public static void solanXxuathien(int arr[],int n) { //So lan x xuat hien
		int x,dem=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap x: ");
		x= sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==x)
				dem++;
		}
		System.out.println("So lan "+x+" xuat hien trong mang la: "+dem);
	}
	
	public static boolean snt(int n) { //kiem tra snt
		boolean kt=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				kt= false;
		}
		if(n==0&&n==1)
			return false;
		return kt;
	}
	
	public static void sntnhohon100(int arr[], int n) { // snt nho hon 100 trong mang
		int dem=0;
		for(int i=0;i<n;i++) {
			if(snt(arr[i])==true && arr[i]<100)
				dem++;
		}
		System.out.println("So luong SNT nho hon 100 trong mang la: "+dem);
	}
	
	public static void tangdan(int arr[],int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++)
				if(arr[i]>=arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		System.out.println("Mang sau khi sap xep la: ");
		xuatmang(arr, n);	
	}
	
	public static void letang(int arr[],int n) { //le tang gia tri khac giu nguyen
		int temp;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0)
				for(int j=i+1;j<n;j++)
					if(arr[j]%2!=0 &&arr[i]>=arr[j]) {
						temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
		}
		System.out.println("Mang sau khi sap xep la: ");
		xuatmang(arr, n);	
	}
	
	public static void duongtangamgiam(int arr[],int n) { //duong tang am giam
		int temp;
		for(int i=0;i<n;i++) {
			if(arr[i]>=0)
				for(int j=i+1;j<n;j++)
					if(arr[j]>=0&&arr[i]>=arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<0)
				for(int j=i+1;j<n;j++)
					if(arr[j]<0&&arr[i]<=arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
		}
		System.out.println("Mang sau khi sap xep la: ");
		xuatmang(arr, n);
	}
	
	public static void sapxepchiahet3(int arr[],int n) { // so chia het 3 ve dau mang
		int temp;
		for(int i=0;i<n;i++) {
			if(arr[i]%3!=0)
				for(int j=i+1;j<n;j++)
					if(arr[j]%3==0) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
		}
		System.out.println("Mang sau khi sap xep la: ");
		xuatmang(arr, n);
	}
	
	public static void chandaulecuoi(int arr[],int n) { // sap xep chan ve dau le ve cuoi 0 o giua
		int dem=0,temp;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0||arr[i]==0)
				for(int j=i+1;j<n;j++)
					if(arr[j]%2==0&&arr[j]!=0) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
		}
		for(int i=0;i<n;i++)
			if(arr[i]%2==0)
				dem++;
		for(int i=dem-1;i<n;i++) {
			if(arr[i]!=0)
				for(int j=i+1;j<n;j++)
					if(arr[j]==0) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
		}
		System.out.println("Mang sau khi sap xep la: "+dem);
		xuatmang(arr, n);
	}
	
	public static void themXvaovitriK(int arr[],int n) {
		Scanner sc= new Scanner(System.in);
		int x,vitri;
		int [] newArr = new int[n+1];
		//newArr=arr;
		for (int i = 0; i < n; i++) {
			newArr[i]=arr[i];
		}
		System.out.println("Nhap gia tri can them: ");
		x= sc.nextInt();
		System.out.println("Nhap vi tri can them: ");
		vitri =sc.nextInt();
		for(int i=newArr.length-1;i>vitri;i--) {
			newArr[i]=newArr[i-1];
		}
		newArr[vitri]=x;
		System.out.println("Mang moi la: ");
		xuatmang(newArr, newArr.length);
		
	}
	
	public static void xoaK(int arr[],int n) {
		Scanner sc= new Scanner(System.in);
		int k;
		System.out.println("Nhap k: ");
		k =sc.nextInt();
		for(int i=k;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		n--;
		System.out.println("Mang sau khi xoa la: ");
		xuatmang(arr, n);
		
	}
	
}
