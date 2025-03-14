public class ex2 {
    public static void main(String[] args) {
        // Lecture de l'entier
        int n = method.lectureN();

        // Calcul du nombre de chiffres
        int nombreDeChiffres = method.Compter(n);

        // Affichage du résultat
        System.out.println("Le nombre de chiffres de " + n + " est : " + nombreDeChiffres);
    }
}