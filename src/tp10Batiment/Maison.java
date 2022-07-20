package TPsValidationAcquis.tp10Batiment;

public class Maison extends Batiment{
    private int nbPieces;

    public Maison() {
        super();
        this.nbPieces = 0;
    }

    public Maison(String adresse, int nbPieces) {
        super(adresse);
        this.nbPieces = nbPieces;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    @Override
    public String toString() {
        return String.format("Maison de %d pièces se situe à %s\n",nbPieces, super.toString());
    }
}
