import java.util.Scanner;

public class exercice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verb;
        do {
           System.out.println("entrer un verbe");
           verb= scanner.nextLine();
        }while(!verb.endsWith("er"));
         System.out.println("donner un autre verbe");
        System.out.println("je" +verb.replace("er", "e"));
        System.out.println("tu" +verb.replace("er", "es"));
        System.out.println("il" +verb.replace("er", "e"));
        System.out.println("elle" +verb.replace("er", "e"));
        System.out.println("nous" +verb.replace("er", "ons"));
        System.out.println("vous" +verb.replace("er", "ez"));
        System.out.println("ils" +verb.replace("er", "ent"));
        System.out.println("elles" +verb.replace("er", "ent"));






    }}