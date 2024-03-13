import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class DepartementHashSet implements IDepartement <Departement>{
    Set<Departement> monHashSet = new HashSet<Departement>();
    public void ajouterDepartement(Departement dep)
    {
        monHashSet.add(dep);
    }
    public boolean rechercherDepartement(String nom)
    {
        for(Departement dep:monHashSet)
        {
            if (nom.equals(dep.nomDep))
                return true;
        }
        return false;
    }
    public boolean rechercherDepartement(Departement dep)
    {
        return monHashSet.contains(dep);
    }
    public void supprimerDepartement(Departement dep)
    {
        monHashSet.remove(dep);
    }
    public void displayDepartement()
    {
        for(Departement dep:monHashSet)
            System.out.println(dep);
    }
    public TreeSet<Departement> trierDepartementById()
    {
        //Collections.sort(monHashSet);
        return new TreeSet<Departement>(monHashSet);
    }
}
