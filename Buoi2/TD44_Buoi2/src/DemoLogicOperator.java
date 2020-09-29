
public class DemoLogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Demo Logic Operator
		 */

		// Phủ định
		boolean b1 = true;
		boolean b2 = !b1;
//		System.out.println(b1);
//		System.out.println(b2);

		// And - Và: && ( chỉ ra "true" khi giá trị 2 giá trị bằng "true")
		b1 = true;
		b2 = true;

//		System.out.println(b1 && b2); 

		// Or - Hoặc: || (ra "false" khi cả 2 vế đều "false"
		b1 = false;
		b2 = false;

		System.out.println(b1 || b2);

	}

}
