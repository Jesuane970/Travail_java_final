import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FichierEcriture {

    private String nomFichier;

    public FichierEcriture(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    /**
     * Écrit du contenu dans le fichier associé à cette instance.
     * @param contenu Le contenu à écrire dans le fichier.
     */
    public void ecrire(String contenu) {
        // Utilisation de try-with-resources pour s'assurer que le BufferedWriter est fermé automatiquement
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.nomFichier))) {
            writer.write(contenu);
            System.out.println("Le contenu a été écrit avec succès dans le fichier : " + this.nomFichier);
        } catch (IOException e) {
            System.err.println("Une erreur est survenue lors de l'écriture dans le fichier : " + e.getMessage());
        }
    }

    // Vous pouvez ajouter un getter/setter pour nomFichier si nécessaire,
    // mais pour cet exemple, le nom est fixé à la construction.
    public String getNomFichier() {
        return nomFichier;
    }
}