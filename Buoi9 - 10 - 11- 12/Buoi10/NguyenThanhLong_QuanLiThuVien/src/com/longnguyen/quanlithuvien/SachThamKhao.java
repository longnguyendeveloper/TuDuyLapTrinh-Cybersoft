package com.longnguyen.quanlithuvien;

public class SachThamKhao extends Sach {
	/* Properties */
	private float thue;
	

	/* Constructor */
	public SachThamKhao(String _maSach, String _ngayNhap, float _donGia, int _soLuong, String _nhaXuatBan,
			float _thue) {
		super(_maSach, _ngayNhap, _donGia, _soLuong, _nhaXuatBan);
		this.thue = _thue;
	}

	public SachThamKhao() {
		super();
		this.maSach = "";
		this.ngayNhap = "";
		this.nhaXuatBan = "";
		this.thue = -1;
	}

	/* Getters & Setters */

	/* Methods */
	public float thanhTien() {
		float tongTien = 0;
		tongTien = soLuong * donGia + thue;
		return tongTien;
	}
	
	@Override
	public void nhap() {
		System.out.print("Nhập giá thuế: ");
		thue = Float.parseFloat(scanner.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.print(", thuế: " + this.thue);

	}

}
