package com.longnguyen.quanlithuvien;

public class SachGiaoKhoa extends Sach {
	/* Properties */
	private String tinhTrang;

	/* Constructor */
	public SachGiaoKhoa(String _maSach, String _ngayNhap, float _donGia, int _soLuong, String _nhaXuatBan,
			String _tinhTrang) {
		super(_maSach, _ngayNhap, _donGia, _soLuong, _nhaXuatBan);
		this.tinhTrang = _tinhTrang;
	}

	public SachGiaoKhoa() {
		super();
		this.maSach = "";
		this.ngayNhap = "";
		this.nhaXuatBan = "";
		this.tinhTrang = "";
	}

	/* Getters & Setters */

	/* Methods */
	public float thanhTien() {
		float tongTien = 0;
		if ("Cũ".equals(tinhTrang) || "cũ".equals(tinhTrang)) {
			tongTien = soLuong * donGia;
		} else {
			tongTien = soLuong * donGia / 2;
		}

		return tongTien;
	}

	@Override
	public void nhap() {
		System.out.print("Nhập giá thuế: ");
		tinhTrang = scanner.nextLine();
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.print(", tình trạng: " + this.tinhTrang);

	}
}
