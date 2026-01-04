package TP3.GestionLivres;

public class Auteur extends Personne {
    private int numAuteur;

    public Auteur(int numAuteur) {
        this.numAuteur = numAuteur;
    }

    public Auteur(String nom, String prenom, String email, int age, int numAuteur) {
        super(nom, prenom, email, age);
        this.numAuteur = numAuteur;
    }

    @Override
    public String toString() {
        return super.toString() + " numAuteur=" + numAuteur;

    }
}
