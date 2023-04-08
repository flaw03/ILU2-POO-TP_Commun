package model.etablisement;

import frontiere.EntiteReservable;
import model.CentalReservation;
import model.calendrier.CalendrierAnnuel;
import model.formulaire.FormulaireRestaurant;
import model.reservation.Reservation;
import model.reservation.ReservationRestaurant;

public class Restaurant  {


    private final CentalReservation <FormulaireRestaurant,Table> centalReservation ;

    public static class Table extends EntiteReservable <FormulaireRestaurant> {

        private final int nbChaises;
        CalendrierAnnuel calendrierService2;

        public Table(int nbChaises) {
            this.nbChaises = nbChaises;
            calendrierService2 = new CalendrierAnnuel();
        }

        @Override
        public boolean compatible(FormulaireRestaurant formulaire) {
            if ( formulaire.getNombrePersonnes() ==  nbChaises || formulaire.getNombrePersonnes() + 1== nbChaises ){
                if (formulaire.getNumService() == 1){
                    return super.estLibre(formulaire);
                }
                else {
                    return calendrierService2.estLibre(formulaire.getJour(), formulaire.getMois());
                }
            }
            return false;
        }

        @Override
        public Reservation reserver(FormulaireRestaurant formulaire) {
            return new ReservationRestaurant(formulaire.getJour(), formulaire.getMois(),
                    formulaire.getNumService(), formulaire.getIdentificateuronEntite());
        }
    }

    public Restaurant() {
        Table[] tables = new Table[30];
        this.centalReservation = new CentalReservation<>(tables);
    }

    public void ajouterTable (int nbrChaise ){
        Table table = new Table(nbrChaise);
        centalReservation.ajouterEntite(table);
    }

    public int[] donnerPossibilites(FormulaireRestaurant formulaireRestaurant) {
        return  centalReservation.donnerPossibilites(formulaireRestaurant);
    }

    public Reservation reserver(int numEntite, FormulaireRestaurant formulaireRestaurant) {
        return  centalReservation.reserver(numEntite, formulaireRestaurant);
    }

}
