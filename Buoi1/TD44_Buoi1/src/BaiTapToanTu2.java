import java.util.Scanner;

public class BaiTapToanTu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Viết chương trình cho người dùng nhập vào
		 * điểm 3 môn Toán, Văn, Anh Văn
		 * 
		 * In ra điểm trung bình ba môn học.
		 */

		double diemToan, diemAnhVan, diemVan;
		System.out.print("Vui lòng nhập điểm Toán");

		Scanner scanner = new Scanner(System.in);
		diemToan = Double.parseDouble(scanner.nextLine());

		System.out.print("Vui lòng nhập điểm Anh Văn");
		diemAnhVan = Double.parseDouble(scanner.nextLine());

		System.out.print("Vui lòng nhập điểm Văn");
		diemVan = Double.parseDouble(scanner.nextLine());

		double trungBinh = (diemToan + diemVan + diemAnhVan) / 3;
		System.out.print("Điểm trung bình 3 môn: " + trungBinh);
	}

}
