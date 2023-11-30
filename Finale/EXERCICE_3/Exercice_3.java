//package OUEDRAOGO_Wendtoin_Issaka__SANFO_Nemmata.EXERCICE_3;

import java.util.*;

public class Exercice_3 {
//    public List<Etudiant> totalEtudiantDBS = new ArrayList<>();
    public static void main(String[] args) {

        accueil();

    }

    public static void accueil(){
        System.out.println("\n*******************************Finale du concours <<Mini programme>>*************************\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Enregistrer un étudiant de Digital Business School");
        System.out.println("2.Enregistrer un étudiant de l'Ecole Superieur d'Informatique");
        System.out.println("3.Afficher la liste des étudiants de Digital Bussiness School");
        System.out.println("4.Afficher la liste des étudiants de  l'Ecole Superieur d'Informatique");
        System.out.println("5. Modifier un étudiants d'un établissement donné(DBS School ou ESI");
        System.out.println("6. Supprimer un étudiants d'un établissement donné(DBS School ou ESI");
        System.out.println("7.Incrémenter de 1 point la moyenne des notes des étudiants ayants une note strictement inférieure à 10");
        System.out.println("8.Incrémenter de 0.5 point la moyenne des étudiants ayant une note comprise entre [10 -15]");
        System.out.println("9.Calculer la moyenne de classe en mathématiques des étudiants des deux établissement");
        System.out.println("10.Afficher les informations du meilleur étudiant qui excelle en mathématiques pour les deux établissements");
        System.out.println("11.Quitter");
        System.out.println("\n*******************************MERCI POUR L'ORGANISATION DE CETTE FINALE************************\n");

        int choix  = scanner.nextInt();
        switch (choix){
            case 1 : Etudiant.enregistrerDBS();break;
            case 2 : Etudiant.enregistrerESI();break;
            case 3 : Etudiant.afficherDBS();break;
            case 4 : Etudiant.afficherESI();break;
            case 5 : Etudiant.accueilModification();break;
            case 6 : Etudiant.accueilSuppression();break;
            case 7 : Etudiant.incrementation1();break;
            case 8 : Etudiant.incrementationmMoitie();break;
            case 9 : Etudiant.affichageMoyenne();break;
            case 10 : Etudiant.accueilInfoMeilleurMath();break;
            case 11 : quitter();break;
            default: accueil();
        }



    }


    private static void quitter() {
        System.exit(0);
    }



}
