package model;

public class CalendrierAnnuel {

    private Mois[] mois = new Mois[12];
    public class Mois{
        private String  nom ;
        private  boolean[] jour;

        public Mois(String nom, int nbrJour){
            this.nom = nom;
            jour = new boolean[nbrJour];
        }

        public boolean estLibre(int i){
            return !jour[i-1];
        }

        public void reserver(int i ) throws IllegalStateException{
            if (!estLibre(i)) {
                throw new IllegalStateException("Impossoble de reserver un jour deja reserver");
            }
            jour[i - 1] = true;
        }
    }
    public CalendrierAnnuel(){
        mois[0] = new Mois("Janvier", 31);
        mois[1] = new Mois("Février", 28);
        mois[2] = new Mois("Mars", 31);
        mois[3] = new Mois("Avril", 30);
        mois[4] = new Mois("Mai", 31);
        mois[5] = new Mois("Juin", 30);
        mois[6] = new Mois("Juillet", 31);
        mois[7] = new Mois("Août", 31);
        mois[8] = new Mois("Septembre", 30);
        mois[9] = new Mois("Octobre", 31);
        mois[10] = new Mois("Novembre", 30);
        mois[11] = new Mois("Décembre", 31);
    }


    public boolean estLibre(int jour, int mois){
        if (this.mois[mois - 1].estLibre(jour)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean reserver(int jour, int mois)  {
        try {
            this.mois[mois - 1].reserver(jour);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
