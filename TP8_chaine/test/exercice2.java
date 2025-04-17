import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, res = 0;
        char op;
        boolean valide = false;

        while (!valide) {
            System.out.print("Entrez un nombre : ");
            a = sc.nextDouble();
            System.out.print("Entrez un autre nombre : ");
            b = sc.nextDouble();
            System.out.print("Choisissez une opération (+, -, *, /) : ");
            op = sc.next().charAt(0);

            switch (op) {
                case '+':
                    res = a + b;
                    valide = true;
                    break;
                case '-':
                    res = a - b;
                    valide = true;
                    break;
                case '*':
                    res = a * b;
                    valide = true;
                    break;
                case '/':
                    if (b != 0) {
                        res = a / b;
                        valide = true;
                    } else {
                        System.out.println("Erreur : division par zéro ! Veuillez réessayer.\n");
                    }
                    break;
                default:
                    System.out.println("Erreur : opération non reconnue ! Veuillez entrer +, -, * ou /.\n");
            }
        }

        System.out.println("Opération réussie  Le résultat est : " + res);
    }
}
