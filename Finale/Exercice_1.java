package OUEDRAOGO_Wendtoin_Issaka__SANFO_Nemmata;

import java.util.Scanner;

public class Exercice_1 {
    public static void main(String[] args) {
        System.out.println("Veuillez entrer le nombre de lignes : ");
        Scanner entree = new Scanner(System.in);
        int nombre = entree.nextInt();

        for (int i = 0; i < nombre; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(coefficientBinomial(i, j) + " ");
            }
            System.out.println();
        }
    }

    private static int coefficientBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return coefficientBinomial(n - 1, k - 1) + coefficientBinomial(n - 1, k);
        }
    }
}