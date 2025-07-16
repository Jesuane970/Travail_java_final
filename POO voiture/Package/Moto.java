public class Moto implements Vehicule {
    @Override
    public void demarrer() {
        System.out.println("La moto démarre. Bruit du moteur.");
    }

    @Override
    public void arreter() {
        System.out.println("La moto s'arrête. On coupe le contact.");
    }

    @Override
    public int getVitesseMax() {
        return 180;
    }
}