package TPsValidationAcquis.tp11ParcAuto;

public class Test {
    public static void main(String[] args) {
        Vehicule voit1 = new Voiture(2001,25001);
        Vehicule voit2 = new Voiture(2002,25002);
        Vehicule cam3 = new Voiture(2003,25003);
        Vehicule cam4 = new Voiture(2004,25004);

        System.out.println(voit1);
        voit1.demarrer();
        voit2.accelerer();

        System.out.println(cam3);
        cam3.accelerer();
        cam4.demarrer();
        cam4.accelerer();

    }
}
