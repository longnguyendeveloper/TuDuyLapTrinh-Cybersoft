package com.cybersoft.filter;

import java.util.Comparator;

import com.cybersoft.quanlynhansu.NhanSu;

public class SapXepLuong implements Comparator<NhanSu> {

	@Override
	public int compare(NhanSu nhanSu1, NhanSu nhanSu2) {
		// TODO Auto-generated method stub
		if(nhanSu1.tinhLuong()>nhanSu2.tinhLuong()) {
			return -1;
		}
		return 1;
	}

}
