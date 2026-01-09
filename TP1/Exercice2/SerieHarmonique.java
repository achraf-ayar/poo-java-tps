import java.util.Scanner;


public class SerieHarmonique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Entrez le nombre N (nombre de termes): ");
        int n = scanner.nextInt();
        
        
        if (n <= 0) {
            System.out.println("Erreur: N doit être un entier positif!");
            scanner.close();
            return;
        }
        
        double somme = 0.0;
        for (int i = 1; i <= n; i++) {
            somme += 1.0 / i;
        }
        
     
        System.out.println("Somme des " + n + " premiers termes de la série harmonique:");
        System.out.println("1 + 1/2 + 1/3 + ... + 1/" + n + " = " + somme);
        
        scanner.close();
    }
}
