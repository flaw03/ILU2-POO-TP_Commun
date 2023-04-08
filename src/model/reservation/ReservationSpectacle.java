package model.reservation;

public class ReservationSpectacle extends Reservation {

    private int numZone;
    private int numChaise;

    public ReservationSpectacle(int jour, int mois,int numZone, int numChaise) {
        super(jour, mois);
        this.numChaise = numChaise;
        this.numZone = numZone;
    }

    public int getNumChaise() {
        return numChaise;
    }

    public int getNumZone() {
        return numZone;
    }

    @Override
    public String toString() {
        return super.toString() + " : Spectacle dans la zone" + numZone + " à la chaise n°" + numChaise + " .";
    }
}
