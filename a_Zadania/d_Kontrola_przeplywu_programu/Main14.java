
public class Main14 {

    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result11 = i * j;

                System.out.print(i + " x " + j + " = " + result11);
                System.out.print(" ");


                if (j == n) {
                    System.out.println(" ");
                }
            }
        }
    }

}
