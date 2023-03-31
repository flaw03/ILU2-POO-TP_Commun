package formulaire;

public abstract class Formulaire {

    private int identificateuronEntite;
    private int jour;
    private int mois;

    public Formulaire( int jour, int mois) {
        this.jour = jour;
        this.mois = mois;
    }

    public int getIdentificateuronEntite() {
        return identificateuronEntite;
    }


    public void setIdentificationEntite(int identificateuronEntite) {
        this.identificateuronEntite = identificateuronEntite;
    }
}
