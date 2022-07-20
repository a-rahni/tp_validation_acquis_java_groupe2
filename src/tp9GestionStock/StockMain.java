package TPsValidationAcquis.tp9GestionStock;

import java.util.List;

/** ennonce du TP en bas du fichier*/
public class StockMain {
    public static void main(String[] args) {
        Stock stock=new Stock();

        stock.addArticle(new Article(1L,"Cahier96",1d,20));
        stock.addArticle(new Article(2L,"Clavier",25d,15));
        stock.addArticle(new Article(3L,"Souris",15,25));
        stock.addArticle(new Article(4L,"Souris",35,2));

        stock.addArticle(new Article(2L,"Ecran",200,5));

        Article article2= stock.findArticleByRef(2L);
        System.out.println(article2);

        // modification d'un article
        System.out.println("Update de l'article avec ref: 2 -> quantite:25");
        Article article2Modif = new Article(article2.getReference(), article2.getNom(), article2.getPrix(), article2.getQuantite()+10);
        System.out.println(article2);
        stock.updateArticle(article2Modif);

        System.out.println("reaffichage l'article 2 après midification: quantite doit etre 25");
        System.out.println(stock.findArticleByRef(article2Modif.getReference()));

        System.out.println("recherche par nom: Souris");
        List<Article> articlesRech = stock.findByName("Souris");
        System.out.println(articlesRech);

        System.out.println("delete article  puis recherche par nom: Souris");
        stock.deleteArticleByRef(4L);
        articlesRech = stock.findByName("Souris");
        System.out.println(articlesRech);

        System.out.println("recherche par reference: 1");
        Article artRech = stock.findArticleByRef(1L);
        System.out.println(artRech);

        System.out.println("recherche par prix: min:3 max 30");
        List<Article> listArticlePrix = stock.findByPrixInterval(3,30);
        System.out.println(listArticlePrix);

        System.out.println("affichage tous les articles");
        System.out.println(stock.findAll());


    }
}



/**
    Soit à développer une application pour la gestion d’un stock.

        Un article est caractérisé par son numéro de référence, son nom, son prix de vente et une quantité en stock.

        Le stock est représenté par une collection d’articles.

        Travail à faire:
        Créer la classe article contenant les éléments suivants :
        Les attributs/propriétés.
        Un constructeur d’initialisation.
        La méthode ToString().

        Dans la classe Program créer :

        Le stock sous forme d'une collection d’articles de votre choix.

        Un menu présentant les fonctionnalités suivantes :

        Rechercher un article par référence.
        Ajouter un article au stock en vérifiant l’unicité de la référence.
        Supprimer un article par référence.
        Modifier un article par référence.
        Rechercher un article par nom.
        Rechercher un article par intervalle de prix de vente.
        Afficher tous les articles.
        Quitter
*/