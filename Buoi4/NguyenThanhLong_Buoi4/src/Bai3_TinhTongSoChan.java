import java.util.Scanner;

public class Bai3_TinhTongSoChan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a = 0, tong = 0;
		tinhtong(a, tong);

	}

	private static void tinhtong(float a, float tong) {
		tong = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Nhập số chẵn để tính tổng: ");
			a = Float.parseFloat(scanner.nextLine());
			if (a % 2 == 0) {
				tong += a;
				System.out.println("Tổng =" + tong);
			}
		} while (a != 0);

	}
}
