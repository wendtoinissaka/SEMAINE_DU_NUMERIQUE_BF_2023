import java.util.Scanner;

public class Programme_7 {
    public static void main(String[] args){
        calculette();

    }
    public static void calculette(){
        int fin = -1;
        Scanner entree = new Scanner(System.in);
        do {
            System.out.println("Entrer l'opération a éffectué : ");
            String saisiUtilisateur = entree.nextLine();
            if( saisiUtilisateur.contains("-")){
                String index = String.valueOf(saisiUtilisateur.indexOf("-"));
                int nombre1 = Integer.parseInt(saisiUtilisateur.substring(0,Integer.parseInt(index)));
                int nombre2 = Integer.parseInt(saisiUtilisateur.substring((Integer.parseInt(index)+1),saisiUtilisateur.length()));
                System.out.println("Le resultat de "+saisiUtilisateur+" = "+(nombre1-nombre2));
            }else if (saisiUtilisateur.contains("+")){
                String index = String.valueOf(saisiUtilisateur.indexOf("+"));
                int nombre1 = Integer.parseInt(saisiUtilisateur.substring(0,Integer.parseInt(index)));
                int nombre2 = Integer.parseInt(saisiUtilisateur.substring((Integer.parseInt(index)+1),saisiUtilisateur.length()));
                System.out.println("Le resultat de "+saisiUtilisateur+" = "+(nombre1+nombre2));
            }
            else if (saisiUtilisateur.contains("*")){
                String index = String.valueOf(saisiUtilisateur.indexOf("*"));
                int nombre1 = Integer.parseInt(saisiUtilisateur.substring(0,Integer.parseInt(index)));
                int nombre2 = Integer.parseInt(saisiUtilisateur.substring((Integer.parseInt(index)+1),saisiUtilisateur.length()));
                System.out.println("Le resultat de "+saisiUtilisateur+" = "+(nombre1*nombre2));
            }
            else if (saisiUtilisateur.contains("/")){
                String index = String.valueOf(saisiUtilisateur.indexOf("/"));
                int nombre1 = Integer.parseInt(saisiUtilisateur.substring(0,Integer.parseInt(index)));
                int nombre2 = Integer.parseInt(saisiUtilisateur.substring((Integer.parseInt(index)+1),saisiUtilisateur.length()));
                System.out.println("Le resultat de "+saisiUtilisateur+" = "+(nombre1/nombre2));
            }
            else if (saisiUtilisateur.contains("%")){
                String index = String.valueOf(saisiUtilisateur.indexOf("%"));
                int nombre1 = Integer.parseInt(saisiUtilisateur.substring(0,Integer.parseInt(index)));
                int nombre2 = Integer.parseInt(saisiUtilisateur.substring((Integer.parseInt(index)+1),saisiUtilisateur.length()));
                System.out.println("Le resultat de "+saisiUtilisateur+" = "+(nombre1%nombre2));
            }else {
                System.out.println("L'opérateur n'est pas réconnu!!!!");
            }



        }while (fin !=-1);
        System.out.println("Appuyer sur \"0\"  pour quitter et \"1\" pour effectuer une autre opération :");
        fin = entree.nextInt();
        if (fin==0){
            System.exit(0);
        }else {
            calculette();
        }

        }
}
