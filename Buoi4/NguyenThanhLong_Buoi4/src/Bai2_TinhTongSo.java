import java.util.Scanner;

public class Bai2_TinhTongSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a = 0, tong = 0;
		tinhtong(a, tong);

	}

	private static void tinhtong(float a, float tong) {
		tong = 0;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập một số bất kỳ để tính tổng: ");
			a = Float.parseFloat(scanner.nextLine());
			tong += a;
			System.out.println("Tổng =" + tong);
		} while (a != 0);
	}

}
