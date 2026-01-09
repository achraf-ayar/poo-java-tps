import java.util.Scanner;


public class NombreMagique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nombreMagique = 42; 
        System.out.println("Jeu du Nombre Magique");
        System.out.println("Essayez de deviner le nombre magique!");
        System.out.println("(Indice: c'est un nombre entre 1 et 100)\n");
        
        int tentative;
        int nombreTentatives = 0;
            
            
        do {
            System.out.print("Entrez votre nombre: ");
            tentative = scanner.nextInt();
            nombreTentatives++;
            
            if (tentative < nombreMagique) {
                System.out.println("Trop bas! Essayez un nombre plus grand.");
            } else if (tentative > nombreMagique) {
                System.out.println("Trop haut! Essayez un nombre plus petit.");
            } else {
                System.out.println("\n🎉 Félicitations! Vous avez trouvé le nombre magique!");
                System.out.println("Nombre de tentatives: " + nombreTentatives);
            }
        } while (tentative != nombreMagique);
        
        scanner.close();
    }
}
