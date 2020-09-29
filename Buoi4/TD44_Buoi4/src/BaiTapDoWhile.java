import java.util.Scanner;

public class BaiTapDoWhile {

	/*
	 * Coding style :
	 * 1. clean code: -> ngay hàng, đặt tên biến, hàm, lớp,... 
	 * 2. code flow 
	 * 3. abstract level
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int luaChon = 0, soA, soB;
		boolean tiepTucChay = false;
		System.out.print("Nhập số nguyên thứ nhất: ");
		soA = Integer.parseInt(scanner.nextLine());

		System.out.print("Nhập số nguyên thứ hai: ");
		soB = Integer.parseInt(scanner.nextLine());

		do {
			luaChon = inMenu(scanner);
			tiepTucChay = xuLyMenu(luaChon, soA, soB);
			scanner.nextLine();

		} while (tiepTucChay);

		System.out.println("Kết thúc chương trình");

	}

	public static boolean xuLyMenu(int luaChon, int soA, int soB) {
		boolean tiepTucChay = true;
		switch (luaChon) {
		case 1:
			tinhTong(soA, soB);
			break;
		case 2:
			tinhHieu(soA, soB);
			break;
		case 3:
			tinhNhan(soA, soB);
			break;
		case 4:
			tinhChia(soA, soB);
			break;
		case 0:
			tiepTucChay = false;
			break;

		default:
			System.out.print("Lựa chọn không hợp lệ!");
		}
		return tiepTucChay;

	}

	public static int inMenu(Scanner scanner) {

		System.out.println("Menu: ");
		System.out.println("\t1. Tính tổng ");
		System.out.println("\t2. Tính hiệu ");
		System.out.println("\t3. Tính nhân ");
		System.out.println("\t4. Tính chia ");
		System.out.println("\t0. Thoát");
		System.out.println("Lựa chọn: ");
		int luaChon = Integer.parseInt(scanner.nextLine());
		return luaChon;

	}

	public static int tinhTong(int soA, int soB) {
		int tong = soA + soB;
		System.out.println("Tổng = " + tong);
		return tong;
	}

	private static int tinhHieu(int soA, int soB) {
		int hieu = soA - soB;
		System.out.println("Tổng = " + hieu);
		return hieu;

	}

	private static int tinhNhan(int soA, int soB) {
		int nhan = soA * soB;
		System.out.println("Tổng = " + nhan);
		return nhan;

	}

	private static float tinhChia(int soA, int soB) {
		float chia = soA / soB;
		System.out.println("Tổng = " + chia);
		return chia;

	}

}
