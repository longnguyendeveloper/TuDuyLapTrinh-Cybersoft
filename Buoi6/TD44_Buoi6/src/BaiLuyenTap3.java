import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class BaiLuyenTap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n, x, y;
		int[] mangInt;

		System.out.print("Nhập số phần tử: ");
		n = Integer.parseInt(scanner.nextLine());

		mangInt = new int[n];

		mangInt = taoSoNgauNhien(mangInt, -100, 100);
		xuatMang(mangInt);
		int soAmDauTien = duyetSoAm(mangInt);
		if (soAmDauTien == 0) {
			System.out.println("ko có số âm trong mảng");
			return;
		}
	}

	private static int duyetSoAm(int[] mangInt) {
		// TODO Auto-generated method stub
		for (int i = 0; i < mangInt.length; i++) {
			if (mangInt[i] < 0) {
				return mangInt[i];
			}
		}
		return 0;
	}

	private static int[] taoSoNgauNhien(int[] mangInt, int a, int b) {
		for (int i = 0; i < mangInt.length; i++) {
			mangInt[i] = a + (int) (Math.random() * ((b - a) + 1));
		}
		return mangInt;
	}

	private static void xuatMang(int[] mangInt) {
		// xuất mảng
		System.out.print("Mảng đã nhập: ");
		for (int i = 0; i < mangInt.length; i++) {
			System.out.println(mangInt[i] + " ");
		}
	}

}
