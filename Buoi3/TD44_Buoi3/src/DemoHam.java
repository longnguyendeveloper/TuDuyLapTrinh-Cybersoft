
public class DemoHam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1, b = 2, c = 3;
		timSoLonNhat(a, b, c);
		
		ktraSoChan(16);
		System.out.println("số chẵn");
	}

	public static void xuatThongTin() {
		System.out.println("Xin chào");
	}

	public static void tinhTong(int soMot, int soHai) {
		System.out.println("Tổng 2 số = " + (soHai + soMot));
	}

	public static float tinhLuong(float soNgayLam, int luongMotNgay) {
		float luong = soNgayLam * luongMotNgay;
		return luong;
	}

	public static void timSoLonNhat(int a, int b, int c) {
		int max = a;
		if (a <= b) {
			max = b;
		}
		if (b <= c) {
			max = c;
		}
		System.out.println("Số lớn nhất = " + max);
	}

	public static void timChanLe(int soInt) {
		if (soInt % 2 == 0) {
			System.out.println(soInt + " là số chẵn");
			return;
		}
		System.out.println(soInt + " là số lẻ");

	}

	public static boolean ktraSoChan(int soInt) {
		if (soInt % 2 == 0) {
			return true;
		}
		return false;

	}
}
