public class Ecole extends Institution {

    private String typeEcole; // Primaire ou Secondaire
    private int nombreClasses;
    private String nomPromoteur;

    // Constructeur
    public Ecole(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation,
                 String typeEcole, int nombreClasses, String nomPromoteur) {
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.typeEcole = typeEcole;
        this.nombreClasses = nombreClasses;
        this.nomPromoteur = nomPromoteur;
    }

    // Accesseurs et Mutateurs supplémentaires
    public String getTypeEcole() {
        return typeEcole;
    }

    public void setTypeEcole(String typeEcole) {
        this.typeEcole = typeEcole;
    }

    public int getNombreClasses() {
        return nombreClasses;
    }

    public void setNombreClasses(int nombreClasses) {
        this.nombreClasses = nombreClasses;
    }

    public String getNomPromoteur() {
        return nomPromoteur;
    }

    public void setNomPromoteur(String nomPromoteur) {
        this.nomPromoteur = nomPromoteur;
    }

    // Redéfinition de la méthode getDescription() de la classe parente
    @Override
    public String getDescription() {
        return super.getDescription() + "\n" +
               "Type d'école : " + this.typeEcole + "\n" +
               "Nombre de classes : " + this.nombreClasses + "\n" +
               "Nom du promoteur : " + this.nomPromoteur + ".";
    }

    // Méthode statique pour obtenir les noms des promoteurs de trois écoles
    public static void afficherPromoteurs(Ecole e1, Ecole e2, Ecole e3) {
        System.out.println("Noms des promoteurs :");
        System.out.println("- " + e1.getNomPromoteur() + " (" + e1.getNomInstitution() + ")");
        System.out.println("- " + e2.getNomPromoteur() + " (" + e2.getNomInstitution() + ")");
        System.out.println("- " + e3.getNomPromoteur() + " (" + e3.getNomInstitution() + ")");
    }
}