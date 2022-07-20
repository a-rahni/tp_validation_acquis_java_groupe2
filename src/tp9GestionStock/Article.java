package TPsValidationAcquis.tp9GestionStock;

public class Article {
    private long reference;
    private String nom;
    private double prix;
    private long quantite;

    public Article(long reference, String nom, double prix, long quantite) {
        this.reference = reference;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return String.format("ref: %d, nom: %s, prix: %.2f€, quantité: %d\n",reference,nom,prix,quantite);
    }

    public long getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public long getQuantite() {
        return quantite;
    }

}
