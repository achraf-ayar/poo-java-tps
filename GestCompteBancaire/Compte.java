package GestCompteBancaire;

public class Compte {
    private long num;
    private String nomClient;
    private double solde;

    public Compte(){};
    public Compte(long num, String nomClient , double solde){
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }

    public long getNum() {
        return num;
    }

    public String getNomClient() {
        return nomClient;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public void afficherCompteInfo(){
        System.out.println("Le compte " + num + " de " + nomClient + " ayant le solde " + solde);
    }
    public void retirer(double montant){
        if(solde >= montant){
            solde -= montant;

        }else{
            System.out.println("votre solde est insuffisant !!");
        }


    }
    public void deposer(double montant){
        solde += montant;

        }


    }



