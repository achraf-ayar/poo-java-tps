package TP3.GestionVehicule;

public class Main {

    public static void main(String[] args) {
        Avion a1 = new Avion("Boing",10,"Dacia",500);
        Moto m1 = new Moto("Boing",10,"Dacia",500);
        Voiture v1 = new Voiture("Boing",10,"Dacia",500);
        Vehicule v2 = new Voiture("Boing",10,"Dacia",500);

        a1.emettreSon();
        a1.afficherInformations();

    }

}
