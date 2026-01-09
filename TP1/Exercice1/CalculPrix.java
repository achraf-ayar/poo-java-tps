import java.util.Scanner;


public class CalculPrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Entrez la quantité d'articles achetés: ");
        int quantite = scanner.nextInt();
        
        
        System.out.print("Entrez le prix unitaire normal: ");
        double prixUnitaireNormal = scanner.nextDouble();
        
        
        double prixUnitaire;
        if (quantite > 100) {
            prixUnitaire = 0.6 * prixUnitaireNormal;
        } else {
            prixUnitaire = prixUnitaireNormal;
        }
        
       
        double prixTotal = quantite * prixUnitaire;
        
      
        
        System.out.println("Quantité: " + quantite);
        System.out.println("Prix unitaire normal: " + prixUnitaireNormal);
        System.out.println("Prix unitaire appliqué: " + prixUnitaire);
        System.out.println("Prix total à payer: " + prixTotal);
        
        scanner.close();
    }
}
