package TPsValidationAcquis.tp12Bibliotheque;

public class Exemplaire {
    private final Oeuvre oeuvre;

    public Exemplaire(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
        System.out.printf("Nouvel exemplaire-> %s\n",oeuvre.toString());
    }

    // constructeur de copie
    public Exemplaire(Exemplaire exemplaire) {
        this.oeuvre = exemplaire.getOeuvre();
        System.out.printf("Copie d'un exemplaire-> %s\n",oeuvre.toString());
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    @Override
    public String toString() {
        return String.format("Un exemplaire de %s ",oeuvre.toString());
    }
}
