import java.util.Scanner;

public class Programme_5 {
    public static void main(String[] args){
        Scanner entree = new Scanner(System.in);
        System.out.println("Veuillez entrer le verbe à conjuguer : ");
        String verbe = entree.nextLine();

        String radical, terminaison;
        terminaison = verbe.substring(verbe.length()-2);
        radical= (String) verbe.subSequence(0,(verbe.length()-2));

        if (terminaison.equalsIgnoreCase("er")){
            System.out.println("Je "+radical+"e");
            System.out.println("Tu "+radical+"es");
            System.out.println("Il/Elle "+radical+"e");
            System.out.println("Nous "+radical+"ons");
            System.out.println("Vous "+radical+"ez");
            System.out.println("Ils/Elles "+radical+"ent");
        } else {
            System.out.println(verbe+"N'est pas reconnu comme un verbe du premier groupe!");
        }
    }
}
