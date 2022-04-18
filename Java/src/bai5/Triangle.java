package bai5;

import java.util.Scanner;

public class Triangle extends hinh {
	float a;
	float h;
	public Triangle() {
		ten = "Hình Tam Giác";
	}
	
	public void nhapA() {	
		System.out.println("Cạnh a: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
	}
	
	public void nhapH() {	
		System.out.println("Chiều cao h: ");
		Scanner sc = new Scanner(System.in);
		h = sc.nextFloat();
	}
	
	
	  
	public void tinhChuVi() {
		chuVi = 3*a;
	}
	 
	public void tinhDienTich() {
		dienTich =(a*h)/2 ;
	}
}

