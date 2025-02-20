import java.util.Scanner;
 public class  exercice2 {}
     public static void main(String[]args){
    
     Scanner sc =new Scanner(System.in);
      int nl,nc;
       int[][] M=new
        int [30][30] 
       while(nl>30 || nl<0)
       { System.out.println("donner un entier");
        nl=sc.nextInt(); }
         while(nc>30 || nl<0)
         { System.out.println("donner un entier"); 
         nc=sc.nextInt(); } 
         for ( i = 0; i < nl; i++) 
         { for ( j = 0; j < nc; j++) 
         { System.out.println(x:"M["+i+","+j+"]=");
          M[i][j] =sc.nextInt(); } } 
          for ( i = 0; i < nl; i++) 
          { for ( j = 0; j < nc; j++) 
          { s=s+M[i][j]; p=p*M[i][j]; } 
          } System.out.println(s+"la somme ");
           System.out.println(p+"le produit"); }
Boîte de réception