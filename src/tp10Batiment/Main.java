package TPsValidationAcquis.tp10Batiment;

public class Main {
    public static void main(String[] args) {

        Batiment b1= new Batiment("10 route de Paris");
        Maison m1 = new Maison("5 rue de la fraternité",5);
        Batiment bM = new Maison("2 avenue de Nantes",2);

        System.out.println(b1);
        System.out.println(m1);
        System.out.println(bM);

        System.out.printf("Maison a l'adresse %s, nbr de pièces %d\n",m1.getAdresse(), m1.getNbPieces());
        System.out.printf(bM.getAdresse());

    }
}

/**
Énonce:
Ecrivez une classe Bâtiment avec les attributs suivants:
adresse
La classe Bâtiment doit disposer des constructeurs suivants:
Batiment(),
Batiment (adresse).

La classe Bâtiment doit contenir des accesseurs et mutateurs pour les différents attributs. La classe Bâtiment
doit contenir une méthode ToString () donnant une représentation du Bâtiment.

Ecrivez une classe Maison héritant de Bâtiment avec les attributs suivants:

NbPieces: Le nombre de pièces de la maison.

La classe Maison doit disposer des constructeurs suivants:

Maison(),
Maison(adresse, nbPieces).

La classe Maison doit contenir des accesseurs et mutateurs (ou des propriétés) pour les différents attributs.
 La classe Maison doit contenir une méthode ToString () donnant une représentation de la Maison.

Écrivez aussi un programme afin de tester ces deux classes .
*/