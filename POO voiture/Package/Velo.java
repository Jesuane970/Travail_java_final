public class Velo implements Vehicule {
    @Override
    public void demarrer() {
        System.out.println("Le vélo démarre. On pédale !");
    }

    @Override
    public void arreter() {
        System.out.println("Le vélo s'arrête. On lâche les pédales.");
    }

    @Override
    public int getVitesseMax() {
        return 30;
    }
}