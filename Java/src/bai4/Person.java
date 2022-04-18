package bai4;

import java.util.Scanner;

public class Person {
	String ten;
	int tuoi, sdt;
	void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		this.ten = sc.nextLine();
		
		System.out.println("Nhập tuổi: ");
		this.tuoi = sc.nextInt();
		
		System.out.println("Nhập số điện thoại: ");
		this.sdt = sc.nextInt();
		
	}
	void Xuat() {
		System.out.println("Tên: " + this.ten + "Tuổi: " + this.tuoi + "SĐT: " + this.sdt);
	}
}
