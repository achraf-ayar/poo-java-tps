package TP3.GestionLivres;

public class Personne {
    private String nom;
    private String prenom;
    private String email;
    private int age;

    public Personne() {
    }

    public Personne(String nom, String prenom, String email, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "nom=" + nom +", prenom=" + prenom  + ", email=" + email   + ", age=" + age ;

    }
}
