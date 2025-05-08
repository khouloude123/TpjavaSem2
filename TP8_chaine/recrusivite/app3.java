import java.util.Scanner;

public class app3 {

    public static int lectureEntier() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donnez un entier > 0 : ");
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }

    public static boolean estPremierRec(int n, int diviseur) {
        if (diviseur == 1) return true;
        if (n % diviseur == 0) return false;
        return estPremierRec(n, diviseur - 1);
    }

    public static void main(String[] args) {
        int n = lectureEntier();
        System.out.println("Nombres premiers inférieurs à " + n + " :");
        for (int i = 2; i < n; i++) {
            if (estPremierRec(i, i - 1)) {
                System.out.print(i + " ");
            }
        }
    }
}
