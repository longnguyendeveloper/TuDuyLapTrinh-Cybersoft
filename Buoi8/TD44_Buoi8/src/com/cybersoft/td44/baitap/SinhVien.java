package com.cybersoft.td44.baitap;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class SinhVien {
	// properties
	private String tenSv, maSv;
	private float diemToan, diemLy, diemHoa;

	// id tự tăng
	private static int soTT = 1;

	private static String generateId() {
		return "SV" + OffsetDateTime.now().getYear() + OffsetDateTime.now().getMonthValue() + soTT++;
	}

	// constructor
	public SinhVien() {
		maSv = generateId();
		tenSv = "";
	}

	public SinhVien(String tenSv, String maSv, float diemToan, float diemLy, float diemHoa) {
		this.tenSv = tenSv;
		maSv = generateId();
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	// getters & setters
	public String getTenSv() {
		return tenSv;
	}

	public String getMaSv() {
		return maSv;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	// methods
	public void nhapThongTin(Scanner scanner) {
		System.out.println("+++ T H Ô N G-T I N-S I N H-V I Ê N");
		System.out.print("Nhập tên sinh viên: ");
		tenSv = scanner.nextLine();
		System.out.println("+++ Đ I Ể M-S I N H-V I Ê N");
		System.out.print("Nhập điểm Toán: ");
		diemToan = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập điểm Lý: ");
		diemLy = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập điểm Hóa: ");
		diemHoa = Float.parseFloat(scanner.nextLine());
	}

	public void xuatThongTin() {

		System.out.println(
				String.format("%10s *", maSv) + String.format("%16s *", tenSv) + String.format("%7.2f *", diemToan)
						+ String.format("%7.2f *", diemLy) + String.format("%7.2f *", diemHoa)
						+ String.format("%7.2f *", tinhDiemTrungBinh()) + String.format("%12s *", xepLoai()));
		System.out.println();

	}

	public float tinhDiemTrungBinh() {
		float diemTb = (diemHoa + diemLy + diemToan) / 3;
		return diemTb;
	}

	public String xepLoai() {
		float diemTb = tinhDiemTrungBinh();
		if (diemTb >= 9)
			return "Xuất sắc";
		else if (diemTb >= 8)
			return "Giỏi";
		else if (diemTb >= 7)
			return "Khá";
		else if (diemTb >= 6)
			return "TB - Khá";
		else if (diemTb >= 5)
			return "Trung Bình";
		else
			return "Yếu";
	}

}
