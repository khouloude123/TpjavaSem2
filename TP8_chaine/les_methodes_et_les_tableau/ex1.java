public class ex1{

    public static double somme(double[] tab) {
        double total = 0;
        for (double val : tab) {
            total += val;
        }
        return total;
    }

    
    public static void incremente(double[] tab, double valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] += valeur;
        }
    }

    public static void afficher(double[] tab) {
        for (double val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] tableau = {1.5, 2.0, 3.5, 4.0};

        System.out.print("Tableau initial : ");
        afficher(tableau);

        System.out.println("Somme : " + somme(tableau));

        incremente(tableau, 2.0);
        System.out.print("Après incrémentation de 2.0 : ");
        afficher(tableau);
    }
}