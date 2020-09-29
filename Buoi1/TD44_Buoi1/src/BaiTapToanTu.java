import java.util.Scanner;

public class BaiTapToanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Viết chương trình cho người dùng nhập vào 3 số tự nhiên.
		 * 
		 * In ra màn hình tổng 3 số vừa nhập. int soInt =
		 * Integer.parseInt(scanner.nextLine());
		 */

		/*
		 * Bài giải của tôi 
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("Vui lòng nhập số thứ 1: ");
		 * 
		 * int soMot1 = Integer.parseInt(scanner.nextLine());
		 * System.out.print("Vui lòng nhập số thứ 2: ");
		 * 
		 * int soHai2 = Integer.parseInt(scanner.nextLine());
		 * System.out.print("Vui lòng nhập số thứ 3: ");
		 * 
		 * int soBa3 = Integer.parseInt(scanner.nextLine());
		 *
		 * int tong = soMot1 + soHai2 + soBa3;
		 * 
		 * System.out.println("Tổng 3 số vừa nhập = " + tong);
		 */

		// Bài sửa của thầy
		Scanner scanner = new Scanner(System.in);
		int so1, so2, so3;

		System.out.print("Số thứ nhất: ");
		so1 = Integer.parseInt(scanner.nextLine());
		System.out.print("Số thứ hai: ");
		so2 = Integer.parseInt(scanner.nextLine());
		System.out.print("Số thứ ba: ");
		so3 = Integer.parseInt(scanner.nextLine());

		int tong = so1 + so2 + so3;
		System.out.println("Tổng 3 số vừa nhập: " + tong);

	}

}
