package TP3.GestionLivres;

public class Adherent extends Personne {
    private int numAdherent;

    public Adherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }

    public Adherent(String nom, String prenom, String email, int age, int numAdherent) {
        super(nom, prenom, email, age);
        this.numAdherent = numAdherent;
    }

    @Override
    public String toString() {
        return super.toString() + "numAdherent=" + numAdherent ;

    }
}
