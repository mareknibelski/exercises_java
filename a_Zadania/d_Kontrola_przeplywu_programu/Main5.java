
public class Main5 {

	public static void main(String[] args) {
        int resultFor = 0;
        int resultWhile = 0;

        for (int i = 0; i < 10; i++) {
            resultFor += (i + 1);
            System.out.println(resultFor);
        }

        int i = 1;
        while (i <= 10) {
            resultWhile += i++;
            System.out.println(resultWhile);
        }
	}

}
