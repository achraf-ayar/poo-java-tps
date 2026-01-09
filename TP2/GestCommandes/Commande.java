package GestCommandes;

public class Commande {

    private int numeroCommande;
    private String dateCommande;
    private double montantTotal;
    private Client client;

    public Commande(){}

    public Commande(int numeroCommande, String dateCommande, double montantTotal, Client client) {
        this.numeroCommande = numeroCommande;
        this.dateCommande = dateCommande;
        this.montantTotal = montantTotal;
        this.client = client;
    }

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public String getdateCommande() {
        return dateCommande;
    }

    public void setdateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public void afficherCommande(){
        System.out.println("Le commande numero "+ numeroCommande + " de date " + dateCommande + " avec le montant total "+ montantTotal + " de client " + client.getPrenom() + " " + client.getNom());
    }
    void ajouterMontant(double montant){
        if(montant > 0)
            montantTotal += montant;

        else
            System.out.println("le montant doit être positif");
    }

}
