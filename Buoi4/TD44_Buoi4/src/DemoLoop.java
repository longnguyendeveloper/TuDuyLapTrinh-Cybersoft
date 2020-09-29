import java.util.Scanner;

public class DemoLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Demo vòng lặp
		 */

		Scanner scanner = new Scanner(System.in);
		float diemThi = 0;
		int soLanThiRot = 0;

		System.out.print("Nhập điểm thi: ");
		diemThi = Float.parseFloat(scanner.nextLine());

		while (diemThi < 5) {
			System.out.print("Nhập điểm thi: ");
			diemThi = Float.parseFloat(scanner.nextLine());
			soLanThiRot++;

		}
		System.out.print("Số lần thi rớt: " + soLanThiRot);

	}

}
