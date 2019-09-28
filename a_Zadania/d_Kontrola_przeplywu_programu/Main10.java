
public class Main10 {

    public static void main(String[] args) {
        int n = 5;
        //pętla niezależna i if
        for (int i = 0; i < n; i++) {
            String row = "";

            for (int j = 0; j < n; j++ ) {
                if ((j > i)) {
                    row = row + "";
                } else {
                    row += "*";
                }
            }
            System.out.println(row + "\n");
        }
        //pętle zależne
        for (int i = 0; i < n; i++) {
            String row = "";

            for (int j = 0; j < i + 1; j++) {
                row = row + "*";
            }

            System.out.println(row + "\n");
        }
    }

}
