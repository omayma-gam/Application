import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static ArrayList <Personne> table=new ArrayList<>();


    public static void ajouterunutilisateur(){
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer l'ID: ");
        String id = input.nextLine();
        System.out.print("Entrer le nom:");
        String nom = input.nextLine();
        System.out.print("Entrer le prenom:");
        String prenom = input.nextLine();
        System.out.print("Entrer l'age: ");
        int age = input.nextInt();
        System.out.print("Entrer votre email :");
        String email = input.next();
        System.out.print("Entrer le mot de passe :");
        String motdepasse = input.next();
        System.out.print("Entrer le Role :\n1.Administrateur \n 2.Client \n 3.Employé\n");
        String s = input.next();
        Role role = new Role(s);

        table.add(new Utilisateur(id, nom, prenom, age, email, motdepasse,role));
    }


       public static void rechercherunutilisateur(){
        Scanner input = new Scanner (System.in);
        System.out.print("Entrer l'ID:");
        String id = input.nextLine();
        boolean trouve = false;


        for (Personne personne : table){
            if(personne.getId().equals(id)){
                System.out.println("les informations de personne est :"+personne);
                trouve = true ;
            }
        }
        if (!trouve){
            System.out.println("Aucun personne!!");
        }

    }


    public static void modifierunutilisateur(){
        Scanner input = new Scanner (System.in);
        System.out.println("Entrer l'ID a modifier : ");
        String id = input.nextLine();
        boolean trouve = false;

        for (Personne personne : table){
            if(personne.getId().equals(id)){
                System.out.println("Personne trouvé "+personne);

                System.out.print("Entrer le nouveau ID :");
                String nouveauid=input.nextLine();
                personne.setId(nouveauid);

                System.out.print("Entrer le nouveau Nom :");
                String nouveaunom =input.nextLine();
                personne.setId(nouveaunom);

                System.out.print("Entrer le nouveau Prenom :");
                String nouveauprenom=input.nextLine();
                personne.setId(nouveauprenom);

                System.out.print("Entrer le nouveau Age :");
                String nouveauage =input.nextLine();
                personne.setId(nouveauage);

                System.out.print("Entrer le nouveau Email :");
                String nouveauemail =input.nextLine();
                personne.setId(nouveauemail);

                System.out.print("Entrer le nouveau Mot de passe :");
                String nouveauemotdepasse =input.nextLine();
                personne.setId(nouveauemotdepasse);

                System.out.println("Les informations à étét modifier avec succès!!");
                break;
            }

            System.out.println("Choix invalid ");
            trouve=true;

        }
    }

    public static void supprimerunutilisateur(){
        Scanner input = new Scanner (System.in);
        System.out.println("Entrer l'ID qui tu peux modifier:");
        int id = input.nextInt();

        for (Personne personne : table){
            if(personne.getId().equals(id)){
                System.out.println(personne);
            }
        }

    }
    public static void afficherlesutilisateurs(){

        Scanner input = new Scanner (System.in);
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choix;
        while (true) {
            System.out.println("1.Ajouter un utilisateur.");
            System.out.println("2.Rechercher un utilisateur.");
            System.out.println("3.Modifier un utilisateur.");
            System.out.println("4.Supprimer un utilisateur.");
            System.out.println("5.Afficher les utilisateurs.");
            System.out.println("0.Quitter.");
            System.out.print("Entrer votre choix :");
            choix = input.nextInt();


            if(choix == 0){
                System.out.println("Au Revoir !!");
               break;
            }


           switch (choix){

               case 1 :
                   ajouterunutilisateur();
                   break;
               case 2:
                   rechercherunutilisateur();
                   break;
               case 3:
                  modifierunutilisateur();
                   break;
               case 4:
                  supprimerunutilisateur();
                   break;
               case 5:
                   afficherlesutilisateurs();
                   break;

               default:
                       System.out.println("Choix invalide.");
            }
        }

    }

}