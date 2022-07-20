package TPsValidationAcquis.tp12Bibliotheque;

public class Oeuvre {
    private String titre;
    private final Auteur auteur;
    private String langue;

    public Oeuvre(String titre, Auteur auteur, String langue) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = langue;
    }
    public Oeuvre(String titre, Auteur auteur) {
       this(titre,auteur,"francais");
    }

    public String getTitre() {
        return titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public String getLangue() {
        return langue;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, en %s",titre,auteur.getNom(),langue);
    }
}
