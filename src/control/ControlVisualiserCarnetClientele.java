
package control;

import model.calendrier.CarnetClientele;

public class ControlVisualiserCarnetClientele {
    private CarnetClientele carnetClientel;

    public ControlVisualiserCarnetClientele(CarnetClientele carnetClientel) {
        this.carnetClientel = carnetClientel;
    }

    public String visualiserCarnetClientel() {
        return carnetClientel.toString();
    }
}
