
public class Main11 {

    public static void main(String[] args) {
        int n = 5;
        //pętla niezależna i if
        for (int i = 0; i < n * 2; i++) {
            String row = "";

            for (int j = 0; j < n; j++ ) {
                if ((j > i)) {
                    row = row + String.valueOf(j + 1);
                } else if ((j > i)) {
                    row = row + String.valueOf(n - j);
                } else {
                    row += "*";
                }
            }
            System.out.println(row + "\n");
        }
    }

}
