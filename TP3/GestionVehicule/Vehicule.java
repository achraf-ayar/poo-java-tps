package TP3.GestionVehicule;

public class Vehicule {
    private String nom;
    private double prix;

    public Vehicule() {
    }

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
    public void emettreSon(){
        System.out.println("le vehicule emet un son inconnu");
    };
    public void afficherInformations(){
        System.out.print("nom : " + nom  +"\n" + "prix : " + prix );
    }
}
