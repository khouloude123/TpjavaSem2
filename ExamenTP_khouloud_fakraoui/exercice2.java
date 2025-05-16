import java.util.Scanner;
public class exercice2{
    
    public static void main(String[][] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        String ch;
    int [][] tab={{1,2},{3,4},};
    String [][]a={{"tozeur","tunis","djerba","sfax"}};

 
    for (int i = 0; i<tab.length; i++) {
        for (int j=0 ; j<tab.length;j++){
            System.out.println("["+i+"]["+j+"]");
            tab[i][j]=sc.nextInt();
        

                   }

    }
        String Vdest;
        System.out.println(" entrez la premier lettre de la ville de destination");
        Vdest=Vdest.charAt(0);
        System.out.println("vols correspond :");
        Vdest=sc.nextLine();
        prix=0;
        for (int i = 0; i<tab.length; i++){
            prix =prix*0.8;
        }for (int j=0 ; j<tab.length;j++){
            System.out.println("numVol1","vdep","Vdest","codeAv","ClassAv");
            Vdest=sc.nextLine();

    }
      
      
    public static void AfficheTAb(String[] tab) {
        System.out.print("Contenu du tableau : ");
        for (int val : T)
            System.out.print(val + " ");
        
        System.out.println();
    }
    }}