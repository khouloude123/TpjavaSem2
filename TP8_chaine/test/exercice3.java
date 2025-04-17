import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exercice3 {

    public static boolean estInf(String verbe) {
        return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") || verbe.endsWith("oir");
    }

    public static String Groupe(String verbe) {
       
        List<String> troisiemeGroupeIr = Arrays.asList("sortir", "partir", "dormir", "servir", "mentir", "sentir", "venir", "tenir", "courir", "mourir");

        if (verbe.equals("aller")) return "3e groupe";
        if (verbe.endsWith("er")) return "1er groupe";
        if (verbe.endsWith("ir")) {
            if (troisiemeGroupeIr.contains(verbe)) {
                return "3e groupe";
            } else {
                return "2e groupe (si participe présent en -issant)";
            }
        }
        return "3e groupe";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verbe;

        do {
            System.out.print("Entrez un verbe à l'infinitif : ");
            verbe = scanner.nextLine().trim().toLowerCase();
            if (!estInf(verbe)) {
                System.out.println("Ce verbe n'est pas à l'infinitif. Réessayez.");
            }
        } while (!estInf(verbe));

        String groupe = Groupe(verbe);
        System.out.println("Le verbe \"" + verbe + "\" appartient au " + groupe);
    }
}
