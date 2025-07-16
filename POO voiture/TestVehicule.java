public class TestVehicule {
    public static void main(String[] args) {
        // Création des objets de type Vehicule
        Vehicule maVoiture = new Voiture();
        Vehicule monVelo = new Velo();
        Vehicule maMoto = new Moto();

        System.out.println("--- Test de la Voiture ---");
        maVoiture.demarrer();
        System.out.println("Vitesse maximale de la voiture : " + maVoiture.getVitesseMax() + " km/h.");
        maVoiture.arreter();

        System.out.println("\n--- Test du Vélo ---");
        monVelo.demarrer();
        System.out.println("Vitesse maximale du vélo : " + monVelo.getVitesseMax() + " km/h.");
        monVelo.arreter();

        System.out.println("\n--- Test de la Moto ---");
        maMoto.demarrer();
        System.out.println("Vitesse maximale de la moto : " + maMoto.getVitesseMax() + " km/h.");
        maMoto.arreter();
    }
}