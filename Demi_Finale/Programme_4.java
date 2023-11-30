import java.util.Scanner;

public class Programme_4 {
    public static void main(String[] args){
        Scanner entree = new Scanner(System.in);
        System.out.println("Entrer le nombre de ligne  ");
        int nombre = entree.nextInt();
        for (int i = 0; i < nombre; i++) {
            for (int j = 0; j < nombre-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2* i+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
