import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Đề bài:
		 * 
		 * Tính số lượng sơn cần thiết cho căn phòng:
		 * 
		 * Viết lệnh để tính số sơn cần để sơn lại một căn phòng. Người dùng nhập vào
		 * chiều dài, chiều rộng, chiều cao, số cánh cửa, số cửa sổ và lượng sơn cần để
		 * bao phủ (m2/lít).
		 * 
		 * Yêu cầu: - Tính số sơn cần thiết để sơn tường. - Tính số sơn cần thiết để sơn
		 * trần nhà.
		 */

		float chieuDai, chieuRong, chieuCao, canhCua, cuaSo, luongSonBaoPhu;
		int year1, year2, year3;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài(m2): ");
		chieuDai = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập chiều rộng(m2): ");
		chieuRong = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập chiều cao(m2): ");
		chieuCao = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập số cánh cửa: ");
		canhCua = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập số cửa sổ: ");
		cuaSo = Float.parseFloat(scanner.nextLine());

		float dienTichXungQuanh = 2 * chieuCao * (chieuDai + chieuRong);
		System.out.println("diện tích xung quanh căn phòng = " + dienTichXungQuanh + "m2");
		
		

	}

}
