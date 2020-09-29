import java.util.Scanner;

public class Bai5_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int luaChon;
		System.out.print("Nhập số a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập số b: ");
		int b = scanner.nextInt();
		do {
			int tong = 0, hieu = 0, tich = 0, thuong = 0;
			System.out.println("---------MENU---------");
			System.out.println("\t1. Tính tổng");
			System.out.println("\t2. Tính hiệu");
			System.out.println("\t3. Tính thương");
			System.out.println("\t4. Tính tích");
			System.out.print("Nhập lựa chọn: ");
			luaChon = scanner.nextInt();
			switch (luaChon) {
			case 1:
				tong = a + b;
				System.out.println("Tổng= " + tong);
				scanner.nextLine();

				break;
			case 2:
				hieu = a - b;
				System.out.println("Hiệu= " + hieu);
				scanner.nextLine();

				break;
			case 4:
				tich = a * b;
				System.out.println("Tích= " + tich);
				scanner.nextLine();

				break;
			case 3:
				thuong = a / b;
				System.out.println("Thương= " + thuong);
				scanner.nextLine();

				break;
			case 0:
				break;
			default:
				System.out.print("Không hợp lệ");
				break;
			}
		} while (luaChon != 0);
		System.out.println("Dừng chương trình");
	}

}
