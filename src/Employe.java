import java.util.Objects;


public class Employe implements Comparable<Employe> {
        private int identifiant;
        private String nom;
        private String prenom;
        private String nomDepartement;
        private int grade;

        public Employe() {

        }

        public Employe(int identifiant, String nom, String prenom, String nomDepartement, int grade) {
            this.identifiant = identifiant;
            this.nom = nom;
            this.prenom = prenom;
            this.nomDepartement = nomDepartement;
            this.grade = grade;
        }

        public int getIdentifiant() {
            return identifiant;
        }

        public String getNom() {
            return nom;
        }

        public String getNomDepartement() {
            return nomDepartement;
        }

        public int getGrade() {
            return grade;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Employe employe = (Employe) obj;
            return identifiant == employe.identifiant && nom.equals(employe.nom);
        }




        @Override
        public String toString() {
            return "Employe{" +
                    "identifiant=" + identifiant +
                    ", nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", nomDepartement='" + nomDepartement + '\'' +
                    ", grade=" + grade +
                    '}';
        }

        @Override
        public int compareTo(Employe autreEmploye) {
            return this.identifiant - autreEmploye.identifiant;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + identifiant;
            result = 31 * result + nom.hashCode();
            return result;
        }




    }


