import java.util.Scanner;

public class method {
    
    // Méthode pour lire un entier strictement positif
    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entrez un entier strictement positif : ");
            while (!scanner.hasNextInt()) { // Vérifie que l’entrée est bien un entier
                System.out.println("Erreur : Veuillez entrer un entier valide.");
                scanner.next(); // Consomme l’entrée invalide
            }
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Erreur : L'entier doit être strictement positif.");
            }
        } while (n <= 0);

        return n;
    }

    // Méthode pour vérifier si un nombre est pair
    public static boolean EstPair(int n) {
        return n % 2 == 0;
    }
    public static int Compter(int n) {
        return String.valueOf(n).length();
    }

    // Méthode principale
    public static void main(String[] args) {
        int[] entiers = new int[10]; // Tableau pour stocker les 10 entiers

        // Lecture des 10 entiers
        System.out.println("Veuillez entrer 10 entiers strictement positifs :");
        for (int i = 0; i < 10; i++) {
            entiers[i] = lectureN();
        }

        // Affichage des entiers pairs
        System.out.println("\nLes entiers pairs sont : ");
        for (int n : entiers) {
            if (EstPair(n)) {
                System.out.print(n + " ");
            }

        }
        
    

    }
}