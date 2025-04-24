import java.util.ArrayList;
import java.util.Scanner;

public class application3 {

    
    public static int lectureN(Scanner scanner) {
        int n;
        do {
            System.out.print("Donner la taille du tableau (n > 0) : ");
            n = scanner.nextInt();
        } while (n <= 0);
        return n;
    }

    
    public static int[] RemplirTAb(int n, Scanner scanner) {
        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            int val;
            do {
                System.out.print("Donner l'élément T[" + i + "] (positif) : ");
                val = scanner.nextInt();
            } while (val <= 0);
            T[i] = val;
        }
        return T;
    }


    public static int[] CréerTpair(int[] T) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int val : T) {
            if (val % 2 == 0) {
                list.add(val);
            }
        }
        return listToArray(list);
    }

    public static int[] CréerTimpair(int[] T) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int val : T) {
            if (val % 2 != 0) {
                list.add(val);
            }
        }
        return listToArray(list);
    }

    
    public static void AfficheTAb(int[] T) {
        System.out.print("Contenu du tableau : ");
        for (int val : T) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    
    public static int[] listToArray(ArrayList<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = lectureN(scanner);
        int[] T = RemplirTAb(n, scanner);
        int[] T_pair = CréerTpair(T);
        int[] T_impair = CréerTimpair(T);

        System.out.println("\nTableau original :");
        AfficheTAb(T);

        System.out.println("Tableau des éléments pairs :");
        AfficheTAb(T_pair);

        System.out.println("Tableau des éléments impairs :");
        AfficheTAb(T_impair);

        scanner.close();
    }
}
