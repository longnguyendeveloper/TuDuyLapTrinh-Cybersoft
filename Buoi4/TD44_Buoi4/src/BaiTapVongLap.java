import java.util.Scanner;

public class BaiTapVongLap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Tính tổng các số lớn hơn không do người dùng nhập chương trình sẽ dừng khi
		 * nhập vào số âm hoặc không.
		 */

		Scanner scanner = new Scanner(System.in);
		float soNhap = 0, tong = 1;
		System.out.print("Nhập số: ");
		soNhap = Float.parseFloat(scanner.nextLine());

		/*
		 * if (soNhap > 0) { while (soNhap > 0) { System.out.print("Nhập số: "); soNhap
		 * = Float.parseFloat(scanner.nextLine());
		 * 
		 * if (soNhap > 0) { tong += soNhap; }
		 * 
		 * System.out.println("Tổng = " + tong);
		 * 
		 * }
		 * 
		 * }
		 */

		boolean tiepTucChay = false;
		do {
			System.out.print("Nhập số: ");
			soNhap = Float.parseFloat(scanner.nextLine());

			if (soNhap > 0) {
				tong += soNhap;
				tiepTucChay = true;

			} else
				tiepTucChay = false;

		} while (tiepTucChay);

	}

}
