import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FichierLecture {

    private String nomFichier;

    public FichierLecture(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    /**
     * Lit et affiche le contenu du fichier associé à cette instance ligne par ligne.
     */
    public void lireEtAfficher() {
        System.out.println("\n--- Lecture du fichier : " + this.nomFichier + " ---");
        // Utilisation de try-with-resources pour s'assurer que le BufferedReader est fermé automatiquement
        try (BufferedReader reader = new BufferedReader(new FileReader(this.nomFichier))) {
            String ligne;
            // Lire chaque ligne jusqu'à ce que la fin du fichier soit atteinte (ligne == null)
            while ((ligne = reader.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            System.err.println("Une erreur est survenue lors de la lecture du fichier : " + e.getMessage());
        }
    }

    // Vous pouvez également ajouter un getter/setter pour nomFichier si nécessaire.
    public String getNomFichier() {
        return nomFichier;
    }
}