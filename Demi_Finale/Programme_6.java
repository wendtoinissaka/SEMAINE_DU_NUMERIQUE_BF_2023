import java.util.Scanner;

public class Programme_6 {
    public static void main(String[] args){

        Scanner entree = new Scanner(System.in);
        System.out.println("Entrer la valeur de a : ");
        float a = entree.nextFloat();
        System.out.println("Entrer la valeur de b : ");
        float b = entree.nextFloat();
        System.out.println("Entrer la valeur de c : ");
        float c = entree.nextFloat();


        if (a==0){
            if (b==0){
                System.out.println("Pas de solution!");
            }else {
                System.out.println("Equation du premier dégré, une solution : "+(-c/b));
            }
        }else {
            float delta = (b*b) - 4*a*c, x1,x2;
            System.out.println("Le discriminant est : "+delta);
            if (delta==0){
                x1 = -b/(2*a);
                System.out.println("Racine double! : "+x1);
            } else if (delta > 0) {
                x1 = (float) ((-b - Math.sqrt(delta))/(2*a));
                System.out.println("Racine 1 ! : "+x1);
                x2 = (float) ((-b + Math.sqrt(delta))/(2*a));
                System.out.println("Racine 2 ! : "+x2);

            }else if (delta<0){
                System.out.println("La solution est un nombre complexe !!!");
                delta = -delta;
                x1 = (float) ((-b - Math.sqrt(delta))/(2*a));
                System.out.println("Racine 1 ! : "+x1+"i");
                x2 = (float) ((-b + Math.sqrt(delta))/(2*a));
                System.out.println("Racine 2 ! : "+x2+"i");

            }
        }
    }
}
