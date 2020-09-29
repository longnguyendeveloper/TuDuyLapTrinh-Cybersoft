import java.util.Scanner;

public class BaiTapMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int soPhanTu;
		int mangInt[];

		System.out.print("Số phần tử trong mảng: ");
		soPhanTu = Integer.parseInt(scanner.nextLine());
		mangInt = new int[soPhanTu];

		/*
		 * Hàm nhập mảng
		 */
		for (int i = 0; i < mangInt.length; i++) {
			System.out.println("mangInt[" + i + "]=");
			mangInt[i] = Integer.parseInt(scanner.nextLine());
		}

		/*
		 * Hàm xuất mảng
		 */
		System.out.println("Mảng đã nhập");
		for (int i = 0; i < mangInt.length; i++) {
			System.out.print(mangInt[i] + " ");
		}

	}

}
