package TPsValidationAcquis.tp11ParcAuto;

public class Voiture extends Vehicule{

    public Voiture(int anneeModele, double prix) {
        super(anneeModele, prix);
    }

    @Override
    public void demarrer() {
        System.out.printf("voiture avec matricule %d demarre \n", super.getMaticule());
    }

    @Override
    public void accelerer() {
        System.out.printf("voiture avec matricule %d accelere \n", super.getMaticule());
    }

    @Override
    public String toString() {
        return "voiture "+super.toString();
    }
}
