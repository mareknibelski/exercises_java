
public class Main1 {

	public static void main(String[] args) {
		boolean first = true;
		boolean second = false;

		boolean isFirstEqualSecond = first == second;

		System.out.println(isFirstEqualSecond);

		second = !second;

        System.out.println(isFirstEqualSecond);
	}

}
