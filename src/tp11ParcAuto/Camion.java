package TPsValidationAcquis.tp11ParcAuto;

public class Camion extends Vehicule{

    public Camion(int anneeModele, double prix) {
        super(anneeModele, prix);
    }

    @Override
    public void demarrer() {

        System.out.printf("Camion avec matricule %d demarre \n", super.getMaticule());
    }

    @Override
    public void accelerer() {

        System.out.printf("Camion avec matricule %d accelere \n", super.getMaticule());
    }

    @Override
    public String toString() {
        return "Camion " +super.toString();
    }
}
