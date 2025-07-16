public class Universite extends Institution {

    private int nombreFaculte;
    private String systemeEnseignement; // LMD ou Classique
    private String nomRecteur;

    // Constructeur
    public Universite(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation,
                      int nombreFaculte, String systemeEnseignement, String nomRecteur) {
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.nombreFaculte = nombreFaculte;
        this.systemeEnseignement = systemeEnseignement;
        this.nomRecteur = nomRecteur;
    }

    // Accesseurs et Mutateurs supplémentaires
    public int getNombreFaculte() {
        return nombreFaculte;
    }

    public void setNombreFaculte(int nombreFaculte) {
        this.nombreFaculte = nombreFaculte;
    }

    public String getSystemeEnseignement() {
        return systemeEnseignement;
    }

    public void setSystemeEnseignement(String systemeEnseignement) {
        this.systemeEnseignement = systemeEnseignement;
    }

    public String getNomRecteur() {
        return nomRecteur;
    }

    public void setNomRecteur(String nomRecteur) {
        this.nomRecteur = nomRecteur;
    }

    // Redéfinition de la méthode getDescription() de la classe parente
    @Override
    public String getDescription() {
        return super.getDescription() + "\n" +
               "Nombre de facultés : " + this.nombreFaculte + "\n" +
               "Système d'enseignement : " + this.systemeEnseignement + "\n" +
               "Nom du recteur : " + this.nomRecteur + ".";
    }

    // Méthode statique pour obtenir les noms des recteurs de deux universités
    public static void afficherRecteurs(Universite u1, Universite u2) {
        System.out.println("Noms des recteurs :");
        System.out.println("- " + u1.getNomRecteur() + " (" + u1.getNomInstitution() + ")");
        System.out.println("- " + u2.getNomRecteur() + " (" + u2.getNomInstitution() + ")");
    }
}