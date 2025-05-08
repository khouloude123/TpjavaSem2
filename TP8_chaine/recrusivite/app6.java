import java.util.Scanner;

public class app6{

    public static int lectureEntier() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donnez la taille du tableau (> 0) : ");
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }

    public static int[] remplirTab(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = scanner.nextInt();
        }
        return tab;
    }

    public static int sommeTabRec(int[] tab, int index) {
        if (index < 0) return 0;
        return tab[index] + sommeTabRec(tab, index - 1);
    }

    public static void main(String[] args) {
        int n = lectureEntier();
        int[] tableau = remplirTab(n);
        int somme = sommeTabRec(tableau, n - 1);
        System.out.println("La somme des éléments du tableau est : " + somme);
    }
}
