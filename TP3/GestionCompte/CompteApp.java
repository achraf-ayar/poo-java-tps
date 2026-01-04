package TP3.GestionCompte;

public class CompteApp {
    public static void main(String[] args){
        Compte c1 = new Compte(500000 , "101002x1");
        Compte c2 = new Compte(800000 , "1010x100y2");

        c1.retirer(1000);
        c2.deposer(200);

        System.out.println("the amount of account 1 is :" + c1.getSolde());
        System.out.println("the amount of account 2 is :" + c2.getSolde());
        System.out.println("Number of accounts  : " + Compte.getNbCompte());



    }
}
