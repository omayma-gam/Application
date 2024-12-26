

public class Utilisateur extends Personne {
    String email;
    String motdepasse;
    Role role;

    public Utilisateur(String id, String nom, String prenom, int age, String email, String motdepasse, Role role) {
        super(id, nom, prenom, age);
        this.email = email;
        this.motdepasse = motdepasse;
        this.role = role;
    }

    @Override
    public String toString() {
        return ""  + "\n"  +
                "Id=" + id + "\n" +
                "Nom=" + nom + "\n" +
                "Prenom=" + prenom + "\n" +
                "Age=" + age +"\n"+
                "Email=" + email + "\n" +
                "Mot de passe=" + motdepasse +"\n"+
                "Role ="+ role+"\n"+
                '}';
    }
}


