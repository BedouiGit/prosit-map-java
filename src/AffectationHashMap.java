import java.lang.annotation.AnnotationFormatError;
import java.util.*;

public class AffectationHashMap
{
    Map<Employe,Departement> AffectationHashMap = new HashMap<>();

    void ajouterEmployeDepartement(Employe emp, Departement dep)
    {
        if(!AffectationHashMap.containsKey(emp))
            AffectationHashMap.put(emp,dep);
        else
            System.out.println("Ajout non-autorise");
    }

    void afficherEmployesEtDepartements()
    {
        for (Map.Entry<Employe, Departement> entry : AffectationHashMap.entrySet()) {
            Employe key = entry.getKey();
            Departement value = entry.getValue();

            System.out.println("Employee:\n " + key + ", Departement: " + value);
        }
    }

    void supprimerEmploye (Employe emp)
    {
        AffectationHashMap.remove(emp);
    }

    void supprimerEmployeEtDepartement (Employe e, Departement d) {
        Iterator<Map.Entry<Employe, Departement>> iterator = AffectationHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Employe, Departement> entry = iterator.next();
            Employe CurrentEmploye = entry.getKey();
            Departement CurrentDep = entry.getValue();
            if (CurrentEmploye.equals(e) && CurrentDep.equals(d))
                iterator.remove();
        }
    }

    void afficherEmployes()
    {
        System.out.println("Listes Des Employees :");
        for (Employe emp: AffectationHashMap.keySet())
            System.out.println(emp);
    }

    void afficherDepartement()
    {
        System.out.println("Listes Des Departements :");
        for (Departement dep: AffectationHashMap.values())
            System.out.println(dep);
    }

    boolean rechercherEmploye (Employe e)
    {
        return AffectationHashMap.containsKey(e);
    }
    boolean rechercherDep (Departement dep)
    {
        return AffectationHashMap.containsValue(dep);
    }

    TreeMap<Employe, Departement> trierMap()
    {
        return new TreeMap<>(AffectationHashMap);
    }






}
