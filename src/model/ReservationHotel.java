package model;

public class ReservationHotel extends Reservation{

    private int nbrLitSimple;
    private int nbrLitDouble;
    private int numChambre;



    public ReservationHotel(int jour, int mois,int nbrLitSimple,int nbrLitDouble, int numChambre) {
        super(jour, mois);
        this.nbrLitSimple = nbrLitSimple;
        this.nbrLitDouble = nbrLitDouble;
        this.numChambre = numChambre;
    }

    public int getNbrLitDouble() {
        return nbrLitDouble;
    }

    public int getNumChambre() {
        return numChambre;
    }

    public int getNbrLitSimple() {
        return nbrLitSimple;
    }

    @Override
    public String toString() {
        return super.toString() + " : chambre n°" + getNumChambre() + " avec "+ getNbrLitSimple()+" lit(s) simple(s)" +
                " et "+ getNbrLitDouble() + " lit(s) double(s).";
    }
}
