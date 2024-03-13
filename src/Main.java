import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DepartementHashSet departementHashSet =new DepartementHashSet();

        Employe emp1 =new Employe(1,"Khalil","Bedoui","DATA-SC",20);
        Employe emp2=new Employe(2,"Gatuzo","EL WAHCH","SPORT",10);

        Departement dep1 =new Departement(1,"Departement Dev",1);
        Departement dep2 =new Departement(2,"Departement Reseau",2);
        Departement dep3 =new Departement(3,"Departement HR ",7);

        //AJOUT
        departementHashSet.ajouterDepartement(dep1);
        departementHashSet.ajouterDepartement(dep2);
        departementHashSet.ajouterDepartement(dep3);

        //RECHERCHE
        String nom="Departement Dev";
        departementHashSet.rechercherDepartement(nom);
        departementHashSet.rechercherDepartement(dep3);

        //SUPPRIMIER
        departementHashSet.supprimerDepartement(dep1);

        //DISPLAY
        departementHashSet.displayDepartement();

        //TRIER
        departementHashSet.trierDepartementById();

        //Instruction 3 :
        AffectationHashMap AffectationHashMap = new AffectationHashMap();
        AffectationHashMap.ajouterEmployeDepartement(emp1,dep1);
        AffectationHashMap.ajouterEmployeDepartement(emp2,dep2);
        AffectationHashMap.afficherEmployesEtDepartements();

        //Instruction 4 et 5 :
        //AffectationHashMap.supprimerEmploye(emp1);

        AffectationHashMap.afficherEmployesEtDepartements();
        AffectationHashMap.afficherEmployes();
        AffectationHashMap.afficherDepartement();

        //RECHERCHER :
        System.out.println(AffectationHashMap.rechercherEmploye (emp2));

        TreeMap<Employe,Departement> sortedMap = AffectationHashMap.trierMap();
        
        //Instruction 8:
        System.out.println(" liste triée : ");
        for (Map.Entry<Employe,Departement> entry : sortedMap.entrySet()){
            Employe employe = entry.getKey();
            Departement departement = entry.getValue();

            System.out.println("employe : " + employe.getNom() + " , departement : " + departement.getNomDep());

        }






    }
}