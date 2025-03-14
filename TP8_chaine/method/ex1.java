import java.util.Scanner;

public class ex1 {
    
  
     public static void main(String[] args) {
        int[] entiers = new int[10];

        // lecture des entiers
        System.out.println("Entrez 10 entiers :");
        for(int i = 0; i < 10; i++) {
            entiers[i] = method.lectureN();
        }

        // affichage des entiers pairs
        System.out.println("Les entiers pairs sont :");
        for(int n : entiers) {
            if(method.EstPair(n)) {
                System.out.println(n + " ");
            }
        }
    }

}