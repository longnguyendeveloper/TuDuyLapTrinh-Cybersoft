import java.util.Scanner;

public class BaiTapIfElseLongNhau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soLuong;
		float donGia;
		String ten = "Sữa chua";

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số số lượng: ");
		soLuong = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập giá: ");
		donGia = Float.parseFloat(scanner.nextLine());

		if (soLuong > 49 && soLuong <= 100) {
			System.out.println(ten + " x " + soLuong + " --- " + "Đơn hàng này được giảm giá 8%.Tiền phải trả = "
					+ (soLuong * donGia) * 92 / 100);

		} else if (soLuong > 100) {
			System.out.println(ten + " x " + soLuong + " --- " + "Đơn hàng này được giảm giá 12%. Tiền phải trả = "
					+ (soLuong * donGia) * 88 / 100);

		} else {
			System.out.println(ten + " x " + soLuong + " --- " + "Tiền phải trả = " + soLuong * donGia);
		}

	}

}
