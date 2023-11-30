import java.util.Scanner;

public class Programme_3 {
    public static void main(String[] args){
        Scanner entree = new Scanner(System.in);
        System.out.println("Entrer un entier : ");
        int nombre = entree.nextInt();
        int factoriel = 1;
        if (nombre==0 || nombre==1){
            System.out.println("Le factoriel de "+nombre+" est : "+factoriel);
        }else {
            for (int i = 1; i <=nombre ; i++) {
                factoriel *=i;
            }
            System.out.println("Le factoriel de "+nombre+" est : "+factoriel);
        }
    }
}
