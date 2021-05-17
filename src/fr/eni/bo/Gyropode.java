
/**
 * Classe concrète Gyropode qui permet de construire des instance de type Gyropode
 * @author echamaillard2021
 */

package fr.eni.bo;

import java.time.LocalDate;

public class Gyropode extends Gyro {

    private float tailleMini;

    /**
     * Constructeur de l'instance Gyropode
     * Constructeur du parent Gyro :
     *  @param marque
     *  @param dateAchat
     *  @param autonomie
     *  Attribut de l'instance supplémentaire :
     *  @param tailleMini
     */
    public Gyropode(String marque, LocalDate dateAchat, int autonomie, float tailleMini, float tarif) {
        super("Gyropode", marque, dateAchat, autonomie, tarif);
        this.tailleMini = tailleMini;
    }

    @Override
    public String toString() {
        return super.toString() +
                this.autonomie + " km d'autonomie " + "[" +
                (int)Math.floor(this.tailleMini)  +"m" + (int)((this.tailleMini-1) *10) + "] " +
                String.format("%.2f",this.tarif) + " €/heure"
                ;
    }
}
