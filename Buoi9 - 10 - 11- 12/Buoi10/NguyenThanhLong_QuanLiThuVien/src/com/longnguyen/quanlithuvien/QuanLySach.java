package com.longnguyen.quanlithuvien;

import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
	/* Properties */
	private List<Sach> dsSach;
	private float tongTienSachGiaoKhoa;
	private float tongTienSachThamkhao;

	/* Constructor */
	public QuanLySach(List<Sach> _dsSach, float _tongTienSachGiaoKhoa, float _tongTienSachThamkhao) {
		this.dsSach = _dsSach;
		this.tongTienSachGiaoKhoa = _tongTienSachGiaoKhoa;
		this.tongTienSachThamkhao = _tongTienSachThamkhao;
	}

	public QuanLySach() {
		this.dsSach = new ArrayList<Sach>();
	}

	/* Methods */
	public void themSach(Sach sach) {
		this.dsSach.add(sach);
	}
	
	public void xuatDanhSachCacLoaiSach() {
		for(Sach loaisach:this.dsSach) {
			if(loaisach instanceof SachGiaoKhoa) {
				loaisach.xuat();
				
			}
		}
	}

}
