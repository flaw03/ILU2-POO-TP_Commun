package model.formulaire;

public class FormulaireHotel extends Formulaire{

    private int nbrLitSimple;
    private int getNbrLitDouble;

    public FormulaireHotel(int jour, int mois, int nbrLitSimple, int getNbrLitDouble) {
        super(jour, mois);
        this.nbrLitSimple = nbrLitSimple;
        this.getNbrLitDouble = getNbrLitDouble;
    }

    public void setIdentificationEntite(int identificateuronEntite) {
        super.setIdentificationEntite(identificateuronEntite);
    }

}
