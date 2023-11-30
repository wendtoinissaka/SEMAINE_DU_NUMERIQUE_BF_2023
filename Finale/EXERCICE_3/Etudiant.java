package OUEDRAOGO_Wendtoin_Issaka__SANFO_Nemmata.EXERCICE_3;


import java.util.*;

class Etudiant {
    static List<Etudiant> totalEtudiantDBS = new ArrayList<>();
    static List<Etudiant> totalEtudiantESI = new ArrayList<>();
    static List<Etudiant> totalEtudiant= new ArrayList<>();
    static float noteTotalESI = 0;
    static float noteTotalDBS = 0;
    String nom;
    String prenom;
    String universite;
    int age;
    String sexe;

    float note;
    double [] math = new double[1];

    public Etudiant(String nom, String prenom, String universite, float note, int age, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.universite = universite;
        this.note = note;
        this.sexe = sexe;
        this.age = age;
    }

    public static void enregistrerDBS(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("******** ENREGISTREMENT ETUDIANT DBS ********\n");
        System.out.println("Entrer le nom de l'étudiant : ");
        String nom = scanner.nextLine();
        System.out.println("Entrer le prenom de l'étudiant : ");
        String prenom = scanner.nextLine();
        System.out.println("Entrer la note de l'étudiant : ");
        float note = scanner.nextFloat();
        System.out.println("Entre  l'age : ");
        int age  = scanner.nextInt(); scanner.nextLine();
        System.out.println("Entrer le sexe (M/F) : ");
        String sexe = scanner.nextLine();

        Etudiant etudiantDBS = new Etudiant(nom,prenom,"DBS",note,age,sexe);
        totalEtudiantDBS.add(etudiantDBS);
        totalEtudiant.add(etudiantDBS);
        noteTotalDBS += etudiantDBS.note;

        Exercice_3.accueil();

    }
public static void enregistrerESI(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("******** ENREGISTREMENT ETUDIANT ESI ****** \n");
        System.out.println("Entrer le nom de l'étudiant : ");
        String nom = scanner.nextLine();
        System.out.println("Entrer le prenom de l'étudiant : ");
        String prenom = scanner.nextLine();
        System.out.println("Entrer la note de l'étudiant : ");
        float note = scanner.nextFloat();
        System.out.println("Entre  l'age : ");
        int age  = scanner.nextInt();scanner.nextLine();
        System.out.println("Entrer le sexe (M/F) : ");
        String sexe = scanner.nextLine();

    Etudiant etudiantESI = new Etudiant(nom,prenom,"ESI",note,age,sexe);
        totalEtudiantESI.add(etudiantESI);
        totalEtudiant.add(etudiantESI);
        noteTotalESI += etudiantESI.note;

        Exercice_3.accueil();

    }
    public static void afficherDBS(){


        System.out.println("***** LA LISTE TOTAL DES ETUDIANT DE DBS *******\n");
        for (Etudiant etudiant :
                totalEtudiantDBS) {
            System.out.println("nom : "+etudiant.nom+"; prenom : "+etudiant.prenom+"; note en math :  "+etudiant.note+" sexe :"+etudiant.sexe+" age :"+etudiant.age);
        }
        Exercice_3.accueil();

    }
    public static void afficherESI(){


        System.out.println("***** LA LISTE TOTAL DES ETUDIANT D' ESI *******\n");
        for (Etudiant etudiant :
                totalEtudiantESI) {
            System.out.println("nom : "+etudiant.nom+"; prenom : "+etudiant.prenom+"; note en math :  "+etudiant.note+" sexe :"+etudiant.sexe+" age :"+etudiant.age);
        }
        Exercice_3.accueil();
    }
    public static void accueilModification(){
        System.out.println("***** MODIFICATION DES ETUDIANTS *******\n");
        System.out.println("Vueillez choisir\n1 Modification DBS\n2 Modifictation ESI");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        if (choix==1){
            modificationDBS();
        }else if (choix==2){
            modificationESI();
        }else {
            System.out.println("choisissez uniquement entre 1 ou 2\n");
            accueilModification();
        }
    }



