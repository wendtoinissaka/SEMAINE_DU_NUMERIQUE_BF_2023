package OUEDRAOGO_Wendtoin_Issaka__SANFO_Nemmata;

import java.util.Scanner;

public class Exercice_2 {
    public static void main(String[] args) {
        affichage();

    }
    public static void affichage(){
        System.out.println("Veuillez entrer le nombre de lignes : ");
        Scanner entree = new Scanner(System.in);
        int nombre = entree.nextInt();
        int positionSpace=nombre;
        for (int i = 0; i < nombre+1; i++) {
            for (int j = 0; j < nombre; j++) {
                if (j==positionSpace){
                    System.out.print(" ");
                }
                System.out.print("#");
            }
            System.out.println();
            positionSpace--;
        }

    }
}
