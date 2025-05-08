public class ex2 {
    private double[] composantes;

    public Vecteur(double[] composantes) {
        this.composantes = composantes;
    }

    // Produit scalaire (non statique)
    public double prod_scal(Vecteur autre) {
        if (this.composantes.length != autre.composantes.length) {
            return 0;
        }
        double produit = 0;
        for (int i = 0; i < this.composantes.length; i++) {
            produit += this.composantes[i] * autre.composantes[i];
        }
        return produit;
    }

    // Produit élément par élément (statique)
    public static Vecteur produit(Vecteur v1, Vecteur v2) {
        if (v1.composantes.length != v2.composantes.length) {
            return null;
        }
        double[] resultat = new double[v1.composantes.length];
        for (int i = 0; i < resultat.length; i++) {
            resultat[i] = v1.composantes[i] * v2.composantes[i];
        }
        return new Vecteur(resultat);
    }

    // Somme élément par élément (statique)
    public static Vecteur somme(Vecteur v1, Vecteur v2) {
        if (v1.composantes.length != v2.composantes.length) {
            return null;
        }
        double[] resultat = new double[v1.composantes.length];
        for (int i = 0; i < resultat.length; i++) {
            resultat[i] = v1.composantes[i] + v2.composantes[i];
        }
        return new Vecteur(resultat);
    }

    // Affichage des composantes
    public void afficher() {
        for (double val : composantes) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Programme d'essai
    public static void main(String[] args) {
        double[] tab1 = {1.0, 2.0, 3.0};
        double[] tab2 = {4.0, 5.0, 6.0};

        Vecteur v1 = new Vecteur(tab1);
        Vecteur v2 = new Vecteur(tab2);

        System.out.print("Vecteur 1 : ");
        v1.afficher();

        System.out.print("Vecteur 2 : ");
        v2.afficher();

        System.out.println("Produit scalaire : " + v1.prod_scal(v2));

        Vecteur prod = Vecteur.produit(v1, v2);
        System.out.print("Produit élément par élément : ");
        if (prod != null) prod.afficher();

        Vecteur som = Vecteur.somme(v1, v2);
        System.out.print("Somme : ");
        if (som != null) som.afficher();
    }
}
