import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sinhVien1 = "A", sinhVien2 = "B", sinhVien3 = "C";
		float toaDo1 = 10, toaDo2 = 20, toaDo3 = 5, toaDoTruong = 10;
		float max = Math.abs(toaDoTruong - toaDo1);

		// So sánh năm sinh cán bộ 2 và 3 với max để tìm ai trẻ hơn
		if (Math.abs(toaDoTruong - toaDo2) > max && Math.abs(toaDoTruong - toaDo2) > Math.abs(toaDoTruong - toaDo3)) {
			max = Math.abs(toaDoTruong - toaDo2);
			System.out.println("Sinh viên xa trường nhất " + sinhVien2);
		} else if (Math.abs(toaDoTruong - toaDo3) > max
				&& Math.abs(toaDoTruong - toaDo3) > Math.abs(toaDoTruong - toaDo1)) {
			Math.abs(max = toaDoTruong - toaDo3);
			System.out.println("Sinh viên xa trường nhất " + sinhVien3);
		} else {
			System.out.println("Sinh viên xa trường nhất " + sinhVien1);
		}
	}
}

// Không biết làm trường hợp bằng nhau