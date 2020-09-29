import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte so2ChuSo;
		int soChuc, soDV, ketQua;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số có 2 chữ số: ");
		so2ChuSo = Byte.parseByte(scanner.nextLine());
		soDV = so2ChuSo % 10;
		soChuc = so2ChuSo / 10;
		ketQua = soDV + soChuc;

		System.out.println("Tổng 2 ký số vừa nhập = " + ketQua);
	}

}
