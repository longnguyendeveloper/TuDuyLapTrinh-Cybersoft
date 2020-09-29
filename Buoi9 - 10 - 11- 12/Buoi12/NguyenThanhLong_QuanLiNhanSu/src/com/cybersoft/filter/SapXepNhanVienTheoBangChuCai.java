package com.cybersoft.filter;

import java.util.Comparator;

import com.cybersoft.quanlynhansu.NhanSu;

public class SapXepNhanVienTheoBangChuCai implements Comparator<NhanSu>{

	@Override
	public int compare(NhanSu nhanSu1, NhanSu nhanSu2) {
		// TODO Auto-generated method stub
		return nhanSu1.getHoTen().compareTo(nhanSu2.getHoTen());
	}

}
