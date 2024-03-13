public class Departement implements Comparable <Departement> {
    int id;
    String nomDep;
    int nbrEmp;
    Departement () {}
    Departement (int id,String nomDep,int nbrEmp)
    {
        this.id=id;
        this.nomDep=nomDep;
        this.nbrEmp=nbrEmp;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getNbrEmp() {
        return nbrEmp;
    }

    public void setNbrEmp(int nbrEmp) {
        this.nbrEmp = nbrEmp;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if (this==obj)return true;
        if (obj instanceof Departement)
            if(id==this.getId() && nomDep.equals(getNomDep()))
                return true;

        return false;
    }

    @Override
    public String toString()
    {
        return "ID= "+getId()+ "Nom Departement= "+getNomDep()+ "Nombre des Employees= "+getNbrEmp();
    }

    @Override
    public int compareTo (Departement dep)
    {
        return this.id - dep.getId();
    }


}
