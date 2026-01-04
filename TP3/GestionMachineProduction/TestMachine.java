package TP3.GestionMachineProduction;

public class TestMachine {
    public static void main(String[] args) {
        MachineProduction.setPlafondProduction(100);
        MachineProduction m1 = new MachineProduction();
        MachineProduction m2 = new MachineProduction();
        m1.produire(30);
        m2.produire(50);
        m1.produire(40); // Dépassera le plafond
        System.out.println("Total produits : " +
                MachineProduction.getTotalProduits());
    }
}