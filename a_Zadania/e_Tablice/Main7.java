
import java.util.Random;

public class Main7 {

	public static void main(String[] args) {
		Random generator = new Random();
		int sum = 0;

		for (int i = 0; i < 100; i++) {

		    int randNumbers = generator.nextInt(20);

            if (i == 99) {
                System.out.print(randNumbers);
            } else {
                System.out.print(randNumbers + ", ");
            }

            sum = sum + randNumbers;
        }

        System.out.println();
        System.out.println("Suma 100 losowych liczb od 0 do 20 to: " + sum);
	}

}
