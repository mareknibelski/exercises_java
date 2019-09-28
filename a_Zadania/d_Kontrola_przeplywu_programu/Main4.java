
public class Main4 {

	public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 100) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }

        int i = 1;
        while (i <= 100) {
            if (i == 100) {
                System.out.print(i);
                i++;
            } else {
                System.out.print(i + ", ");
                i++;
            }
        }
	}

}
