import java.util.Scanner;

public class XepLoaiHocSinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float toan, ly, hoa, diemTB;
		String hoTen = "Long", xeploai;

		Scanner scanner = new Scanner(System.in);

		// Nhập dữ liệu 3 môn
		System.out.print("Nhập điểm Toán: ");
		toan = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập điểm Lý: ");
		ly = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập điểm Hoá: ");
		hoa = Float.parseFloat(scanner.nextLine());

		// Tính trung bình 3 môn
		diemTB = (toan + ly + hoa) / 3;

		if (diemTB >= 8.5) {
			System.out.println();
			xeploai = "GIỎI";
		} else if (diemTB >= 6.5) {
			xeploai = "KHÁ";
		} else if (diemTB >= 5) {
			xeploai = "TRUNG BÌNH";
		} else {
			xeploai = "YẾU";
		}

		System.out.println("Điểm TB = " + String.format("%.2f", diemTB) + " ===> xếp loại " + xeploai);

	}

}
