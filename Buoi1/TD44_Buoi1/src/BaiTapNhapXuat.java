import java.util.Scanner;

public class BaiTapNhapXuat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vui lòng nhập Họ của bạn: ");
		String nhapHo = scanner.nextLine();
		System.out.print("Vui lòng nhập Tên của bạn: ");
		String nhapTen = scanner.nextLine();
		System.out.print("Vui lòng nhập Tuổi của bạn: ");
		String nhapTuoi = scanner.nextLine();
		
		System.out.println("Kết quả: "+nhapHo +" "+ nhapTen + " - " + nhapTuoi +" tuổi");
	}

}
