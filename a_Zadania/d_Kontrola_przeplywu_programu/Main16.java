
public class Main16 {

    public static void main(String[] args) {
        int a = 420;
        int b = 168;
        System.out.println("Dla liczb " + a + " i " + b + " to: " + gdc(a, b));
    }

    public static int gdc(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
