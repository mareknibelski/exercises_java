import static java.lang.Math.abs;

public class Main5 {

	public static void main(String[] args) {
        int numbers[] = {-2, 40, -9, 10, -32, 18, -20, 25, -27, 30};
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (abs(numbers[i]) > max) {
                max = abs(numbers[i]);
            }
        }

        System.out.println(max);
	}

}
