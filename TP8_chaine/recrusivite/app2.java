import java.util.Scanner;

public class  app2 {

    public static int lectureEntier() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donnez un entier > 0 : ");
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }

    public static int factorielRec(int n) {
        if (n == 1) return 1;
        return n * factorielRec(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = lectureEntier();
        for (int i = 0; i < nb; i++) {
            System.out.print("Entrez un entier > 0 : ");
            int n = scanner.nextInt();
            System.out.println("Factoriel de " + n + " est : " + factorielRec(n));
        }
    }
}
