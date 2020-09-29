package cybersoft.td44;
import java.util.Scanner;

public class XeBus {
	// các thuộc tính
	String maSoKhung;
	String soDangKy;
	String mauXe;
	float soMaLucDinhDanh;
	byte soChoNgoi;
	int tuyenXe;
	String hopTacXa;

	// phương thức khởi tạo (contructor)
	public XeBus() {
		maSoKhung = "chưa đăng ký";
		soDangKy = "chưa đăng ký";
		mauXe = "Xanh lá";
		hopTacXa = "HTX 19/5";
	}

	public XeBus(String soDangKy, byte soChoNgoi) {
		this();
		this.soDangKy = soDangKy;
		this.soChoNgoi = soChoNgoi;

	}

	// các phương thức
	void inThongTin() {
		System.out.println("THÔNG TIN XE BUS: ");
		System.out.println("Mã số khung:\t" + maSoKhung);
		System.out.println("Số đăng ký:\t" + soDangKy);
		System.out.println("Màu xe:\t" + mauXe);
		System.out.println("Số mã lực:\t" + soMaLucDinhDanh);
		System.out.println("Số chỗ ngồi\t" + soChoNgoi);
		System.out.println("Tuyến xe:\t" + tuyenXe);
		System.out.println("Hợp tác xã:\t" + hopTacXa);
	}

	void nhapThongTin(Scanner scanner) {
		System.out.println("NHẬP THÔNG TIN XE BUS:");
		System.out.println("Mã số khung: ");
		maSoKhung = scanner.nextLine();
		System.out.println("số đăng ký: ");
		soDangKy = scanner.nextLine();
		System.out.println("Màu xe: ");
		mauXe = scanner.nextLine();
		System.out.println("Số Mã Lực: ");
		soMaLucDinhDanh = Float.parseFloat(scanner.nextLine());
		System.out.println("Tuyến xe: ");
		tuyenXe = Integer.parseInt(scanner.nextLine());
		System.out.println("Hợp tác xã: ");
		hopTacXa = scanner.nextLine();

	}



}
