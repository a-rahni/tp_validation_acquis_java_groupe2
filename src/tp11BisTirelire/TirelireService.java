package TPsValidationAcquis.tp11BisTirelire;

public class TirelireService {
    private Tirelire tirelire;

    public TirelireService(Tirelire tirelire) {
        this.tirelire = tirelire;
    }

    void afficherTirelire(){
        if(tirelire.getMontant() <= 0){
            System.out.println("Vous êtes sans le sou");
        }else{
            System.out.printf("Vous avez: %.2f euros dans votre tirelire\n",tirelire.getMontant());
        }
    }

    void secouerTirelire(){
        if(tirelire.getMontant() >0){
            System.out.println("Bing bing");
            afficherTirelire();
        }
    }

    void remplir(double montant){
        if(montant>0){
            tirelire.setMontant(montant+tirelire.getMontant());
        }
    }

    void vider(){tirelire.setMontant(0);}

    void puiser(double montant){
        if(montant<=0){
            return;
        }
        double solde = tirelire.getMontant();
        solde = (montant >= solde)?0: solde-montant;
        tirelire.setMontant(solde);
    }

    public double calculerSolde(double budget){
        return tirelire.getMontant() - budget;
    }


}
