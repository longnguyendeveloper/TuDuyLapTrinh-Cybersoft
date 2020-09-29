public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String canBo1 = "Nguyễn Văn A", canBo2 = "Nguyễn Thị B", canBo3 = "Nguyễn Văn C";
		String gender1 = "Nam", gender2 = "Nữ", gender3 = "Nam";
		int year1 = 1990, year2 = 1999, year3 = 1996;

		int max = year1;
		// So sánh năm sinh cán bộ 2 và 3 với max để tìm ai trẻ hơn
		if (year2 > max && gender2 == " Nam") {
			max = year2;
			System.out.println(
					"Cán Bộ Có Tuổi Nhỏ Nhất Là " + canBo2 + " Giới Tính Là " + gender2 + " Năm Sinh Là " + year2);
		}
		if (year3 > max && gender3 == "Nam") {
			max = year3;
			System.out.println(
					"Cán Bộ Có Tuổi Nhỏ Nhất Là " + canBo3 + " Giới Tính Là " + gender3 + " Năm Sinh Là " + year3);
		} else {
			System.out.println(
					"Cán Bộ Có Tuổi Nhỏ Nhất Là " + canBo1 + " Giới Tính Là " + gender1 + " Năm Sinh Là " + year1);
		}
	}
}

//Không biết làm trường hợp bằng nhau