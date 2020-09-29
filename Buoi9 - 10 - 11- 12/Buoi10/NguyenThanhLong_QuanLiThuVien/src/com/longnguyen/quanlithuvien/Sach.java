package com.longnguyen.quanlithuvien;

import java.util.Scanner;

public class Sach {
	/* Properties */
	protected String maSach;
	protected String ngayNhap;
	protected float donGia;
	protected int soLuong;
	protected String nhaXuatBan;
	Scanner scanner = new Scanner(System.in);

	/* Constructors */
	public Sach(String _maSach, String _ngayNhap, float _donGia, int _soLuong, String _nhaXuatBan) {
		this.maSach = _maSach;
		this.ngayNhap = _ngayNhap;
		this.donGia = _donGia;
		this.soLuong = _soLuong;
		this.nhaXuatBan = _nhaXuatBan;
	}

	public Sach() {
		this.maSach = "";
		this.ngayNhap = "";
		this.nhaXuatBan = "";
	}

	/* getters & setters */

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	/* Methods */
	public void nhap() {
		System.out.print("----- NHẬP THÔNG TIN SÁCH -----");
		System.out.print("Nhập mã sách: ");
		maSach = scanner.nextLine();
		System.out.print("Nhập ngày nhập: ");
		ngayNhap = scanner.nextLine();
		System.out.print("Nhập đơn giá: ");
		donGia = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập số lượng: ");
		soLuong = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập nhà xuất bản: ");
		nhaXuatBan = scanner.nextLine();

	}

	public void xuat() {
		System.out.print("Mã sách: " + this.maSach + ", ngày nhập: " + ngayNhap + ", đơn giá: " + donGia +"đ" + ", số lượng "
				+ soLuong + ", nhà xuất bản: " + nhaXuatBan);
	}
	

}
