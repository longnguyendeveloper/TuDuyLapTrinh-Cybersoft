import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class BaiTapInMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Viết chương trình in menu như sau: Menu: 1. Chức năng 1 2. Chức năng 2 3.
		 * Chức năng 3 4. Chức năng 4 0. Thoát Lựa chọn:
		 *
		 * Cho phép người dùng nhập lựa chọn là chức năng muốn thực hiện.
		 * 
		 * Nếu lựa chọn không nằm trong menu thì in ra thông báo
		 * "Lựa chọn không hợp lệ."
		 *
		 * Thực hiện các chức năng tương ứng theo theo lựa chọn của người dùng
		 */
		String luaChon;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu:");
		System.out.println("\t1. Chức năng 1");
		System.out.println("\t2. Chức năng 2");
		System.out.println("\t3. Chức năng 3");
		System.out.println("\t4. Chức năng 4");
		System.out.println("\t0. Thoát");

		System.out.println("-------------------------------------------------");
		System.out.println("Vui lòng nhập lựa chọn:");
		luaChon = scanner.nextLine();

		switch (luaChon) {
			case "1":
				System.out.println("Chức năng 1 được thực hiện");
				break;
			case "2":
				System.out.println("Chức năng 2 được thực hiện");
				break;
			case "3":
				System.out.println("Chức năng 3 được thực hiện");
				break;
			case "4":
				System.out.println("Chức năng 4 được thực hiện");
				break;
			case "0":
				System.out.println("Thoát đã thực hiện");
				break;
	
		default:
			System.out.println("Lựa chọn không hợp lệ!");
		}

	}

}
