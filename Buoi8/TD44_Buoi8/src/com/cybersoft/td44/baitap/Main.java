package com.cybersoft.td44.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		/*
		 * HinhChuNhat hcn = new HinhChuNhat();
		 * 
		 * hcn.nhapThongTin(scanner); hcn.xuatThongTin(scanner);
		 * 
		 * ArrayList<HinhChuNhat> dsHinhChuNhat;
		 * 
		 * dsHinhChuNhat = new ArrayList<HinhChuNhat>();
		 */

		// ví dụ tạo 1 array list lưu danh sách tên sinh viên

		/*
		 * ArrayList<String> dsTenSv = new ArrayList<String>();
		 * 
		 * dsTenSv.add("Long"); dsTenSv.add("Thanh");
		 * System.out.println(dsTenSv.toString());
		 * 
		 * dsTenSv.set(0, "Nguyễn"); System.out.println(dsTenSv.toString());
		 * 
		 * System.out.println(dsTenSv.size());
		 */
		
		SinhVien sv = new SinhVien();
		sv.nhapThongTin(scanner);
		sv.xuatThongTin();

	}

}
