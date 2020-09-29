import java.util.Scanner;

public class Bai1_BaiTapVeMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		// Khai báo biến
		int soPhanTu, luaChon, tong = 0;

		// Nhập số phần tử
		System.out.print("Nhập vào số lượng phần tử của mảng: ");
		soPhanTu = Integer.parseInt(scanner.nextLine());
		int[] mangInt = new int[soPhanTu]; // new để làm gì vì sao ko dùng luôn int mangInt[]

		// Gọi hàm
		nhapMang(mangInt, soPhanTu);
		xuatMang(mangInt, soPhanTu);
		xuatMenu();

		// Lựa chọn menu
		do {
			System.out.print("Mời nhập lựa chọn menu: ");
			luaChon = Integer.parseInt(scanner.nextLine());

			switch (luaChon) {
			case 1:
				tongCacSoDuong(mangInt);
				scanner.nextLine();
				break;
			case 2:
				demBaoNhieuSoDuong(mangInt);
				scanner.nextLine();
				break;
			case 3:
				tinhMin(soPhanTu, mangInt);
				scanner.nextLine();
				break;
			case 4:
				timDuongMin(mangInt);
				scanner.nextLine();
				break;
			case 5:
				timSoChanCuoi(mangInt);
				scanner.nextLine();
				break;
			case 6:
				scanner.nextLine();
				break;
			case 7:
				sapXepTangDan(soPhanTu, mangInt);
				scanner.nextLine();
				break;
			case 8:
				timSoNguyenToDauTien(mangInt);
				scanner.nextLine();
				break;
			case 9:
				scanner.nextLine();
				break;
			case 10:
				scanner.nextLine();
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ!");
				break;
			}
		} while (luaChon != 0);
		System.out.println("Kết thúc chương trình!");
	}

	// Hàm
	private static void xuatMenu() { // done
		// TODO Auto-generated method stub
		System.out.println("_____________________________________________________");
		System.out.println("Menu chức năng: ");
		System.out.println("\t1. Tổng các số dương trong mảng.");
		System.out.println("\t2. Đếm có bao nhiêu số dương trong mảng.");
		System.out.println("\t3. Tìm số nhỏ nhất trong mảng.");
		System.out.println("\t4. Tìm số dương nhỏ nhất trong mảng.");
		System.out.println("\t5. Tìm số chẵn cuối cùng trong mảng. Nếu mảng không có giá trị chẵn thì trả về -1.");
		System.out
				.println("\t6. Đổi chỗ 2 giá trị trong mảng theo vị trí (Cho nhập vào 2 vị trí muốn đổi chỗ giá trị).");
		System.out.println("\t7. Sắp xếp mảng theo thứ tự tăng dần.");
		System.out.println("\t8. Tìm số nguyên tố đầu tiên trong mảng. Nếu mảng không có số nguyên tố thì trả về – 1.");
		System.out.println("\t9. Nhập thêm 1 mảng số thực, tìm xem trong mảng có bao nhiêu số nguyên?");
		System.out.println("\t10. So sánh số lượng số dương và số lượng số âm xem số nào nhiều hơn.");
	}

	private static void nhapMang(int[] mangInt, int soPhanTu) { // done
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < mangInt.length; i++) {
			System.out.print("Số thứ " + (i + 1) + " = ");
			mangInt[i] = Integer.parseInt(scanner.nextLine());
		}
	}

	private static void xuatMang(int[] mangInt, int soPhanTu) { // done
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Mảng đã nhập: ");
		for (int i = 0; i < mangInt.length; i++) {
			System.out.print(mangInt[i] + " ");
		}
		System.out.println("");
		System.out.println("Nhấn 'Enter'để hiện menu!");
		sc.nextLine();
	}

	private static void tongCacSoDuong(int[] mangInt) { // 1. done
		// TODO Auto-generated method stub
		int tong = 0;
		for (int i = 0; i < mangInt.length; i++) {
			if (mangInt[i] > 0) {
				tong += mangInt[i];
			}
		}
		System.out.println("Tổng số dương trong mảng là = " + tong);
	}

	private static void demBaoNhieuSoDuong(int[] mangInt) { // 2. done
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i = 0; i < mangInt.length; i++) {
			if (mangInt[i] > 0) {
				temp++;
			}
		}
		System.out.println("Có " + temp + " số dương trong mảng");

	}

	private static void tinhMin(int soPhanTu, int[] mangInt) { // 3. done
		// TODO Auto-generated method stub
		int min = mangInt[0];
		for (int i = 0; i < mangInt.length; i++) {
			if (mangInt[i] < min) {
				min = mangInt[i];
			}

		}
		System.out.println("Số nhỏ nhất trong mảng là: " + min);
	}

	private static void timDuongMin(int[] mangInt) { // 4. done
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < mangInt.length; i++) {
			if (mangInt[i] > 0 && mangInt[i] < min) {
				min = mangInt[i];
			}
		}
		System.out.println("Số dương nhỏ nhất trong mảng là: " + min);

	}

	private static void timSoChanCuoi(int[] mangInt) { // 5. done
		int viTri = -1;

		for (int i = 0; i < mangInt.length; i++) {
			if (mangInt[i] % 2 == 0) {
				viTri = i;
			}
		}

		if (viTri == -1) {
			System.out.println("Không tìm thấy số dương trong mảng!");
		} else {
			System.out.println("Số dương cuối cùng trong mảng là: " + mangInt[viTri]);
		}
	}

	private static void sapXepTangDan(int soPhanTu, int[] mangInt) { // 7. not complete
		int temp;
		for (int i = 0; i < (soPhanTu - 1); i++) {
			for (int j = 0; j < soPhanTu - i - 1; j++) {
				if (mangInt[j] > mangInt[j + 1]) {
					temp = mangInt[j];
					mangInt[j] = mangInt[j + 1];
					mangInt[j + 1] = temp;
				}
			}
			System.out.println("Kết quả sau khi sắp xếp theo thứ tự tăng dần là: ");
			for (i = 0; i < soPhanTu; i++) {
				System.out.print(mangInt[i] + "\t");
			}
			System.out.println("");

		}

	}

	private static void timSoNguyenToDauTien(int[] mangInt) { // 8.
		int viTri = -1;
		Boolean checkNguyenTo = false;
		int temp;
		while (checkNguyenTo = false) {
			for (int i = 0; i < mangInt.length; i++) {
				if (mangInt[i] % 2 == 0) {
					temp = mangInt[i];
					checkNguyenTo = true;
				}
			}
		}
//		System.out.println("Số nguyên tố đầu tiên là: " + temp);
	}
}
