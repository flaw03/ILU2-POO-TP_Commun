package formulaire;

public class FormulaireSpectacle extends Formulaire {

    private int numPlace;

    public FormulaireSpectacle(int jour, int mois, int numPlace) {
        super(jour, mois);
        this.numPlace = numPlace;
    }

    public int getIdentificationEntite() {
        return super.getIdentificateuronEntite();
    }

    public void setIdentificationEntite(int identificateuronEntite) {
        super.setIdentificationEntite(identificateuronEntite);
    }
}
