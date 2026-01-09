package GestCommandes;

public class GestionCommandesApp {
    public static void main(String[] args){
        Client c1 = new Client(1,"El Fassi", "Nadia","nadia@gmail.com");
        Commande cmd1 = new Commande(1001,  "15/03/2025", 1200 , c1);
        cmd1.afficherCommande();
        cmd1.ajouterMontant(300);
        cmd1.afficherCommande();
        c1.setEmail("elfasinadia@gmail.com");
        cmd1.afficherCommande();
        c1.AfficherClient();

    }
}
