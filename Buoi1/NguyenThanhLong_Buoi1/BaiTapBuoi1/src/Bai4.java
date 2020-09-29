import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float chieuDai, chieuRong, dienTich, chuVi;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		chieuDai = Float.parseFloat(scanner.nextLine());
		System.out.print("Nhập chiều rộng: ");
		chieuRong = Float.parseFloat(scanner.nextLine());
		dienTich = chieuDai * chieuRong;
		chuVi = (chieuDai + chieuRong) * 2;
		System.out.println("Diện tích = " + dienTich + "\n" + "Chu vi = " + chuVi);
	}

}