    public static void modificationDBS(){
        System.out.println("***** MODIFICATION DES ETUDIANTS de DBS *******\n");
//        System.out.println("Choisissez le numero de l'etudiant a modifer : ");
        if (!totalEtudiantDBS.isEmpty()){

            Scanner scaner = new Scanner(System.in);
            System.out.println("Entrer le numero de l'étudiant que vous souhaitez modifier les informations : ");
            for (int i = 0; i < Etudiant.totalEtudiantDBS.size(); i++) {
                System.out.println((i+1)+". nom : "+Etudiant.totalEtudiantDBS.get(i).nom+ " prénom : "+Etudiant.totalEtudiantDBS.get(i).prenom+" note : "+totalEtudiantDBS.get(i).note);

            }
            int numero = scaner.nextInt();
            Etudiant etudiantAModifier = totalEtudiantDBS.get(numero-1);
            System.out.println("Choisissez l'information à modifier : \n");
            System.out.println("1. Modification de nom");
            System.out.println("2. Modification de prénom");
            System.out.println("3. Modification de âge");
            System.out.println("4. Modification de sexe");
            System.out.println("5. Modification de note");
            Scanner scanner = new Scanner(System.in);

            int choix = scanner.nextInt();

            switch (choix){
                case 1:
                    System.out.println("Enter le nouveau nom de l'étudiant");
                    scanner.nextLine();
                    String nouveauNom = scanner.nextLine();
                    etudiantAModifier.nom = nouveauNom;
                    break;

                case 2:
                    System.out.println("Enter le nouveau prénom de l'étudiant");
                    scanner.nextLine();

                    String nouveauPrenom = scanner.nextLine();
                    etudiantAModifier.prenom = nouveauPrenom;

                    break;
                case 3:
                    System.out.println("Enter le nouveau âge de l'étudiant");
                    scanner.nextLine();
                    int nouveauAge = scanner.nextInt();

                    etudiantAModifier.age = nouveauAge;

                    break;
                case 4:
                    System.out.println("Enter le nouveau sexe de l'étuadiant");
                    scanner.nextLine();

                    String nouveauSexe = scanner.nextLine();

                    etudiantAModifier.sexe = nouveauSexe;

                    break;
                case 5:
                    System.out.println("Enter le nouveau note de l'étuadiant");
                    scanner.nextLine();

                    int nouveauNote = scanner.nextInt();

                    etudiantAModifier.note = nouveauNote;

                    break;

            }
            Exercice_3.accueil();
        }else {
            System.out.println("ATTENTION! La liste est vide");
            Exercice_3.accueil();
        }

    }

    public static void modificationESI(){
        System.out.println("***** MODIFICATION DES ETUDIANTS de ESI *******\n");


        if (!totalEtudiantESI.isEmpty()){

            Scanner scaner = new Scanner(System.in);
            System.out.println("Entrer le numero de l'étudiant que vous souhaitez modifier les informations : ");
            for (int i = 0; i < Etudiant.totalEtudiantESI.size(); i++) {
                System.out.println((i+1)+". nom : "+Etudiant.totalEtudiantESI.get(i).nom+ " prénom : "+Etudiant.totalEtudiantESI.get(i).prenom+" note : "+totalEtudiantESI.get(i).note);

            }
            int numero = scaner.nextInt();
            Etudiant etudiantAModifier = totalEtudiantESI.get(numero-1);
            System.out.println("Choisissez l'information à modifier : \n");
            System.out.println("1. Modification de nom");
            System.out.println("2. Modification de prénom");
            System.out.println("3. Modification de âge");
            System.out.println("4. Modification de sexe");
            System.out.println("5. Modification de note");
            Scanner scanner = new Scanner(System.in);

            int choix = scanner.nextInt();

            switch (choix){
                case 1:
                    System.out.println("Enter le nouveau nom de l'étudiant");
                    scanner.nextLine();
                    String nouveauNom = scanner.nextLine();
                    etudiantAModifier.nom = nouveauNom;
                    break;

                case 2:
                    System.out.println("Enter le nouveau prénom de l'étudiant");
                    scanner.nextLine();
                    String nouveauPrenom = scanner.nextLine();

                    etudiantAModifier.prenom = nouveauPrenom;

                    break;
                case 3:
                    System.out.println("Enter le nouveau âge de l'étudiant");
                    scanner.nextLine();
                    int nouveauAge = scanner.nextInt();

                    etudiantAModifier.age = nouveauAge;

                    break;
                case 4:
                    System.out.println("Enter le nouveau sexe de l'étuadiant");
                    scanner.nextLine();
                    String nouveauSexe = scanner.nextLine();

                    etudiantAModifier.sexe =  nouveauSexe;

                    break;
                case 5:
                    System.out.println("Enter le nouveau note de l'étuadiant");
                    scanner.nextLine();

                    int nouveauNote = scanner.nextInt();

                    etudiantAModifier.note =nouveauNote;

                    break;



            }
            Exercice_3.accueil();
        }else {
            System.out.println("ATTENTION! La liste est vide");
            Exercice_3.accueil();

        }




    }


