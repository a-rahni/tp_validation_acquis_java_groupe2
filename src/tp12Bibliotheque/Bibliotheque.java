package TPsValidationAcquis.tp12Bibliotheque;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bibliotheque {
    private String nom;
    private List<Exemplaire> exemplaires = new ArrayList<>();

    public Bibliotheque(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getNbExemplaires(){
        return exemplaires.size();
    }

    public void stocker(Oeuvre oeuvre,int nbrExemplaires){
        for(int i=0;i<nbrExemplaires;i++){
            exemplaires.add(new Exemplaire(oeuvre));
        }
    }
    public void stocker(Oeuvre oeuvre){
        stocker(oeuvre,1);
    }

    public List<Exemplaire> listerExemplaires(String langue){
        List<Exemplaire> resultat = new ArrayList<>();
        for(Exemplaire e:exemplaires){
            if( (langue.equals(e.getOeuvre().getLangue())) || (langue.equals(""))){
                resultat.add(e);
            }
        }
        return resultat;
    }

    public int compterExemplaires(Oeuvre oeuvre){
        int nbrExemmplaires = 0;
        for(Exemplaire e:exemplaires){
            if(e.getOeuvre() == oeuvre){
                nbrExemmplaires++;
            }
        }

        return nbrExemmplaires;
    }

    // sans boolean: afficher les nom des auteur dont un exemplaire est stocké (affichage autant de fois d'exemplaire)
    public List<String> afficherAuteur(){
        List<String> auteursNames = exemplaires.stream()
                .map(e->e.getOeuvre().getAuteur().getNom()).collect(Collectors.toList());
        //System.out.println(auteursNames);
        return auteursNames;
    }

    // true: afficher auteurs avec prix
    public List<String> afficherAuteur(boolean prix){
        List<String> auteursNames = exemplaires.stream().filter(e->e.getOeuvre().getAuteur().getPrix() == prix)
                .map(e->e.getOeuvre().getAuteur().getNom()).collect(Collectors.toList());
        //System.out.println(auteursNames);
        return auteursNames;
    }
}
