
public class Main4 {

	public static void main(String[] args) {
        int numbers[] = {2, 5, 9, 10, 14, 18, 20, 25, 27, 30};
        int sumOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " - liczba parzysta");
            } else {
                System.out.println(numbers[i] + " - liczba nieparzysta");
                sumOdd = sumOdd + numbers[i];
            }
        }

        System.out.println("Suma liczb nieparzystych to: " + sumOdd);
	}

}
