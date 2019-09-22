
public class Main8 {

	public static void main(String[] args) {
		int x = 16;
		int y = 15;

		boolean x_y = x < y;

		boolean t = true;
		boolean f = false;

		boolean t_f = t || f;

		boolean last = x_y == t_f;

		System.out.println(x_y);
		System.out.println(t_f);
		System.out.println(last);
	}

}
