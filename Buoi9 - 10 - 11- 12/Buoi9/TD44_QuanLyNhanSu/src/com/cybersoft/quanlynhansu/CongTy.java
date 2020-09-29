package com.cybersoft.quanlynhansu;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CongTy {
	/* properties */
	private String tenCongTy;
	private String tenVietTat;
	private String maSoThue;
	private double doanhThuThang;
	public ArrayList<NhanSu> dsNhanSu;

	private int STT = 1;

	/* Constructors */
	public CongTy() {
		tenCongTy = "";
		maSoThue = "";
		dsNhanSu = new ArrayList<NhanSu>();
	}

	public CongTy(String tenCongTy, String maSoThue) {
		this.tenCongTy = tenCongTy;
		this.maSoThue = maSoThue;
		dsNhanSu = new ArrayList<NhanSu>();
	}

	public CongTy(String tenCongTy, String maSoThue, double doanhThuThang) {
		this.tenCongTy = tenCongTy;
		this.maSoThue = maSoThue;
		this.doanhThuThang = doanhThuThang;
		dsNhanSu = new ArrayList<NhanSu>();
	}
	/* get, set */

	/* Methods */
	public void nhapThongTin(Scanner sc) {
		System.out.print("Tên công ty: ");
		tenCongTy = sc.nextLine();
		System.out.print("Mã số thuế: ");
		maSoThue = sc.nextLine();
		System.out.print("Doanh thu tháng hiện tại: ");
		doanhThuThang = Double.parseDouble(sc.nextLine());

	}

	public boolean themNhanSu(NhanSu ns) {
		/*
		 * 1. kiểm tra null
		 * 
		 * 2. kiểm tra tên rỗng
		 * 
		 * 3. kiểm tra trùng lặp
		 * 
		 * 4. Thêm
		 */
		dsNhanSu.add(ns);
		return true;

	}

	public boolean xoaNhanSu(String maSo) {
		if (maSo == null)
			return false;

		for (NhanSu nhanSu : dsNhanSu) {
			if (maSo.equalsIgnoreCase(nhanSu.getMaSo())) {
				dsNhanSu.remove(nhanSu);
				return true;
			}
		}
		return false;
	}

	public void xuatThongTin() {
		int num = 72;
		String ttCongTy = "THÔNG TIN CÔNG TY";
		String ttNhanSu = "DANH SÁCH NHÂN SỰ";

		System.out.println();
		System.out.println(String.format("%" + (num * 2 - ttCongTy.length()) / 2 + "s", "") + ttCongTy
				+ String.format("%" + (num * 2 - ttCongTy.length()) / 2 + "s", ""));
		System.out.println("Tên công ty: " + tenCongTy);
		System.out.println("Mã số thuế: " + maSoThue);
		System.out.println("Doanh thu: " + String.format("%20.2f", doanhThuThang));

		System.out.println();
		System.out.println(String.format("%" + (num * 2 - ttNhanSu.length()) / 2 + "s", "") + ttNhanSu
				+ String.format("%" + (num * 2 - ttNhanSu.length()) / 2 + "s", ""));
		drawLine(num);
		System.out.println();
		System.out.println(String.format(" %10s  ", "Mã số") + String.format("%16s  ", "Họ tên")
				+ String.format("%16s  ", "Số điện thoại") + String.format("%12s  ", "Ngày làm")
				+ String.format("%16s  ", "Lương cơ bản") + String.format("%17s  ", "Lương")
				+ String.format("%16s", "Chức vụ") + String.format("%25s  ", "Số nhân viên/Cổ phần"));
		drawLine(num);
		System.out.println();
		for (NhanSu nhanSu : dsNhanSu) {
			nhanSu.xuatThongTin();
		}
		drawLine(num);
	}

	private void drawLine(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("- ");
		}
	}

	/*
	 * Tự sinh mã nhân viên theo định dạng:
	 * 
	 * "TênViếtTắt" + năm gia nhập cty + STT (4 số) ví dụ: CG20200100,... Hàm này sẽ
	 * được gọi khi một Nhân sự mới được thêm vào công ty
	 */

	private String generateId() {
		return tenVietTat + OffsetDateTime.now().getYear() + getStt(4);
	}

	private String genarateId() {
		return "";
	}

	private String getStt(int length) {
		String result = "";
		int i = 1;

		while (STT / Math.pow(10, length - i) == 0) {
			result = "0";
			i++;
		}
		result += result;
		STT++;
		return result;
	}

	public boolean daTonTaiNhanSu(NhanSu ns) {
		for (NhanSu nhanSu : dsNhanSu) {
			if (nhanSu.getSoDt().equalsIgnoreCase(ns.getSoDt()))
				return true;
		}
		return false;
	}

	public double tinhTongLuongToanCongTy() {
		double tong = 0;
		for (NhanSu nhanSu : dsNhanSu) {
			tong = tong + nhanSu.tinhLuong();
		}
		return tong;

	}

}