    public static void accueilSuppression(){
        System.out.println("***** SUPPRESSION DES ETUDIANTS *******\n");
        System.out.println("Vueillez choisir\n1 Suppression DBS\n2 Suppression ESI");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        if (choix==1){
            supressionDBS();
        }else if (choix==2){
            suppressionESI();
        }else {
            System.out.println("choisissez uniquement entre 1 ou 2\n");
            accueilSuppression();
        }
    }
    public static void supressionDBS(){
        System.out.println("***** SUPPRESSION DES ETUDIANTS DE DBS *******\n");
//        Etudiant.afficherDBS();

        if (!totalEtudiantDBS.isEmpty()){
            Scanner scaner = new Scanner(System.in);
            System.out.println("Entrer le numero de l'étudiant que vous souhaitez supprimer : ");
            for (int i = 0; i < Etudiant.totalEtudiantDBS.size(); i++) {
                System.out.println((i+1)+". nom : "+Etudiant.totalEtudiantDBS.get(i).nom+ " prénom : "+Etudiant.totalEtudiantDBS.get(i).prenom+" note : "+totalEtudiantDBS.get(i).note);

            }
            int numero = scaner.nextInt();
            System.out.println(totalEtudiantDBS.get(numero-1).nom+" "+totalEtudiantDBS.get(numero-1).prenom+" a été supprimé avec succès.");

            totalEtudiantDBS.remove(numero-1);


            Exercice_3.accueil();
        }else {
            System.out.print("ATTENTION! La liste est vide          ");
            Exercice_3.accueil();

        }



    }
    public static void suppressionESI(){
        System.out.println("***** SUPPRESSION DES ETUDIANTS DE L'ESI *******\n");


        if (!totalEtudiantESI.isEmpty()){

            Scanner scaner = new Scanner(System.in);
            System.out.println("Entrer le numero de l'étudiant que vous souhaitez supprimer : ");
            for (int i = 0; i < Etudiant.totalEtudiantESI.size(); i++) {
                System.out.println((i+1)+". nom : "+Etudiant.totalEtudiantESI.get(i).nom+ " prénom : "+Etudiant.totalEtudiantESI.get(i).prenom+" note : "+totalEtudiantESI.get(i).note);

            }
            int numero = scaner.nextInt();
            System.out.println(totalEtudiantESI.get(numero-1).nom+" "+totalEtudiantESI.get(numero-1).prenom+" a été supprimé avec succès.");

            totalEtudiantESI.remove(numero-1);


            Exercice_3.accueil();
        }else {
            System.out.println("ATTENTION! La liste est vide");
            Exercice_3.accueil();

        }


    }




    public static void incrementation1(){
        for (Etudiant etudian :
                totalEtudiant) {
            if (etudian.note<10){
                etudian.note++;
            }
        }
        Exercice_3.accueil();
    }

    public static void incrementationmMoitie(){
        for (Etudiant etudian :
                totalEtudiant) {
            if (etudian.note>= 10 && etudian.note<=15){
                etudian.note +=0.5f;

            }
        }
        Exercice_3.accueil();
    }
    public static void affichageMoyenne(){
        System.out.println("Vueillez choisir\n1 Moyenne Universite DBS\n2 Moyenne Universite ESI");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        if (choix==1){
            affichageMoyenneDBS();
        }else if (choix==2){
            affichageMoyenneESI();
        }else {
            System.out.println("choisissez uniquement entre 1 ou 2\n");
            affichageMoyenne();
        }
        Exercice_3.accueil();
    }
    public static void affichageMoyenneDBS(){
        System.out.println("La moyenne des etudiants de DBS est "+ (Etudiant.noteTotalDBS /Etudiant.totalEtudiantDBS.size()));
    }
    public static void affichageMoyenneESI(){
        System.out.println("La moyenne des etudiants de ESI  est "+ (Etudiant.noteTotalESI /Etudiant.totalEtudiantESI.size()));

    }
    public static void accueilInfoMeilleurMath(){
        System.out.println("======                                                                              ======");
        System.out.println();
        System.out.println("MEILLEUR                         MEILLEUR");
        System.out.println();
        System.out.println("===========                                                                          ======================");
        System.out.println("    ESI                                                                                     DBS SCHOOL");
        System.out.println();
        Etudiant.totalEtudiantDBS.stream().sorted();

        if (!totalEtudiantDBS.isEmpty()){
//            Etudiant meilleurDBS= Etudiant.totalEtudiantDBS.get(totalEtudiantDBS.size()-1);
            Etudiant meilleurDBS = null;
            float meilleurNote = 0f;
            for (Etudiant etudiant :
                    Etudiant.totalEtudiantDBS) {
                if (etudiant.note > meilleurNote){
                    meilleurDBS = etudiant;
                }
            }
            assert meilleurDBS != null;
            System.out.print(meilleurDBS.nom+" "+meilleurDBS.prenom+" "+meilleurDBS.note);
        }else {
            System.out.print("ATTENTION! La liste est vide                           ");
        }
        if (!totalEtudiantESI.isEmpty()){
//            Etudiant meilleurESI= Etudiant.totalEtudiantESI.get(totalEtudiantESI.size()-1);
            Etudiant meilleurESI = null;
            float meilleurNote = 0f;
            for (Etudiant etudiant :
                    Etudiant.totalEtudiantDBS) {
                if (etudiant.note > meilleurNote){
                    meilleurESI = etudiant;
                }
            }
            assert meilleurESI != null;
            System.out.println("                                                    "+meilleurESI.nom+" "+meilleurESI.prenom+" "+meilleurESI.note);
        }else {
            System.out.println("                                       ATTENTION! La liste est vide");
        }

        System.out.println("============================================================================");

        Exercice_3.accueil();

    }


}
