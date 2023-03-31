package model;

import java.util.Arrays;

public abstract class Reservation {

    private int[] date = new int[2];

    public Reservation(int jour , int mois) {
        date[0] = jour;
        date[1] = mois;
    }

    public int[] getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Le " + date[0] + "/" + date[1];
    }
}

