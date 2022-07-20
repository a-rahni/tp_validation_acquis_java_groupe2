package TPsValidationAcquis.tp9GestionStock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {
   // private long generatedRef = 0;
    private Map<Long,Article> stock = new HashMap<>();

    public boolean addArticle(Article article){
       // generatedRef++;
        if(stock.containsKey(article.getReference())){
            System.out.println("la reference existe déja, il doit être unique");
            return false;
        }else{
            stock.put(article.getReference(),article);
            return true;
        }
    }

    public Article findArticleByRef(long ref){
        return stock.get(ref);
    }

    public Article deleteArticleByRef(long ref){
        return stock.remove(ref);
    }

    public Article updateArticle(Article article){
        return stock.replace(article.getReference(),article);
    }

    public List<Article> findByName(String name){
        List<Article> resultat= new ArrayList<>();
        for(Map.Entry m : stock.entrySet()){
            if(  ((Article)m.getValue()).getNom() == name){
                resultat.add((Article)m.getValue());
            }
        }
        return resultat;
    }

    public List<Article> findByPrixInterval(double prixMin, double prixMax){
        List<Article> resultat= new ArrayList<>();
        for(Map.Entry m : stock.entrySet()){
            double lPrix = ((Article)m.getValue()).getPrix();
            if(  (lPrix>=prixMin) && (lPrix<=prixMax)){
                resultat.add((Article)m.getValue());
            }
        }
        return resultat;
    }

    public List<Article> findAll(){
        List<Article> resultat= new ArrayList<>();
        for(Map.Entry m : stock.entrySet()) {
            resultat.add((Article)m.getValue());
        }
        return resultat;
    }

}
