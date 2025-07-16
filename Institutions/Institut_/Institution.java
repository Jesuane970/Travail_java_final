import java.util.Calendar;

public class Institution {

    private String nomInstitution;
    private String paysInstitution;
    private String typeInstitution; // Privée ou Public
    private int anneeCreation;

    // Constructeur
    public Institution(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation) {
        this.nomInstitution = nomInstitution;
        this.paysInstitution = paysInstitution;
        this.typeInstitution = typeInstitution;
        this.anneeCreation = anneeCreation;
    }

    // Accesseurs (getters) et Mutateurs (setters)
    public String getNomInstitution() {
        return nomInstitution;
    }

    public void setNomInstitution(String nomInstitution) {
        this.nomInstitution = nomInstitution;
    }

    public String getPaysInstitution() {
        return paysInstitution;
    }

    public void setPaysInstitution(String paysInstitution) {
        this.paysInstitution = paysInstitution;
    }

    public String getTypeInstitution() {
        return typeInstitution;
    }

    public void setTypeInstitution(String typeInstitution) {
        this.typeInstitution = typeInstitution;
    }

    public int getAnneeCreation() {
        return anneeCreation;
    }

    public void setAnneeCreation(int anneeCreation) {
        this.anneeCreation = anneeCreation;
    }

    // Méthodes d'instance
    public int getAge() {
        int anneeActuelle = Calendar.getInstance().get(Calendar.YEAR);
        return anneeActuelle - this.anneeCreation;
    }

    public String getDescription() {
        return "Nom : " + this.nomInstitution + "\n" +
               "Pays : " + this.paysInstitution + "\n" +
               "Type : " + this.typeInstitution + "\n" +
               "Année de création : " + this.anneeCreation + "\n" +
               "Âge : " + this.getAge() + " ans.";
    }
}