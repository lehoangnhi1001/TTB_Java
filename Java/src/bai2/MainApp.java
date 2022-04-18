package bai2;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std[] = new Student[1];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.println("Nhập vào người thứ "+(i+1));
			
			System.out.println("Nhập tên: ");
			std[i].setTen(sc.nextLine());
			
			System.out.println("Nhập tuổi: ");
			std[i].setTuoi(sc.nextLine());
			
			System.out.println("Nhập địa chỉ: ");
			std[i].setDiachi(sc.nextLine());
			
			System.out.println("Nhập số điện thoại: ");
			std[i].setSdt(sc.nextInt());
		}
		
		System.out.println("Danh sách sinh viên");
		for(int i = 0 ; i < std.length; i++) {
			Student p = std[i];
			System.out.format("Tên: %S - Tuổi: %S - Địa chỉ:%S - SĐT:%S" , p.getTen(),p.getTuoi(),p.getDiachi(),p.getSdt());
			System.out.println();
		}
	}

}
