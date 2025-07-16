public class Main {
    public static void main(String[] args) {

        // 1. Création et affichage d'une Institution
        System.out.println("--- Description d'une institution ---");
        Institution maMairie = new Institution("Mairie de Paris", "France", "Public", 1357);
        System.out.println(maMairie.getDescription());
        System.out.println();

        // 2. Création et affichage d'une Université
        System.out.println("--- Description d'une université ---");
        Universite u1 = new Universite("Université Sorbonne", "France", "Public", 1257, 10, "Classique", "M. Jean Dubois");
        System.out.println(u1.getDescription());
        System.out.println();

        // 3. Création et affichage d'une École
        System.out.println("--- Description d'une école ---");
        Ecole e1 = new Ecole("Lycée Fénelon", "France", "Public", 1851, "Secondaire", 35, "Mme Marie Leroux");
        System.out.println(e1.getDescription());
        System.out.println();

        // 4. Affichage des noms des recteurs de 2 universités
        System.out.println("--- Noms des recteurs de 2 universités ---");
        Universite u2 = new Universite("Université de Montréal", "Canada", "Publique", 1878, 16, "LMD", "Mme Sophie Martin");
        Universite.afficherRecteurs(u1, u2);
        System.out.println();

        // 5. Affichage des noms des promoteurs de 3 écoles
        System.out.println("--- Noms des promoteurs de 3 écoles ---");
        Ecole e2 = new Ecole("Ecole Saint-Joseph", "Belgique", "Privée", 1920, "Primaire", 12, "M. Pierre Dumont");
        Ecole e3 = new Ecole("College La Salle", "Espagne", "Privée", 1950, "Secondaire", 25, "M. Carlos Sanchez");
        Ecole.afficherPromoteurs(e1, e2, e3);
        System.out.println();
    }
}