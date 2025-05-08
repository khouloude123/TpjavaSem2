import java.util.Scanner;

public class app1 {

    public static int lectureEntier() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donnez un entier > 0 : ");
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }

    public static int sommeRec(int n) {
        if (n == 1) return 1;
        return n + sommeRec(n - 1);
    }

    public static void main(String[] args) {
        int n = lectureEntier();
        System.out.println("La somme de 1 à " + n + " est : " + sommeRec(n));
    }
}
