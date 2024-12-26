import java.util.Scanner;


 public class Personne {


    String id;
    String nom;
    String prenom;
    int age;


    public Personne(String id, String nom, String prenom, int age) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public void setNom(String nom) {
         this.nom = nom;
     }

     public void setPrenom(String prenom) {
         this.prenom = prenom;
     }

     public void setAge(int age) {
         this.age = age;
     }

     @Override
    public String toString() {
        return "Personne" +
                "Id=" + id +"\n"+
                "nom='" + nom + "\n" +
                "prenom='" + prenom + "\n" +
                "age=" + age +"\n"+
                '}';
    }
}
