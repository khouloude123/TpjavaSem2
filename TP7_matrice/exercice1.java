import java.util.Scanner;

public class exercice1 {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
       

        
        int nl, nc,i,j,x;
        booleen=trouve;
        do {
            System.out.print("Entrez le nombre de lignes (nl < 50) : ");
            nl = sc.nextInt();
        } while (nl <= 0 || nl >= 50);

        do {
            System.out.print("Entrez le nombre de colonnes (nc < 50) : ");
            nc = sc.nextInt();
        } while (nc <= 0 || nc >= 50);

        int[][] M = new int[nl][nc];
    
        System.out.println("Remplissez la matrice avec des entiers pairs") ;
        for (i=0;i<nl;i++){
            for (j=0;j<nc;j++){
                do{
                    System.out.println("M["+i+","+j+"]=");
                    M[i][j]=sc.nextInt();

                }while (M[i][j]%2!=0);

            }




        }
        do { 
            System.out.println("donner x");
            x=sc.nextInt();
        } while (x%2!=0);
        trouve=false;
        for (i=0;i<nl;i++){
            if (M[i][j]==x){
                System.out.println("x trouve a la position ("+i+","+j+")");
                trouve=true;
            }

        }
       
        if (! trouve){
            System.out.println("x n'est pas dans le matrice");

        }
        sc.close();
 }
}