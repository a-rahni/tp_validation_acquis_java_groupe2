package TPsValidationAcquis.tp11BisTirelire;

public class Tirelire {
    private double montant;

    public Tirelire() {
        this.montant = 0;
    }
    public Tirelire(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
