package model.formulaire;

public class FormulaireSpectacle extends Formulaire {

    private int numZone;

    public FormulaireSpectacle(int jour, int mois, int numZone) {
        super(jour, mois);
        this.numZone = numZone;
    }

    public int getIdentificationEntite() {
        return super.getIdentificateuronEntite();
    }

    public void setIdentificationEntite(int identificateuronEntite) {
        super.setIdentificationEntite(identificateuronEntite);
    }

    public int getNumZone() {
        return numZone;
    }

    public int getIdentificateuronEntite() {
        return super.getIdentificateuronEntite();
    }
    public int getJour(){
        return super.getJour();
    }

    public int getMois(){
        return super.getMois();
    }
}
