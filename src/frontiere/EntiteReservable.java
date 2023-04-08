package frontiere;

import model.calendrier.CalendrierAnnuel;
import model.formulaire.Formulaire;
import model.reservation.Reservation;

public abstract class EntiteReservable <F extends Formulaire> {

    private CalendrierAnnuel calendrierAnnuel;
    private int numero;

    public EntiteReservable() {
        this.calendrierAnnuel = new CalendrierAnnuel();
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean estLibre( F formulaire) {
        return calendrierAnnuel.estLibre(formulaire.getJour(), formulaire.getMois());
    }

    public abstract boolean compatible( F  formulaire) ;

    public abstract  Reservation reserver (F formulaire) ;


}
