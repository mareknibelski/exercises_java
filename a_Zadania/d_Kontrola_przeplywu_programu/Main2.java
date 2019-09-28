
public class Main2 {

	public static void main(String[] args) {

	    int nr1 = 3;
	    int nr2 = 8;
	    int nr3 = 6;

	    if ((nr1 > nr2) && (nr1 > nr3)) {
            System.out.println("Największa z liczb 3, 8, 6 to " + nr1);
        } else if ((nr2 > nr1) && (nr2 > nr3)) {
            System.out.println("Największa z liczb 3, 8, 6 to " + nr2);
        } else {
            System.out.println("Największa z liczb 3, 8, 6 to " + nr3);
        }
	}

}
