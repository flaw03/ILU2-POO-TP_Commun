package model;

import frontiere.EntiteReservable;
import model.formulaire.Formulaire;
import model.reservation.Reservation;

public  class CentalReservation <F extends  Formulaire , E extends EntiteReservable>  {
    private E[] entiteReservables;
    private int nbrEntiteReserver ;

    public CentalReservation( E[] entiteReservables) {
        nbrEntiteReserver = 0;
        this.entiteReservables = entiteReservables;
    }

    public void ajouterEntite(E entiteReservable ){
        entiteReservables[nbrEntiteReserver] = entiteReservable;
        entiteReservable.setNumero(nbrEntiteReserver + 1 );
        nbrEntiteReserver++;
    }

    public int[] donnerPossibilites(F formulaire) {
        int[] tab = new int[nbrEntiteReserver];
        for (int i = 0 ; i< nbrEntiteReserver;i++){
            if( entiteReservables[i].compatible(formulaire)){
                tab[i] = i+1;
            }
            else {
                tab[i] = 0;
            }
        }
        return tab;
    }

    public  Reservation reserver(int numeroEntite , F formulaire) {
        formulaire.setIdentificationEntite(numeroEntite);
        return entiteReservables[numeroEntite-1].reserver(formulaire);
    }


}
