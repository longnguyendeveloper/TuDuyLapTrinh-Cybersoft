package com.cybersoft.quanlynhansu;

public class GiamDoc extends NhanSu {
	/* properties */
	private float soCoPhan;

	/* Constructor */
	public GiamDoc(float soCoPhan) {
		super();
		luongMotNgay = 300;

	}

	public GiamDoc(String maSo, String hoTen, String soDt, float soNgayLamViec, float luongMotNgay, float soCoPhan) {
		super(maSo, hoTen, soDt, soNgayLamViec, luongMotNgay);
		this.soCoPhan = soCoPhan;
	}

	/* Methods */

	@Override
	public double tinhLuong() {
		/*
		 * lương giám đốc bao gồm phần cổ tức theo doanh thu
		 */
		return super.tinhLuong();
	}

	@Override
	public String getChucVu() {
		return "Giám đốc";
	}

	@Override
	public String getThongTinThem() {
		return String.valueOf(soCoPhan);
	}

}
