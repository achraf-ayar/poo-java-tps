package TP3.GestionLivres;

public class gestionApp {
    public static void main(String[] args){
        Adherent ad1 = new Adherent("Alami" , "Mohammed" , "alamomohammed@gmail.com" , 43,0101);
        Auteur aut1 = new Auteur("khalido" , "Amine" , "khalidoamine@gmail.com" , 66 , 99) ;
        Livre liv1 = new Livre(1081 , "The red book" , aut1);

        System.out.println(ad1.toString());
        System.out.println(liv1.toString());


    }
}
