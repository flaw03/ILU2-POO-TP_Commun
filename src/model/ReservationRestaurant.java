package model;

public class ReservationRestaurant extends Reservation{

    private int numTable;
    private int numService;

    public ReservationRestaurant(int jour, int mois, int numService ,int numTable) {
        super(jour, mois);
        this.numService = numService;
        this.numTable = numTable;
    }

    public int getNumService() {
        return numService;
    }

    public int getNumTable() {
        return numTable;
    }

    private String service(){
        if (numService == 1) {
            return "premier";
        } else {
            return "deuxieme";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " : table n°"+ getNumTable() + " pour le " + service() + " service." ;
    }
}
