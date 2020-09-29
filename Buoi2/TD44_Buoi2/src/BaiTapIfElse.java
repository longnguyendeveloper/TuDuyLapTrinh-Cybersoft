import java.util.Scanner;

public class BaiTapIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Viết chương trình cho người dùng nhập vào 2 số thực
		 * 
		 * In ra màn hình Kết quả số nào lớn hơn.
		 * 
		 * Ví dụ: nhập 2 số 15 và 10 -> kết quả: Số thứ nhất lớn hơn số thứ hai Nhập 2
		 * số 15 và 10 -> kết quả: Số thứ hai lớn hơn số thứ nhất
		 */

		int soThuc1, soThuc2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số thứ nhất: ");
		soThuc1 = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập số thứ 2: ");
		soThuc2 = Integer.parseInt(scanner.nextLine());

		if (soThuc1 > soThuc2) {
			System.out.println("Số thứ nhất lớn hơn số thứ hai");
		} else if (soThuc1 < soThuc2) {
			System.out.println("Số thứ hai lớn hơn số thứ nhất");
		} else {
			System.out.println("Số thứ hai và số thứ nhất BẰNG NHAU");
		}

	}

}
