public class exercice1{
//Convertir qui permet de convertir une chaine de caractére (string) en réél (double)
    public static double Convertir(String s) {
        return Double.parseDouble(s);
    }            


     // Méthode pour afficher le tableau deux demensions
    public static void affiche(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
     
}
    } 
    
}

    
