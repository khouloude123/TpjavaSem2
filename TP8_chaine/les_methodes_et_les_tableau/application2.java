import java.util.Scanner;

public class application2 {


    public static int lectureN(Scanner sc) {
        int n;
        do {
            System.out.print("Entrez le nombre d'étudiants (n ≥ 10) : ");
            n = sc.nextInt();
        } while (n < 10);
        return n;
    }


    public static double[] RemplirTab(Scanner sc, int n) {
        double[] T = new double[n];
        for (int i = 0; i < n; i++) {
            double note;
            do {
                System.out.print("Entrez la note de l'étudiant " + (i + 1) + " (entre 0 et 20) : ");
                note = sc.nextDouble();
            } while (note < 0 || note > 20);
            T[i] = note;
        }
        return T;
    }

  
    public static double Calcul_Moy(double[] T) {
        double somme = 0;
        for (double note : T) {
            somme += note;
        }
        return somme / T.length;
    }

    public static int NombreNote(double[] T, double moy) {
        int compteur = 0;
        for (double note : T) {
            if (note > moy) {
                compteur++;
            }
        }
        return compteur;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lectureN(sc);
        double[] T = RemplirTab(sc, n);
        double moyenne = Calcul_Moy(T);
        int nbSupMoyenne = NombreNote(T, moyenne);

        System.out.printf("\nLa moyenne de la classe est : %.2f\n", moyenne);
        System.out.println("Nombre de notes supérieures à la moyenne : " + nbSupMoyenne);

        sc.close();
    }
}
