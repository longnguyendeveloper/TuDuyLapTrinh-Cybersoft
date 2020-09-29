import java.util.Scanner;

public class Bai6_DoanSo {

	public static void main(String[] args) {
		int a = 0;
		Scanner scanner = new Scanner(System.in);

		int soNgauNhien = (int) (Math.random() * 999 + 1);
		while (true) {
			System.out.print("Mời bạn đoán số: ");
			a++;
			int soNguoiChoiDoan = scanner.nextInt();

			if (soNguoiChoiDoan != soNgauNhien) {
				if (soNguoiChoiDoan > soNgauNhien) {
					System.out.println("Số của bạn: " + soNguoiChoiDoan + " lớn hơn số ngẫu nhiên");
				} else if (soNguoiChoiDoan < soNgauNhien) {
					System.out.println("Số của bạn: " + soNguoiChoiDoan + " bé hơn số ngẫu nhiên");
				}
			} else if (soNguoiChoiDoan == soNgauNhien) {
				System.out.println("Bạn đã đoán đúng");
				System.out.println("Bạn đã mất " + a + " lần để đoán đúng!");
				break;
			}

		}
	}
}