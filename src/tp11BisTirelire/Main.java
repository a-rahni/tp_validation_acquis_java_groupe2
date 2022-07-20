package TPsValidationAcquis.tp11BisTirelire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tirelire t = new Tirelire();
        TirelireService ts=new TirelireService(t);
        Scanner input = new Scanner(System.in);

        ts.afficherTirelire();
        ts.afficherTirelire();
        ts.remplir(550);
        ts.secouerTirelire();
        ts.puiser(15);
        ts.afficherTirelire();
        System.out.printf("Donnez le budget de vos vacances: ");
        double budget = input.nextDouble();
        double nouveuaSolde = ts.calculerSolde(budget);
        if(nouveuaSolde>=0){
            System.out.printf("Vous âtes assez riche pour partir en vacances! il vous restera %.2f euros à la rentrée\n",nouveuaSolde);
        }else {
            System.out.printf("Il vous manque %.2f euros pour partir en vacances!\n",-nouveuaSolde);
        }


    }
}

/**
 Le but de cet exercice est de simuler une tirelire dans laquelle on stocke et retire de l’argent et que l’on
 souhaite utiliser pour payer un certain budget (de vacances,par exemple).
Voici les détails de l’exercice :

Les traitements qui lui sont spécifiques sont :
une méthode getMontant retournant le montant de la tirelire;

une méthode afficher affichant les données de la tirelire sous le format suivant :
Vous êtes sans le sou,si la tirelire ne contient pas d’argent
Vous avez : <montant> € dans votre tirelire.

une méthode secouer affichant sur le terminal le message Bing bing,suivi d’un saut de ligne, dans le cas où la
 tirelire contient de l’argent, et qui n’affiche rien sinon;

la méthode remplir mettant un montant donné en paramètre (double) dans la tirelire. Seuls les montant positifs
 seront acceptés (dans le cas contraire on ne fait rien);

une méthode vider (réinitialisant le montant de la tirelire à zéro);
une méthode puiser permettant de puiser dans la tirelire un montant donné en paramètre. Si le montant est négatif il
 sera ignoré. Si le montant en argument est plus grand que le montant disponible, la tirelire est alors vidée.
 La méthode puiser ne retourne rien.

une méthode calculerSolde qui retourne la différence entre le montant de la tirelire et le budget que l’on
 souhaite dépenser (un double). Si le budget est négatif (ou nul), la méthode calculerSolde doit retourner le
 montant de la tirelire.

Ces méthodes feront partie de l’interface d’utilisation de la classe.

Exemple d'exécution

Vous êtes sans le sou.
Vous êtes sans le sou.
Bing bing
Vous avez : 550.0 euros dans votre tirelire.
Vous avez : 535.0 euros dans votre tirelire.
Donnez le budget de vos vacances : 450
Vous êtes assez riche pour partir en vacances ! il vous restera 85.0 euros à la rentrée

ou

Vous etes sans le sou.
Vous êtes sans le sou.
Bing bing Vous avez : 550.0 euros dans votre tirelire.
Vous avez : 535.0 euros dans votre tirelire.
Donnez le budget de vos vacances : 1250.0
Il vous manque 715.0 euros pour partir en vacances !
*/