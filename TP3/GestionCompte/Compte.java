package TP3.GestionCompte;

public class Compte {
    private String numero;
    private double solde;
    private static int nbCompte;

    public Compte() {
        nbCompte++;
    }

    public Compte(double solde, String numero) {
        this.solde = solde;
        this.numero = numero;
        nbCompte++;
    }

    public static int getNbCompte() {
        return nbCompte;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) {
        solde += montant;

    }

    public void retirer(double montant) {
        if (montant > solde)
            System.out.print("votre solde est insuffisant!");
        else solde -= montant;
    }

    public void afficherCompteInfo(){
            System.out.print("le compte : "+numero +" avec solde : "+solde);
    }
    public static void afficherNbCompte(){
        System.out.print("Nombre Compte : "+nbCompte );
    }



}

