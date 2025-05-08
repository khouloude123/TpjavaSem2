import java.util.Scanner;

public class  app5 {

    public static String lectureChaine() {
        Scanner scanner = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Entrez une chaîne (max 50 caractères) : ");
            ch = scanner.nextLine();
        } while (ch.length() > 50);
        return ch;
    }

    public static int nbrOccRec(String mot, char car, int index) {
        if (index < 0) return 0;
        if (mot.charAt(index) == car)
            return 1 + nbrOccRec(mot, car, index - 1);
        else
            return nbrOccRec(mot, car, index - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mot = lectureChaine();

        System.out.print("Entrez le caractère à chercher : ");
        char car = scanner.next().charAt(0);

        int nbOcc = nbrOccRec(mot, car, mot.length() - 1);
        System.out.println("Le caractère '" + car + "' apparaît " + nbOcc + " fois.");
    }
}
