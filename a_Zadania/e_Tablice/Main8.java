
public class Main8 {

	public static void main(String[] args) {

		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
		double avg = 0;

		for (int i = 0; i < temps.length; i++) {

            double tempCelc = temps[i];
            temps[i] = (tempCelc * 1.8) + 32;
            double tempFahr = temps[i];
            avg = (avg + tempFahr);
        }

		avg = avg / temps.length;
        System.out.println("średnia temperatura to: " + String.format("%.2f", avg));

	}

}
