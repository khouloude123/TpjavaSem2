import java.util.Scanner;

public class  app4 {

    public static String lectureChaine() {
        Scanner scanner = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Entrez une chaîne (max 30 caractères) : ");
            ch = scanner.nextLine();
        } while (ch.length() > 30);
        return ch;
    }

    public static boolean palindromeRec(String ch, int debut, int fin) {
        if (debut >= fin) return true;
        if (ch.charAt(debut) != ch.charAt(fin)) return false;
        return palindromeRec(ch, debut + 1, fin - 1);
    }

    public static void main(String[] args) {
        String ch = lectureChaine();
        if (palindromeRec(ch, 0, ch.length() - 1)) {
            System.out.println(ch + " est un palindrome.");
        } else {
            System.out.println(ch + " n'est pas un palindrome.");
        }
    }
}
