import java.util.Scanner;

public class Programme_2 {
    public static void main(String[] args){
        Scanner entree = new Scanner(System.in);
        System.out.println("Entrer un entier : ");
        int nombre = entree.nextInt();
        if(nombre%2==0){
            System.out.println("Le nombre "+nombre+" est pair.");
        }else {
            System.out.println("Le nombre "+nombre+" est impair.");

        }
    }
}
