package com.cybersoft.td44.baitap;

import java.util.Scanner;

public class HinhChuNhat {
	// properties
	private float chieuDai, chieuRong, chuVi, dienTich;

	// constructor
	public HinhChuNhat() {

	}

	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	// getters, setters
	public float getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}

	public float getChuVi() {
		return chuVi;
	}

	public float getDienTich() {
		return dienTich;
	}

	// methods
	public void nhapThongTin(Scanner scanner) {
		System.out.println("*** HINH CHU NHAT***");
		System.out.print("Độ dài cạnh: ");
		chieuDai = Float.parseFloat(scanner.nextLine());
		System.out.print("Độ rộng cạnh: ");
		chieuRong = Float.parseFloat(scanner.nextLine());
	}

	public void xuatThongTin(Scanner scanner) {
		System.out.println("*** HINH CHU NHAT ***");
		System.out.print("Dài:\t" + chieuDai + "Rộng:\t" + chieuRong);
		for (int i = 0; i < chieuDai; i++) {
			for (int j = 0; j < chieuRong; j++) {
				System.out.println(" * ");
				System.out.println();
			}
		}
	}

	public float tinhChuVi() {
		chuVi = chieuDai * 2 + chieuRong * 2;
		return chuVi;

	}

	public float tinhDienTich() {
		dienTich = chieuDai * chieuRong;
		return dienTich;

	}

}
