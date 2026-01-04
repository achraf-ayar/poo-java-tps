package TP3.GestionMachineProduction;
public class MachineProduction {
    // Object Attributes
    private long id;
    private int nombreProduits;
    // Static Attributes
    private static long prochainId;
    private static int totalProduits;
    private static int plafondProduction;

    public MachineProduction() {
        id = prochainId++;

    }

    public static void setPlafondProduction(int plafond){
        plafondProduction = plafond;
    }

    public boolean produire(int quantite) {
        if ((totalProduits + quantite) <= plafondProduction) {
            totalProduits += quantite;
            return true;
        }
        ;
        return false;
    }

    public static int getTotalProduits(){
        return totalProduits;
    }
}
