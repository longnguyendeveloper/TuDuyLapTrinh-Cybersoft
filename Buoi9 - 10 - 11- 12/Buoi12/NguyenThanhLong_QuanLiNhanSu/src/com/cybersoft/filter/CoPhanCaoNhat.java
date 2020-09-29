package com.cybersoft.filter;

import java.util.Comparator;

import com.cybersoft.quanlynhansu.GiamDoc;
import com.cybersoft.quanlynhansu.NhanSu;

public class CoPhanCaoNhat implements Comparator<GiamDoc> {

	@Override
	public int compare(GiamDoc giamDoc1, GiamDoc giamDoc2) {
		// TODO Auto-generated method stub
		  if (giamDoc1.getSoCoPhan() > giamDoc2.getSoCoPhan()) {
			  return -1; // highest value first
		  }
	        return 1;
	}

}
