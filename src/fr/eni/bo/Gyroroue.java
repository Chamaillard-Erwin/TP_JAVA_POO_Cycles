
/**
 * Classe concrète Gyroroue qui permet de construire des instance de type Gyroroue
 * @author echamaillard2021
 */

package fr.eni.bo;

import java.time.LocalDate;

public class Gyroroue extends Gyro {

    /**
     * Reprend le constructeur du parent Gyro
     * @param marque
     * @param dateAchat
     * @param autonomie
     */
    public Gyroroue(String marque, LocalDate dateAchat, int autonomie, float tarif) {
        super("Gyroroue", marque, dateAchat, autonomie, tarif);
    }

    @Override
    public String toString() {
        return super.toString() +
                this.autonomie + " km d'autonomie " +
                String.format("%.2f",this.tarif) + " €/heure"
               ;
    }
}
