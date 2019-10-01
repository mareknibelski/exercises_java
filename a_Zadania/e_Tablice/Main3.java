
public class Main3 {

	public static void main(String[] args) {
        int numbers[] = {2, 5, 9, 10, 14, 18, 20, 25, 27, 30};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Suma elementów tablicy to: " + sum);
	}

}
