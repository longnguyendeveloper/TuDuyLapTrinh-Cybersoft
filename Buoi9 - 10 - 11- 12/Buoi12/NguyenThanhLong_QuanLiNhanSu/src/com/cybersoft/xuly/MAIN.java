package com.cybersoft.xuly;

import java.util.Scanner;
import com.cybersoft.quanlynhansu.CongTy;
import com.cybersoft.quanlynhansu.GiamDoc;
import com.cybersoft.quanlynhansu.NhanSu;
import com.cybersoft.quanlynhansu.NhanVien;
import com.cybersoft.quanlynhansu.TruongPhong;

public class MAIN {
	public static void main(String[] args) {

		String bienNull = null;

		System.out.println("".equals(bienNull));

		Scanner scanner = new Scanner(System.in);
		CongTy congTy = new CongTy();
		themDummyData(congTy);

		congTy.xuatThongTin();
		System.out.println();
		int luaChon;

		/*
		 * Menu quản lý nhân sự
		 */
		do {
			luaChon = inMenu(scanner);

			switch (luaChon) {
			case 1:
				System.out.print("Tên công ty: ");
				congTy.setTenCongTy(scanner.nextLine());
				System.out.print("Tên viết tắt: ");
				congTy.setTenVietTat(scanner.nextLine());
				System.out.print("Mã số thuế: ");
				congTy.setMaSoThue(scanner.nextLine());
				System.out.print("Doanh thu tháng: ");
				congTy.setDoanhThuThang(Double.parseDouble(scanner.nextLine()));
				congTy.xuatThongTin();

				break;
			case 2:
				congTy.phanBoNhanVien(scanner);
				break;
			case 3:
				System.out.println("Họ và tên: ");
				String hoTen = scanner.nextLine();
				System.out.println("Số điện thoại: ");
				String sdt = scanner.nextLine();
				System.out.println("Ngày làm: ");
				float ngayLam = Float.parseFloat(scanner.nextLine());
				System.out.println("Chức vụ: ");
				String chucVu = scanner.nextLine();
				if (chucVu.equalsIgnoreCase("Nhân viên")) {
					congTy.themNhanSu(new NhanVien("", hoTen, sdt, ngayLam, 100));
				} else if (chucVu.equalsIgnoreCase("Trưởng phòng")) {
					congTy.themNhanSu(new TruongPhong("", hoTen, sdt, ngayLam, 200, 0));
				} else if (chucVu.equalsIgnoreCase("Giám đốc")) {
					System.out.println("Cổ phần: ");
					float coPhan = Float.parseFloat(scanner.nextLine());
					congTy.themNhanSu(new GiamDoc("", hoTen, sdt, ngayLam, 300, coPhan));
				} else {
					System.out.println("Thiếu chức vụ!");
				}
				congTy.xuatThongTin();
				break;
			case 4:

				break;
			case 5:
				congTy.xuatThongTin();

				break;
			case 6:
				System.out.println("Tổng lương: " + congTy.tinhTongLuong());

				break;
			case 7:
				System.out.println("Nhân viên có lương cao nhất:");

				NhanSu nhanVien = congTy.timNhanVienLuongCaoNhat();
				nhanVien.xuatThongTin();

				break;
			case 8:
				System.out.println("Trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất:");
				NhanSu truongPhong = congTy.timTruongPhongQuanLyNhieuNhat();
				if (truongPhong != null)
					truongPhong.xuatThongTin();

				break;
			case 9:
				System.out.println("Sắp xếp nhân sự toàn công ty theo thứ tự abc:");
				congTy.sapXepNhanSu();
				break;
			case 10:
				System.out.println("Sắp xếp nhân sự toàn công ty theo thứ tự lương giảm dần:");
				congTy.sapXepLuong();
				break;
			case 11:
				System.out.println("Tìm Giám Đốc có số lượng cổ phần nhiều nhất:");
				// congTy.coPhanLonNhat();
				break;
			case 12:
				System.out.println("Tìm Giám Đốc có số lượng cổ phần nhiều nhất:");
				// congTy.coPhanLonNhat();
				break;
			case 0:
				System.out.println("Kết thúc chương trình.");
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ.");
				break;
			}
			scanner.nextLine();
		} while (luaChon != 0);

	}

	static int inMenu(Scanner sc) {
		int spaceNum = 20;
		System.out.println(
				String.format("%" + spaceNum + "s", "") + "QUẢN LÝ NHÂN SỰ" + String.format("%" + spaceNum + "s", ""));
		System.out.println("Menu:");
		System.out.println("\t1. Nhập thông tin công ty");
		System.out.println("\t2. Phân bổ Nhân viên vào Trưởng phòng");
		System.out.println("\t3. Thêm thông tin một nhân sự");
		System.out.println("\t4. Xóa thông tin một nhân sự");
		System.out.println("\t5. Xuất ra thông tin toàn bộ người trong công ty");
		System.out.println("\t6. Tính và xuất tổng lương cho toàn công ty");
		System.out.println("\t7. Tìm Nhân viên thường có lương cao nhất");
		System.out.println("\t8. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất");
		System.out.println("\t9. Sắp xếp nhân viên toàn công ty theo thứ tự abc");
		System.out.println("\t10. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
		System.out.println("\t11. Tìm Giám Đốc có số lượng cổ phần nhiều nhất");
		System.out.println("\t12. Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
		System.out.println("\t0. Thoát.");
		System.out.print("Lựa chọn: ");
		return Integer.parseInt(sc.nextLine());
	}

	static void themDummyData(CongTy cty) {
		cty.themNhanSu(new NhanVien("", "Tuấn", "0369296613", 25, 100));
		cty.themNhanSu(new NhanVien("", "Lâm", "0369296614", 21, 100));
		cty.themNhanSu(new NhanVien("", "Trần", "0369296615", 26, 100));
		cty.themNhanSu(new NhanVien("", "Khang", "0369296213", 21, 100));
		cty.themNhanSu(new NhanVien("", "An", "0369296663", 20, 100));
		cty.themNhanSu(new NhanVien("", "Khánh", "0369766613", 22, 100));
		cty.themNhanSu(new NhanVien("", "Phong", "0369216613", 22, 100));
		cty.themNhanSu(new NhanVien("", "Thanh", "0369896613", 22, 100));
		cty.themNhanSu(new NhanVien("", "Chí", "0369200613", 22, 100));
		cty.themNhanSu(new NhanVien("", "Tuấn", "0369226613", 22, 100));
		cty.themNhanSu(new NhanVien("", "Trí", "0369296513", 22, 100));

		cty.themNhanSu(new TruongPhong("", "Lee", "0909001002", 20, 200, 0));
		cty.themNhanSu(new TruongPhong("", "Anh", "0909001003", 20, 200, 0));
		cty.themNhanSu(new TruongPhong("", "Tú", "0909001004", 20, 200, 0));

		cty.themNhanSu(new GiamDoc("", "Vượng", "0900000001", 15, 300, 15));
		cty.themNhanSu(new GiamDoc("", "Sang", "0900000001", 15, 300, 25));
		cty.themNhanSu(new GiamDoc("", "Long", "0900000001", 15, 300, 5));
		cty.themNhanSu(new GiamDoc("", "Thái", "0900000001", 15, 300, 15));
		cty.themNhanSu(new GiamDoc("", "Thịnh", "0900000001", 15, 300, 10));

	}
}
