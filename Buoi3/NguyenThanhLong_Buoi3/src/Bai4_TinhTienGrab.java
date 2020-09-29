import java.util.Scanner;

public class Bai4_TinhTienGrab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int loaiXe, thoiGianCho;
		float soKm;

		System.out.println("Danh sách xe: ");
		System.out.println("\t1. Grab Car");
		System.out.println("\t2. Grab Suv");
		System.out.println("\t3. Grab Black");
		System.out.print("Loại xe: ");

		loaiXe = Integer.parseInt(scanner.nextLine());

		System.out.print("Số KM đã đi đủ: ");
		soKm = Integer.parseInt(scanner.nextLine());

		System.out.print("Thời gian chờ: ");
		thoiGianCho = Integer.parseInt(scanner.nextLine());

		/*
		 * Phần xử lý Tính tiền
		 */

		tongTien = tinhTienXeGrab(loaiXe, soKm, thoiGianCho);

		switch (loaiXe) {
		case 1:

			break;

		case 2:
			break;

		case 3:
			break;

		default:
			break;
		}

	}

	private static float tinhTienXeGrab(int loaiXe, float soKm, int thoiGianCho) {
		// TODO Auto-generated method stub

		float tongTien, soTienKm1Den19, soTienKmTren19;

		switch (loaiXe) {
		case 1: // grab car
			if (soKm <= 1) {
				tongTien = 8000;
			} else if (soKm < 1 && soKm < 19) {
				soTienKm1Den19 = (soKm - 1) * 7500;
				tongTien = soTienKm1Den19 * 8000;
			}

			break;
		case 2: // grab suv
			if (soKm > 1 && soKm < 19) {
				tongTien = 8000 + (soKm - 1) * 7500;

			} else {
				tongTien = 8000 + 7500 * 17 + (soKm - 18) * 7000;
			}
			tongTien += thoiGianCho / 3 * 2000;

			break;
		case 3: // grab black

			break;

		default:
			break;
		}
		return null;
	}

}
