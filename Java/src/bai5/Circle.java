package bai5;

import java.util.Scanner;

public class Circle extends hinh{
	float bankinh;
	
	public Circle() {
		ten = "Hình Tròn";
	}
	
	void nhapBK() {
		System.out.println("Bán kính: ");
		Scanner sc = new Scanner(System.in);
		bankinh = sc.nextFloat();
		
	}
	
	void tinhChuVi() {
		chuVi = (float) (2 * Math.PI * bankinh);
	}
	
	void tinhDienTich() {
		dienTich = (float) (Math.PI * bankinh* bankinh);
	}

}
