package formulaire;

public class FormulaireRestaurant extends Formulaire {

    private int nbrPersonnes;
    private int numService;

    public FormulaireRestaurant(int jour, int mois, int nbrPersonnes, int numService) {
        super(jour, mois);
        this.nbrPersonnes = nbrPersonnes;
        this.numService = numService;
    }

    public int getIdentificationEntite(){
        return super.getIdentificateuronEntite();
    }

    public void setIdentificationEntite(int numeroTable) {
        super.setIdentificationEntite(numeroTable);
    }

}
