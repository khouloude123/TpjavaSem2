import java.util.Scanner;

public class application{


    public static int lectureN(Scanner sc) {
        int n;
        do {
            System.out.print("Donner un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    
    public static int[] RemplirTab(int n, Scanner sc) {
        int[] T = new int[n];
        System.out.println("Entrez " + n + " entiers :");
        for (int i = 0; i < n; i++) {
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }
        return T;
    }

   
    public static void Remplacer(int[] T, int X1, int X2) {
        for (int i = 0; i < T.length; i++) {
            if (T[i] == X1) {
                T[i] = X2;
            }
        }
    }

  
    public static void AfficheTab(int[] T) {
        System.out.println("Contenu du tableau :");
        for (int i = 0; i < T.length; i++) {
            System.out.println("T[" + i + "] = " + T[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = lectureN(sc);
        int[] T = RemplirTab(n, sc);

        System.out.print("Entrez l'entier X1 à remplacer : ");
        int X1 = sc.nextInt();

        System.out.print("Entrez l'entier X2 qui va remplacer X1 : ");
        int X2 = sc.nextInt();

        Remplacer(T, X1, X2);
        AfficheTab(T);

        sc.close();
    }
}