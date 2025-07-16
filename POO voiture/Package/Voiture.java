public class Voiture implements Vehicule {
    @Override
    public void demarrer() {
        System.out.println("La voiture démarre. Vroum !");
    }

    @Override
    public void arreter() {
        System.out.println("La voiture s'arrête. Freinage en cours.");
    }

    @Override
    public int getVitesseMax() {
        return 200;
    }
}