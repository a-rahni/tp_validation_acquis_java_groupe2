package TPsValidationAcquis.tp11ParcAuto;

public abstract class Vehicule {
    private static long lastValueOfMatricule = 0;

    private long maticule;
    private int anneeModele;
    private double prix;

    public Vehicule(int anneeModele, double prix) {
        this.maticule = ++lastValueOfMatricule;
        this.anneeModele = anneeModele;
        this.prix = prix;
    }

    public abstract void demarrer();
    public abstract void accelerer();

    @Override
    public String toString() {
        return String.format(" matricule: %d  annee: %d  prix: %.2f",maticule,anneeModele,prix);
    }

    public long getMaticule() {
        return maticule;
    }

    public void setMaticule(long maticule) {
        this.maticule = maticule;
    }

    public int getAnneeModele() {
        return anneeModele;
    }

    public void setAnneeModele(int anneeModele) {
        this.anneeModele = anneeModele;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
