package TPsValidationAcquis.tp12Bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bibliotheque bib=new Bibliotheque("La bibliotheque municipale");
        System.out.printf("%s est ouverte !\n", bib.getNom());

        Auteur victorHugo = new Auteur("Victor Hugo",false);
        Auteur alexandreDumas = new Auteur("Alexandre Dumas",false);
        Auteur raymondQueneau = new Auteur("Raymond Queneau",true);

        Oeuvre leComteDeMonteCristo = new Oeuvre("Le Comte de Monte-Cristo", alexandreDumas);

        bib.stocker(new Oeuvre("Les Miserables",victorHugo), 2);

        bib.stocker(new Oeuvre("L'Homme qui rit'",victorHugo));  // 1exemplaire

        bib.stocker(leComteDeMonteCristo, 3);

        bib.stocker(new Oeuvre("Zazie dans le metro", raymondQueneau));

        bib.stocker(new Oeuvre("The count of Monte-Cristo", alexandreDumas,"anglais"));

        // lister tous les exemplaires
        System.out.printf("%s offre :\n", bib.getNom());
        afficherList(bib.listerExemplaires(""));

        System.out.println("les auteurs a succes sont");
        afficherList(bib.afficherAuteur(true));

        System.out.printf("Il y a %d exemplaires de %s\n",bib.compterExemplaires(leComteDeMonteCristo),leComteDeMonteCristo.getTitre());


    }

    public static void afficherList(List listExemplaires){
        for(Object e:listExemplaires){
            System.out.println(e.toString());
        }
    }
}

