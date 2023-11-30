import java.util.Random;
import java.util.Scanner;

public class Programme_8 {
    public static void main(String[] args){
         devinette();
    }
    public static void devinette(){
        Random random = new Random();
        int nombre_Aleatoire = random.nextInt(1,101);
        int choix = -1,i=0;
        Scanner entree = new Scanner(System.in);
        while (i !=3 ){
            System.out.println("Entrer un entier compris entre 1 et 100 : ");
            choix = entree.nextInt();
            if (nombre_Aleatoire>choix){
                System.out.println("Oups! le nombre saisi est petit, saisissez un nombre plus grand!");
            } else if (nombre_Aleatoire<choix) {
                System.out.println("Oups! le nombre saisi est grand, saisissez un nombre plus petit!");

            } else if (nombre_Aleatoire==choix) {
                System.out.println("Parfait! Tu l'as déviné!");
            }
            i++;
            if (i==3){
                System.out.println("Le nombre a dévidé était : "+nombre_Aleatoire);
                System.out.println("Bonne chance pour la prochaine fois");
                System.out.println("\nAppuyer sur \"0\"  pour quitter et \"1\" pour effectuer une autre opération :");
                int fin = entree.nextInt();
                if (fin==0){
                    System.exit(0);
                }else {
                    devinette();
                }
            }
        }

    }
}
