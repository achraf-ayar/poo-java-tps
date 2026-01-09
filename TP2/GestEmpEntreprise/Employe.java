package GestEmpEntreprise;

public class Employe {

    private int matricule;
    private String nom, prenom, departement;
    private double salaire;

    public Employe(){

    }
    public Employe(int matricule, String nom, String prenom, String departement , double salaire){
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
        this.salaire = salaire;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public void afficherEmploye(){
        System.out.println("L'employe " + nom + " " + prenom +" avec le matricule : " + matricule + " de departement " + departement + " avec un salaire : " + salaire);
    }
    void augmenterSalaire(double pourcentage) {
        salaire +=  salaire * pourcentage /100;
    }
    void changerDepartement(String nouveauDepartement){
        departement = nouveauDepartement;
    }
    boolean estBienPayé(){
        if(salaire > 8000)
            return true;

        else
            return false;

    }
}
