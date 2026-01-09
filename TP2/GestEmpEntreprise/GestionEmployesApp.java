package GestEmpEntreprise;

public class GestionEmployesApp {
    public static void main(String[] args){
        Employe e1 = new Employe(101,  "Alaoui",  "Karim",  "Informatique", 7000);
        Employe e2 = new Employe( 102,  "Idrissi", "Sara",
                 "Finance", 9500);
        e1.afficherEmploye();
        e2.afficherEmploye();
        e1.augmenterSalaire(10);
        e1.changerDepartement("Ressources Humaines");
        e1.estBienPayé();
        e2.estBienPayé();
        e2.setSalaire(-1000);
        e1.afficherEmploye();
        e2.afficherEmploye();

    }

}
