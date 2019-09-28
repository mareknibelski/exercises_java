
public class Main12 {

    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int c = 3;

        if ((a + b > c) || (c + b > a) || (a + c > b)) {
            System.out.println("Z podanych boków mozna zbudować trójkąt");
        } else {
            System.out.println("Z podanych boków nie można zbudować trójkąta");
        }
    }

}
