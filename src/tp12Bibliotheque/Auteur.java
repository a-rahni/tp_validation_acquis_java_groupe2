package TPsValidationAcquis.tp12Bibliotheque;

public class Auteur {
    private String nom;
    private boolean prix; // a été primé ou non

    public Auteur(String nom, boolean prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public boolean getPrix() {
        return prix;
    }
}
