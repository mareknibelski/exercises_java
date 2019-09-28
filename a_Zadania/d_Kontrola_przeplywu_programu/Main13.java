
public class Main13 {

    public static void main(String[] args) {
        int points = 100;

        if (points >= 0 && points <= 39) {
            System.out.println("Wynik: ocena niedostateczna");
        } else if (points >= 40 && points <= 54) {
            System.out.println("Wynik: ocena dopuszczająca");
        } else if (points >= 55 && points <= 69) {
            System.out.println("Wynik: ocena dostateczna");
        } else if (points >= 70 && points <= 84) {
            System.out.println("Wynik: ocena dobra");
        } else if (points >= 85 && points <= 98) {
            System.out.println("Wynik: ocena bardzo dobra");
        } else if (points >= 99 && points <= 100) {
            System.out.println("Wynik: ocena celująca");
        } else if (points > 100) {
            System.out.println("Ilość punktów większa niż 100");
        } else {
            System.out.println("Ilość punktów mniejsza niż 0");
        }
    }

}
