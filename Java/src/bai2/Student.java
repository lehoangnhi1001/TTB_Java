package bai2;

public class Student {
	private String ten, diachi, tuoi;
	int sdt;
	
	public Student() {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diachi = diachi;
		this.sdt = sdt;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getTuoi() {
		if(Integer.valueOf(tuoi) > 0) {
			return tuoi;
		}else {
			return "Tuổi không hợp lệ!";
		}	
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
}

