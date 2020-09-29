import java.util.Scanner;

public class BaiTapViDu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float soGioLam, luongMotGio, tongLuong;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số giờ làm: ");
		soGioLam = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập số tiền lương 1 giờ: ");
		luongMotGio = Float.parseFloat(scanner.nextLine());

		if (soGioLam > 40) {
			tongLuong = 40 * luongMotGio + (soGioLam - 40) * 1.5f * luongMotGio;
		} else {
			tongLuong = soGioLam * luongMotGio;
		}

		System.out.println("Tổng lương: " + tongLuong);

	}
}
