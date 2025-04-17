import java.util.Scanner;

public class exercice1 {

    public static void main(String[] args) {
        int nombre = lire();
        System.out.println("Nombre de chiffres : " + compter(nombre));
    }

    static int lire() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;

        while (n <= 0) {
            System.out.print("Entrer un entier > 0 : ");
            
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("L'entier doit être strictement positif !");
                }
            } else {
                System.out.println("Ce n'est pas un entier !");
                scanner.next();
            }
        }

        return n;
    }

    static int compter(int n) {
        return String.valueOf(n).length();
    }
}

