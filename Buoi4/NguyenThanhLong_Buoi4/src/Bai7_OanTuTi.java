import java.util.Scanner;

public class Bai7_OanTuTi {

	public static void main(String[] args) {

		int nguoiChoi;
		int a = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			int mayChoi = (int) (Math.random() * 3 + 1);
			System.out.println("Máy chọn: " + mayChoi);
			System.out.println("\t1. Bao: ");
			System.out.println("\t2. Búa: ");
			System.out.println("\t3. Kéo: ");
			System.out.print("Bạn chọn? ");
			nguoiChoi = scanner.nextInt();

			switch (nguoiChoi) {
			case 1:
				if (mayChoi == 1) {
					System.out.println("Máy chọn: Bao");
					System.out.println("Kết quả: Hoà");
					System.out.println("Thắng " + a + " lần");
					scanner.nextLine();

				} else if (mayChoi == 2) {
					System.out.println("Máy chọn: Búa");
					System.out.println("Kết quả: Thắng!");
					a++;
					System.out.println("Thắng " + a + " lần");
					scanner.nextLine();

				} else if (mayChoi == 3) {
					a--;
					System.out.println("Máy chọn: Kéo");
					System.out.println("Kết quả: Thua");
					System.out.println("Thắng " + a + " lần");
					scanner.nextLine();

				}
				break;
			case 2:
				if (mayChoi == 1) {
					System.out.println("Máy chọn: Bao");
					System.out.println("Kết quả: Thua");
					a--;
					System.out.println("Thắng " + a + " lần");
					scanner.nextLine();

				} else if (mayChoi == 2) {
					System.out.println("Máy chọn: Búa");
					System.out.println("Kết quả: Hoà!");
					System.out.println("Thắng " + a + " lần");
					scanner.nextLine();

				} else if (mayChoi == 3) {
					a++;
					System.out.println("Máy chọn: Kéo");
					System.out.println("Kết quả: Thắng");
					System.out.println("Thắng " + a + " lần");
					scanner.nextLine();

				}
				break;
			case 3:
				if (mayChoi == 1) {
					System.out.println("Máy chọn: Bao");
					System.out.println("Kết quả: Thắng");
					a++;
					System.out.println("Thắng " + a + " lần");
					scanner.nextLine();

				} else if (mayChoi == 2) {
					System.out.println("Máy chọn: Búa");
					System.out.println("Kết quả: Thua!");
					a--;
					System.out.println("Thắng " + a + " lần");
					scanner.nextLine();

				} else if (mayChoi == 3) {
					System.out.println("Máy chọn: Kéo");
					System.out.println("Kết quả: Hoà");
					System.out.println("Thắng " + a + " lần");
					scanner.nextLine();
				}
				break;

			default:
				System.out.print("Lỗi!");
				break;
			}
		} while (nguoiChoi != 0);
		System.out.println("Thắng " + a + " lần");

	}

}
