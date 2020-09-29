import java.util.Scanner;

public class Bai1_QuanLyTuyenSinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float mon1, mon2, mon3, diemChuan;
		String doiTuongUuTien, khuVuc;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập điểm môn thi 1: ");
		mon1 = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập điểm môn thi 2: ");
		mon2 = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập điểm môn thi 3: ");
		mon3 = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập khu vực của thí sinh(A; B; C; X): ");
		khuVuc = scanner.nextLine();
		System.out.print("Nhập diểm đối tượng:(1; 2; 3; 0) ");
		doiTuongUuTien = scanner.nextLine();
		System.out.print("Nhập điểm chuẩn: ");
		diemChuan = Float.parseFloat(scanner.nextLine());

		float doiTuong = diemUuTienDoiTuong(doiTuongUuTien);
		float diemKhuVuc = diemUuTienKhuVuc(khuVuc);
		float diemUuTien = tinhDiemUuTien(doiTuong, diemKhuVuc);
		float diemTongKet = tinhDiemTongKet(mon1, mon2, mon3, diemUuTien);
		boolean ktDauTotNghiep = kiemTraDuDieuKienDau(mon1, mon2, mon3, diemChuan, diemTongKet);

		if (ktDauTotNghiep == true) {
			System.out.print("Đậu tốt nghiệp! ");
		} else {
			System.out.print("Rớt tốt nghiệp");
		}
	}

	public static float tinhDiemUuTien(float doiTuong, float khuVuc) {
		return doiTuong + khuVuc;
	}

	public static float tinhDiemTongKet(float mon1, float mon2, float mon3, float diemUuTien) {
		return (mon1 + mon2 + mon3 + diemUuTien) / 3;
	}

	public static float diemUuTienKhuVuc(String khuVuc) {
		float diemKhuVuc = 0;
		switch (khuVuc) {
		case "A":
			diemKhuVuc = 2;
			break;
		case "B":
			diemKhuVuc = 1;
			break;
		case "C":
			diemKhuVuc = 0.5f;
			break;
		case "X":
			diemKhuVuc = 0;
			break;
		default:
			System.out.println("Khu vực không hợp lệ!");
			break;
		}
		return diemKhuVuc;
	}

	public static float diemUuTienDoiTuong(String doiTuong) {
		float diemDoiTuong = 0;
		switch (doiTuong) {
		case "1":
			diemDoiTuong = 2.5f;
			break;
		case "2":
			diemDoiTuong = 1.5f;
			break;
		case "3":
			diemDoiTuong = 3;
			break;
		case "0":
			diemDoiTuong = 0;
			break;

		default:
			System.out.println("Khu vực không hợp lệ!");
			break;

		}
		return diemDoiTuong;
	}

	public static boolean kiemTraDuDieuKienDau(float mon1, float mon2, float mon3, float diemChuan, float diemTongKet) {
		// diemTongKet = ((mon1 + mon2 + mon3) / 3) + diemUuTien + diemDoiTuongUuTien;
		boolean dauTotNghiep = false;
		if (mon1 == 0 || mon2 == 0 || mon3 == 0) {
			return dauTotNghiep = false;
		}
		if (diemTongKet >= diemChuan) {
			return dauTotNghiep = true;
		}
		return dauTotNghiep;
	}

	public static boolean thueThuNhapCaNhan(String hoTen, float tongThuNhap, int soNguoiPhuThuoc) {
		return true;
	}
}
