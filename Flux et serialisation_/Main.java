public class Main {

    public static void main(String[] args) {
        String nomDuFichierATester = "monFichierSeparation.txt";
        String contenuPourEcrire = "Première ligne écrite par FichierEcriture.\n" +
                                   "Deuxième ligne pour démontrer la lecture.\n" +
                                   "C'est la troisième et dernière ligne.";

        // Création d'une instance de la classe pour l'écriture
        FichierEcriture ecrivain = new FichierEcriture(nomDuFichierATester);

        // Appel de la méthode d'écriture
        ecrivain.ecrire(contenuPourEcrire);

        // Création d'une instance de la classe pour la lecture
        FichierLecture lecteur = new FichierLecture(nomDuFichierATester);

        // Appel de la méthode de lecture
        lecteur.lireEtAfficher();
    }
}