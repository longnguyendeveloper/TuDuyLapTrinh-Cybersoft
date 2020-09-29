import java.util.Scanner;

public class Bai3_TinhTienDien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float soDien = 0, tienDien = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện: ");
		soDien = Float.parseFloat(scanner.nextLine());
		float soTienDien = tinhTienDien(soDien, tienDien);
		System.out.println("Tiền điện là " + soTienDien);

	}

	public static float tinhTienDien(float soDien, float tienDien) {
		if (soDien <= 50) {
			tienDien = soDien * 500;
		} else if (soDien <= 100) {
			tienDien = 25000 + (100 - soDien) * 650;
		} else if (soDien <= 150) {
			tienDien = 57500 + (150 - soDien) * 1100;
		} else if (soDien > 150) {
			tienDien = 115000 + (soDien - 150) * 1300;
		}

		return tienDien;

	}

}
